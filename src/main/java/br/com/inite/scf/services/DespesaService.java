package br.com.inite.scf.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.inite.scf.model.Despesa;
import br.com.inite.scf.repositories.DespesaRepository;

@Service
public class DespesaService {
	
	@Autowired
	DespesaRepository repo;
	
	public Despesa buscar(Integer ID) {
		
		Optional<Despesa> obj = repo.findById(ID);
		return obj.orElse(null);
		
	}

}
