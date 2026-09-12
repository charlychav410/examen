package mx.com.kairos.examen.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import mx.com.kairos.examen.model.Shows;

public class TvMazeResponseDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3894327969485581185L;

	@JsonProperty("score")
	private double score;
	
	@JsonProperty("show")
	private Shows show;

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public Shows getShow() {
		return show;
	}

	public void setShow(Shows show) {
		this.show = show;
	}

}
