package mx.com.kairos.examen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Shows {
	
	@JsonProperty("id")
	private int id;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("genres")
	private String[] genres;
	
	@JsonProperty("summary")
	private String summary;
	
	@JsonProperty("network")
	private Network network;
	
	@JsonProperty("webChannel")
	private WebChannel webChannel;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getGenres() {
		return genres;
	}
	public void setGenres(String[] genres) {
		this.genres = genres;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
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
		

}
