package br.com.inite.scf.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.inite.scf.model.Pais;
import br.com.inite.scf.repositories.PaisRepository;
import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class PaisService {
	
	@Autowired
	PaisRepository repo;
	
	public Pais buscarPorID(Integer ID) throws ObjectNotFoundException {
		Optional<Pais> obj = repo.findById(ID);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id:" + ID + ";Tipo: " + Pais.class.getName()));
		
	}
	
	
	public Pais inserirPais(Pais obj) {
		obj.setID(null);
		return repo.save(obj);
	}
	
	public Pais gravarPais(Pais obj) throws ObjectNotFoundException {
		buscarPorID(obj.getID());
		return repo.save(obj);
	}
	
	public List<Pais> buscarPaises() throws ObjectNotFoundException {
		return repo.findAll();
	}

}
