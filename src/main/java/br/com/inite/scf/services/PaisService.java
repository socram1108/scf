package br.com.inite.scf.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.inite.scf.model.Pais;
import br.com.inite.scf.model.repositories.PaisRepository;

@Service
public class PaisService {
	
	@Autowired
	private PaisRepository repo;
	
	public Pais buscar(int ID) {
		Optional<Pais> obj = repo.findById(ID);
		return obj.orElse(null);
		
	}

}
