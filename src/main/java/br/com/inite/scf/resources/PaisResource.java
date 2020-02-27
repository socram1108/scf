package br.com.inite.scf.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.inite.scf.model.Pais;
import br.com.inite.scf.services.PaisService;

@RestController
@RequestMapping(value = "/pais")
public class PaisResource {
	
	@Autowired
	private PaisService service;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Pais obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
		
	}

}
