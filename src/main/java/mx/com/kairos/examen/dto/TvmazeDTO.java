package mx.com.kairos.examen.dto;

import java.io.Serializable;
import java.util.Arrays;

import mx.com.kairos.examen.model.Comments;
import mx.com.kairos.examen.model.Shows;

public class TvmazeDTO implements Serializable {

	public TvmazeDTO() {
	}

	//Constructor que asigna datos a partir de ShowsDTO
	public TvmazeDTO(Shows shows) {
		super();
		this.id = shows.getId();
		this.name = shows.getName();
		this.channel = (shows.getNetwork() != null) ? shows.getNetwork().getName() : shows.getWebChannel().getName();
		this.summary = shows.getSummary();
		this.genres = shows.getGenres();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -5502633866689584337L;

	private int id;
	private String name;
	private String channel;
	private String summary;
	private String[] genres;
	private Comments comment;

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

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String[] getGenres() {
		return genres;
	}

	public void setGenres(String[] genres) {
		this.genres = genres;
	}
	
	

	public Comments getComment() {
		return comment;
	}

	public void setComment(Comments comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "TvmazeDTO [id=" + id + ", name=" + name + ", channel=" + channel + ", summary=" + summary + ", genres="
				+ Arrays.toString(genres) + "]";
	}

}
