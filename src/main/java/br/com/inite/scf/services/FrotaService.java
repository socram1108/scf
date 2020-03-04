package br.com.inite.scf.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.inite.scf.model.Frota;
import br.com.inite.scf.repositories.FrotaRepository;

@Service
public class FrotaService {
	
	@Autowired
	FrotaRepository repo;
	
	public Frota buscar(Integer ID) {
		
		Optional<Frota> obj = repo.findById(ID);
		return obj.orElse(null);
		
	}

}
