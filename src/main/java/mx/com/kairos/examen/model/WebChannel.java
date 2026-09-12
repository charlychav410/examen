package mx.com.kairos.examen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WebChannel {

	@JsonProperty("id")
	private int id;
	
	@JsonProperty("name")
	private String name;
	
	
	@JsonProperty("officialSite")
	private String officialSite;
	
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

	public String getOfficialSite() {
		return officialSite;
	}
	public void setOfficialSite(String officialSite) {
		this.officialSite = officialSite;
	}
	
	
	
}
