package br.com.inite.scf.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import br.com.inite.scf.model.TipoLogradouro;
import br.com.inite.scf.repositories.TipoLogradouroRepository;
import br.com.inite.scf.services.exceptions.DataIntegrityException;
import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class TipoLogradouroService {
	
	@Autowired
	TipoLogradouroRepository repo;
	
	public TipoLogradouro buscarPorID(Integer ID) throws ObjectNotFoundException {
		Optional<TipoLogradouro> obj = repo.findById(ID);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id:" + ID + ";Tipo: " + TipoLogradouro.class.getName()));
		
	}
	
	
	public TipoLogradouro incluir(TipoLogradouro obj) {
		obj.setID(null);
		return repo.save(obj);
	}
	
	public TipoLogradouro gravar(TipoLogradouro obj) throws ObjectNotFoundException {
		buscarPorID(obj.getID());
		return repo.save(obj);
	}
	
	public List<TipoLogradouro> buscartodos() throws ObjectNotFoundException {
		return repo.findAll();
	}
	
	public void excluir(Integer ID) throws ObjectNotFoundException {
		buscarPorID(ID);
		try {
				repo.deleteById(ID);
		}
		catch(DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é Possivel Excluir TipoLogradouro");
		}
	}

}
