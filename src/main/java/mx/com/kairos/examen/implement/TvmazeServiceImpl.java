package mx.com.kairos.examen.implement;

import java.io.IOException;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import mx.com.kairos.examen.Constants.Constants;
import mx.com.kairos.examen.dto.TvMazeResponseDTO;
import mx.com.kairos.examen.dto.TvmazeDTO;
import mx.com.kairos.examen.dto.TvmazeShowDTO;
import mx.com.kairos.examen.model.Comments;
import mx.com.kairos.examen.service.TvmazeService;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

import org.bson.Document;

@Service
public class TvmazeServiceImpl implements TvmazeService {

	@Value("${api.url.domain}")
	private String domain;

	@Autowired
	RestSendService restService;

	@Autowired
	MongoService mongoConection;

	// Principal, llama restService, obtiene el response y llama el maper y el
	// generador de lista
	public List<TvmazeDTO> getShows(String tvParameter) {
		List<TvmazeDTO> dataResponse = new ArrayList<TvmazeDTO>();
		HttpResponse<String> response;
		try {
			response = restService.getSender(domain + Constants.GET_SHOWS + tvParameter);
			dataResponse.addAll(generateList(response));
			return dataResponse;
		} catch (IOException | InterruptedException e) {
			dataResponse.add(null);
			return dataResponse;
		}
	}

	// Convierte TvMazeResponseDTO a TvmazeDTO y lo agrega a la lista que se regresa
	public List<TvmazeDTO> generateList(HttpResponse<String> dataResponse) {
		List<TvmazeDTO> listResponse = new ArrayList<TvmazeDTO>();
		List<TvMazeResponseDTO> tvMazeList = responseMapper(dataResponse);
		for (TvMazeResponseDTO element : tvMazeList) {
			TvmazeDTO aux = new TvmazeDTO(element.getShow());
			aux.setComment(getComment (String.valueOf(aux.getId())));
			listResponse.add(aux);
		}
		return listResponse;
	}
	
	public Comments getComment(String id) {
		Comments comments = null;
		ObjectMapper mapper = new ObjectMapper();
		Document response = mongoConection.getCommentById(id);
		if (response != null) {
			comments = mapper.convertValue(response, Comments.class);
		}
		return comments;
	}

	// Mapea el objeto recibido de la petición a la API de Tvmaze
	public List<TvMazeResponseDTO> responseMapper(HttpResponse<String> dataResponse) {
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.readValue(dataResponse.body(), new TypeReference<List<TvMazeResponseDTO>>() {
		});
	}

	// Llama al rest service y obtiene el objeto show buscandolo por id mapeado
	@Override
	public TvmazeShowDTO getShowById(int id) {
		TvmazeShowDTO docu = getDocumentById(Integer.toString(id));
		if (docu != null) {
			return docu;
		}
		HttpResponse<String> response;
		try {
			response = restService.getSender(domain + Constants.GET_BY_ID + id);
			return mapperAndInsert(response);
		} catch (IOException | InterruptedException e) {
			return null;
		}
	}
	
	//Mapea el DOcument y lo guarda en mongo
	public TvmazeShowDTO mapperAndInsert(HttpResponse<String> response) {
		ObjectMapper objectMapper = new ObjectMapper();
		TvmazeShowDTO mapped = objectMapper.readValue(response.body(), TvmazeShowDTO.class);
		mongoConection.saveDocument(mapped);
		return mapped;
	}

	//Obtiene el documento en cache
	public TvmazeShowDTO getDocumentById(String id) {
		TvmazeShowDTO tvmazeShowDTO = null;
		ObjectMapper mapper = new ObjectMapper();
		Document response = mongoConection.getShowByID(id);
		if (response != null) {
			tvmazeShowDTO = mapper.convertValue(response, TvmazeShowDTO.class);
		}
		return tvmazeShowDTO;
	}
	
	
	//Guarda los comentarios ligados al id del show
	@Override
	public boolean saveComments(Comments element) {
		return mongoConection.saveComments(element);
	}



}
