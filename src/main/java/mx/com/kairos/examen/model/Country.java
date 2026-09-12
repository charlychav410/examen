package mx.com.kairos.examen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Country {

	@JsonProperty("name")
	private String name;
	
	@JsonProperty("code")
	private String code;
	
	@JsonProperty("timezone")
	private String timezone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	
	
	
	
}
