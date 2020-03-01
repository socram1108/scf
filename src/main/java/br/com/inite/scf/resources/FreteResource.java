package br.com.inite.scf.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.inite.scf.model.Frete;
import br.com.inite.scf.services.FreteService;

@RestController
@RequestMapping(value = "/frete")
public class FreteResource {
	
	@Autowired
	private FreteService service;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Frete obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
		
	}

}