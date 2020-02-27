package br.com.inite.scf.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.inite.scf.model.Cidade;
import br.com.inite.scf.repositories.CidadeRepository;

@Service
public class CidadeService {
	
	@Autowired
	CidadeRepository repo;
	
	public Cidade buscar(Integer ID) {
		
		Optional<Cidade> obj = repo.findById(ID);
		return obj.orElse(null);
		
	}

}
