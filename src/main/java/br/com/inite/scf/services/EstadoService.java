package br.com.inite.scf.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import br.com.inite.scf.model.Estado;
import br.com.inite.scf.repositories.EstadoRepository;
import br.com.inite.scf.services.exceptions.DataIntegrityException;
import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class EstadoService {
	
	@Autowired
	EstadoRepository repo;
	
	public Estado buscarPorID(Integer ID) throws ObjectNotFoundException {
		Optional<Estado> obj = repo.findById(ID);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id:" + ID + ";Tipo: " + Estado.class.getName()));
		
	}
	
	
	public Estado incluir(Estado obj) {
		obj.setID(null);
		return repo.save(obj);
	}
	
	public Estado gravar(Estado obj) throws ObjectNotFoundException {
		buscarPorID(obj.getID());
		return repo.save(obj);
	}
	
	public List<Estado> buscartodos() throws ObjectNotFoundException {
		return repo.findAll();
	}
	
	public void excluir(Integer ID) throws ObjectNotFoundException {
		buscarPorID(ID);
		try {
				repo.deleteById(ID);
		}
		catch(DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é Possivel Excluir Tipo Vinculado a Estado");
		}
	}

}
