package mx.com.kairos.examen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Externals {
	
	@JsonProperty("tvrage")
	private Integer tvrage;
	@JsonProperty("thetvdb")
	private Integer thetvdb;
	@JsonProperty("imdb")
	private String imdb;
	
	
	public Integer getTvrage() {
		return tvrage;
	}
	public void setTvrage(Integer tvrage) {
		this.tvrage = tvrage;
	}
	public Integer getThetvdb() {
		return thetvdb;
	}
	public void setThetvdb(Integer thetvdb) {
		this.thetvdb = thetvdb;
	}
	public String getImdb() {
		return imdb;
	}
	public void setImdb(String imdb) {
		this.imdb = imdb;
	}
	
	

}
