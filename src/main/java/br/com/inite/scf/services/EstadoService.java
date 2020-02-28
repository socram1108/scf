package br.com.inite.scf.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.inite.scf.model.Estado;
import br.com.inite.scf.repositories.EstadoRepository;

@Service
public class EstadoService {
	
	@Autowired
	EstadoRepository repo;
	
	public Estado buscar(Integer ID) {
		
		Optional<Estado> obj = repo.findById(ID);
		return obj.orElse(null);
		
	}

}
