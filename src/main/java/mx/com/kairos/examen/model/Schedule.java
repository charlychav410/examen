package mx.com.kairos.examen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Schedule {
	
	@JsonProperty("time")
	private String time;
	
	@JsonProperty("days")
	private String[] days;

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String[] getDays() {
		return days;
	}

	public void setDays(String[] days) {
		this.days = days;
	}
	
	

}
