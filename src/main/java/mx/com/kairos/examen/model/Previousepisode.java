package mx.com.kairos.examen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Previousepisode {
	
	@JsonProperty("href")
	private String href;
	
	@JsonProperty("name")
	private String name;

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
