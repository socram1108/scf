package br.com.inite.scf.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.inite.scf.model.Estado;
import br.com.inite.scf.model.repositories.EstadoRepository;

@Service
public class EstadoService {
	
	@Autowired
	private EstadoRepository repo;
	
	public Estado buscar(int ID) {
		Optional<Estado> obj = repo.findById(ID);
		return obj.orElse(null);
		
	}

}
