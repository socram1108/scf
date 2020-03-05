package br.com.inite.scf.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.inite.scf.model.Pais;
import br.com.inite.scf.services.PaisService;
import javassist.tools.rmi.ObjectNotFoundException;

@RestController
@RequestMapping(value = "/pais")
public class PaisController {
	
	@Autowired
	private PaisService service;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Pais> buscar(@PathVariable Integer id) throws ObjectNotFoundException {
		Pais obj = service.buscarPorID(id);
		return ResponseEntity.ok().body(obj);
		
	}
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> inserir(@RequestBody Pais obj){
		obj = service.incluir(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(obj.getID()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> gravar(@RequestBody Pais obj, @PathVariable Integer id) throws ObjectNotFoundException{
		obj.setID(id);
		obj = service.gravar(obj);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Pais>> Buscar() throws ObjectNotFoundException {
		List<Pais> list = service.buscartodos();
		return ResponseEntity.ok().body(list);
	}
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> excluir(@RequestBody Pais obj, @PathVariable Integer id) throws ObjectNotFoundException{
		service.excluir(id);
		return ResponseEntity.noContent().build();
	}

}
