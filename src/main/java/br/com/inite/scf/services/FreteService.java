package br.com.inite.scf.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import br.com.inite.scf.model.Frete;
import br.com.inite.scf.repositories.FreteRepository;
import br.com.inite.scf.services.exceptions.DataIntegrityException;
import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class FreteService {
	
	@Autowired
	FreteRepository repo;
	
	public Frete buscarPorID(Integer ID) throws ObjectNotFoundException {
		Optional<Frete> obj = repo.findById(ID);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto n�o encontrado! Id:" + ID + ";Tipo: " + Frete.class.getName()));
		
	}
	
	
	public Frete incluir(Frete obj) {
		obj.setID(null);
		return repo.save(obj);
	}
	
	public Frete gravar(Frete obj) throws ObjectNotFoundException {
		buscarPorID(obj.getID());
		return repo.save(obj);
	}
	
	public List<Frete> buscartodos() throws ObjectNotFoundException {
		return repo.findAll();
	}
	
	public void excluir(Integer ID) throws ObjectNotFoundException {
		buscarPorID(ID);
		try {
				repo.deleteById(ID);
		}
		catch(DataIntegrityViolationException e) {
			throw new DataIntegrityException("N�o � Possivel Excluir Frete");
		}
	}

}
