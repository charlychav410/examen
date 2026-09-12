package mx.com.kairos.examen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Links {
	
	@JsonProperty("self")
	private Self self;
	
	@JsonProperty("previousepisode")
	private Previousepisode previousepisode;

	public Self getSelf() {
		return self;
	}

	public void setSelf(Self self) {
		this.self = self;
	}

	public Previousepisode getPreviousepisode() {
		return previousepisode;
	}

	public void setPreviousepisode(Previousepisode previousepisode) {
		this.previousepisode = previousepisode;
	}
	
	

}
