package mx.com.kairos.examen.service;

import java.util.List;

import mx.com.kairos.examen.dto.TvmazeDTO;
import mx.com.kairos.examen.dto.TvmazeShowDTO;
import mx.com.kairos.examen.model.Comments;

public interface TvmazeService {
	
	public List<TvmazeDTO> getShows(String tvParameter);
	public TvmazeShowDTO getShowById(int id);
	public boolean saveComments(Comments element);
	
}
