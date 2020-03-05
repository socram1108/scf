package br.com.inite.scf.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import br.com.inite.scf.model.Despesa;
import br.com.inite.scf.repositories.DespesaRepository;
import br.com.inite.scf.services.exceptions.DataIntegrityException;
import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class DespesaService {
	
	@Autowired
	DespesaRepository repo;
	
	public Despesa buscarPorID(Integer ID) throws ObjectNotFoundException {
		Optional<Despesa> obj = repo.findById(ID);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id:" + ID + ";Tipo: " + Despesa.class.getName()));
		
	}
	
	
	public Despesa incluir(Despesa obj) {
		obj.setID(null);
		return repo.save(obj);
	}
	
	public Despesa gravar(Despesa obj) throws ObjectNotFoundException {
		buscarPorID(obj.getID());
		return repo.save(obj);
	}
	
	public List<Despesa> buscartodos() throws ObjectNotFoundException {
		return repo.findAll();
	}
	
	public void excluir(Integer ID) throws ObjectNotFoundException {
		buscarPorID(ID);
		try {
				repo.deleteById(ID);
		}
		catch(DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é Possivel Excluir Despesa");
		}
	}

}
