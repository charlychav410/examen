package mx.com.kairos.examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.kairos.examen.dto.TvmazeDTO;
import mx.com.kairos.examen.service.TvmazeService;

@RestController
@RequestMapping("/tvmaze")
public class TvmazeController {
	
	@Autowired(required=true)
	TvmazeService service;
 
	/** A- Endpoint search: Crear un endpoint que realice la búsqueda de shows
	 *  a partir de un criterio de búsqueda, retornando un arreglo de shows */
	@GetMapping("/search/{parameter}")
	   public List<TvmazeDTO> getShows(@PathVariable String parameter) {
	     return service.getShows(parameter);
	   }
}
