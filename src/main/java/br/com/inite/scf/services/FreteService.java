package br.com.inite.scf.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.inite.scf.model.Frete;
import br.com.inite.scf.repositories.FreteRepository;

@Service
public class FreteService {
	
	@Autowired
	FreteRepository repo;
	
	public Frete buscar(Integer ID) {
		
		Optional<Frete> obj = repo.findById(ID);
		return obj.orElse(null);
		
	}

}
