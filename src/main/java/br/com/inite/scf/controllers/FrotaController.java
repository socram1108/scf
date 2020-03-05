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

import br.com.inite.scf.model.Frota;
import br.com.inite.scf.services.FrotaService;
import javassist.tools.rmi.ObjectNotFoundException;

@RestController
@RequestMapping(value = "/frota")
public class FrotaController {
	
	@Autowired
	private FrotaService service;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Frota> buscar(@PathVariable Integer id) throws ObjectNotFoundException {
		Frota obj = service.buscarPorID(id);
		return ResponseEntity.ok().body(obj);
		
	}
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> inserir(@RequestBody Frota obj){
		obj = service.incluir(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(obj.getID()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> gravar(@RequestBody Frota obj, @PathVariable Integer id) throws ObjectNotFoundException{
		obj.setID(id);
		obj = service.gravar(obj);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Frota>> Buscar() throws ObjectNotFoundException {
		List<Frota> list = service.buscartodos();
		return ResponseEntity.ok().body(list);
	}
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> excluir(@RequestBody Frota obj, @PathVariable Integer id) throws ObjectNotFoundException{
		service.excluir(id);
		return ResponseEntity.noContent().build();
	}

}
