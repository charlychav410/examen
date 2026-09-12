package mx.com.kairos.examen.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import mx.com.kairos.examen.model.Externals;
import mx.com.kairos.examen.model.Image;
import mx.com.kairos.examen.model.Links;
import mx.com.kairos.examen.model.Network;
import mx.com.kairos.examen.model.Rating;
import mx.com.kairos.examen.model.Schedule;
import mx.com.kairos.examen.model.WebChannel;

public class TvmazeShowDTO implements Serializable{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1316630789892953485L;
	
	
	@JsonProperty("id")
	private int id;
	@JsonProperty("url")
	private String url;
	@JsonProperty("name")
	private String name;
	@JsonProperty("type")
	private String type;
	@JsonProperty("language")
	private String language;
	@JsonProperty("genres")
	private String[] genres;
	@JsonProperty("status")
	private String status;
	@JsonProperty("runtime")
	private Integer runtime;
	@JsonProperty("averageRuntime")
	private Integer averageRuntime;
	@JsonProperty("premiered")
	private String premiered;
	@JsonProperty("ended")
	private String ended;
	@JsonProperty("officialSite")
	private String officialSite;
	@JsonProperty("schedule")
	private Schedule schedule;
	@JsonProperty("rating")
	private Rating rating;
	@JsonProperty("weight")
	private Integer weight;
	@JsonProperty("network")
	private Network network;
	@JsonProperty("webChannel")
	private WebChannel webChannel;
	@JsonProperty("dvdCountry")
	private String dvdCountry;
	@JsonProperty("externals")
	private Externals externals;
	@JsonProperty("image")
	private Image image;
	@JsonProperty("summary")
	private String summary;
	@JsonProperty("updated")
	private Integer updated;
	@JsonProperty("_links")
	private Links _links;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String[] getGenres() {
		return genres;
	}
	public void setGenres(String[] genres) {
		this.genres = genres;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getRuntime() {
		return runtime;
	}
	public void setRuntime(Integer runtime) {
		this.runtime = runtime;
	}
	public Integer getAverageRuntime() {
		return averageRuntime;
	}
	public void setAverageRuntime(Integer averageRuntime) {
		this.averageRuntime = averageRuntime;
	}
	public String getPremiered() {
		return premiered;
	}
	public void setPremiered(String premiered) {
		this.premiered = premiered;
	}
	public String getEnded() {
		return ended;
	}
	public void setEnded(String ended) {
		this.ended = ended;
	}
	public String getOfficialSite() {
		return officialSite;
	}
	public void setOfficialSite(String officialSite) {
		this.officialSite = officialSite;
	}
	public Schedule getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	public Rating getRating() {
		return rating;
	}
	public void setRating(Rating rating) {
		this.rating = rating;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public Network getNetwork() {
		return network;
	}
	public void setNetwork(Network network) {
		this.network = network;
	}
	public WebChannel getWebChannel() {
		return webChannel;
	}
	public void setWebChannel(WebChannel webChannel) {
		this.webChannel = webChannel;
	}
	public String getDvdCountry() {
		return dvdCountry;
	}
	public void setDvdCountry(String dvdCountry) {
		this.dvdCountry = dvdCountry;
	}
	public Externals getExternals() {
		return externals;
	}
	public void setExternals(Externals externals) {
		this.externals = externals;
	}
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public Integer getUpdated() {
		return updated;
	}
	public void setUpdated(Integer updated) {
		this.updated = updated;
	}
	public Links get_links() {
		return _links;
	}
	public void set_links(Links _links) {
		this._links = _links;
	}
	
	
}
