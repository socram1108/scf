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

import br.com.inite.scf.model.Obrigacao;
import br.com.inite.scf.services.ObrigacaoService;
import javassist.tools.rmi.ObjectNotFoundException;

@RestController
@RequestMapping(value = "/obrigacao")
public class ObrigacaoController {
	
	@Autowired
	private ObrigacaoService service;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Obrigacao> buscar(@PathVariable Integer id) throws ObjectNotFoundException {
		Obrigacao obj = service.buscarPorID(id);
		return ResponseEntity.ok().body(obj);
		
	}
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> inserir(@RequestBody Obrigacao obj){
		obj = service.incluir(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(obj.getID()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> gravar(@RequestBody Obrigacao obj, @PathVariable Integer id) throws ObjectNotFoundException{
		obj.setID(id);
		obj = service.gravar(obj);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Obrigacao>> Buscar() throws ObjectNotFoundException {
		List<Obrigacao> list = service.buscartodos();
		return ResponseEntity.ok().body(list);
	}
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> excluir(@RequestBody Obrigacao obj, @PathVariable Integer id) throws ObjectNotFoundException{
		service.excluir(id);
		return ResponseEntity.noContent().build();
	}

}
