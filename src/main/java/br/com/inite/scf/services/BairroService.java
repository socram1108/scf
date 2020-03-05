package br.com.inite.scf.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import br.com.inite.scf.model.Bairro;
import br.com.inite.scf.repositories.BairroRepository;
import br.com.inite.scf.services.exceptions.DataIntegrityException;
import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class BairroService {
	
	@Autowired
	BairroRepository repo;
	
	public Bairro buscarPorID(Integer ID) throws ObjectNotFoundException {
		Optional<Bairro> obj = repo.findById(ID);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id:" + ID + ";Tipo: " + Bairro.class.getName()));
		
	}
	
	
	public Bairro incluir(Bairro obj) {
		obj.setID(null);
		return repo.save(obj);
	}
	
	public Bairro gravar(Bairro obj) throws ObjectNotFoundException {
		buscarPorID(obj.getID());
		return repo.save(obj);
	}
	
	public List<Bairro> buscartodos() throws ObjectNotFoundException {
		return repo.findAll();
	}
	
	public void excluir(Integer ID) throws ObjectNotFoundException {
		buscarPorID(ID);
		try {
				repo.deleteById(ID);
		}
		catch(DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é Possivel Excluir Bairro");
		}
	}

}
