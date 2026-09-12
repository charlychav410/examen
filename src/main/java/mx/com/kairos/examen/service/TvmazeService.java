package mx.com.kairos.examen.service;

import java.util.List;

import mx.com.kairos.examen.dto.TvmazeDTO;

public interface TvmazeService {
	
	public List<TvmazeDTO> getShows(String tvParameter);

}
