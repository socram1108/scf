package br.com.inite.scf.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import br.com.inite.scf.model.Logradouro;
import br.com.inite.scf.repositories.LogradouroRepository;
import br.com.inite.scf.services.exceptions.DataIntegrityException;
import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class LogradouroService {
	
	@Autowired
	LogradouroRepository repo;
	
	public Logradouro buscarPorID(Integer ID) throws ObjectNotFoundException {
		Optional<Logradouro> obj = repo.findById(ID);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id:" + ID + ";Tipo: " + Logradouro.class.getName()));
		
	}
	
	
	public Logradouro incluir(Logradouro obj) {
		obj.setID(null);
		return repo.save(obj);
	}
	
	public Logradouro gravar(Logradouro obj) throws ObjectNotFoundException {
		buscarPorID(obj.getID());
		return repo.save(obj);
	}
	
	public List<Logradouro> buscartodos() throws ObjectNotFoundException {
		return repo.findAll();
	}
	
	public void excluir(Integer ID) throws ObjectNotFoundException {
		buscarPorID(ID);
		try {
				repo.deleteById(ID);
		}
		catch(DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é Possivel Excluir Logradouro");
		}
	}

}
