package mx.com.kairos.examen.implement;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.bson.Document;
import org.springframework.stereotype.Service;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.InsertOneResult;

import mx.com.kairos.examen.Constants.Constants;
import mx.com.kairos.examen.dto.TvmazeShowDTO;
import mx.com.kairos.examen.model.Comments;
import tools.jackson.databind.ObjectMapper;


@Service
public class MongoService {


	private MongoCollection<Document> collection;
	private MongoCollection<Document> collectionComment;

	public MongoService() {

		MongoClient mongoClient = MongoClients.create(Constants.MONGO_CONNECTION);
		MongoDatabase database = mongoClient.getDatabase("tvmaze");
		this.collection = database.getCollection("shows");
		this.collectionComment = database.getCollection("comments");
	}

//crea la caché con tiempo de vida de 10 min y una cantidad maxima de request de 1000
	private final Cache<String, Document> showCache = Caffeine.newBuilder().expireAfterWrite(10, TimeUnit.MINUTES)
			.maximumSize(1000).build();

//Obtiene el documento show por id
	public Document getShowByID(String id) {
		Document cachedShow = showCache.getIfPresent(id);
		if (cachedShow != null) {
			return cachedShow;
		}

		Document shows = collection.find(Filters.eq("_id", Integer.parseInt(id))).first();
		if (shows != null) {
			showCache.put(id, shows);
		}
		return shows;
	}
	
	public void saveDocument(TvmazeShowDTO element) {
		ObjectMapper mapper = new ObjectMapper();
		Map<String, TvmazeShowDTO> map = mapper.convertValue(element, Map.class);
		Document document = new Document(map);
		collection.insertOne(document);
		showCache.put(String.valueOf(element.getId()), document);
	}
	
	public boolean saveComments(Comments element) {
		ObjectMapper mapper = new ObjectMapper();
		Map<String, Comments> map = mapper.convertValue(element, Map.class);
		Document document = new Document(map);
		InsertOneResult result = collectionComment.insertOne(document);
		return result.wasAcknowledged();
	}
	
	public Document getCommentById(String id) {
		Document shows = collectionComment.find(Filters.eq("_id", id)).first();
		return shows;
	}

}
