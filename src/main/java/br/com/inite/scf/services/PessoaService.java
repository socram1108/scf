package br.com.inite.scf.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.inite.scf.model.Pessoa;
import br.com.inite.scf.repositories.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	PessoaRepository repo;
	
	public Pessoa buscar(Integer ID) {
		
		Optional<Pessoa> obj = repo.findById(ID);
		return obj.orElse(null);
		
	}

}
