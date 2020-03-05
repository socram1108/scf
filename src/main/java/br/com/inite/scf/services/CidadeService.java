package br.com.inite.scf.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import br.com.inite.scf.model.Cidade;
import br.com.inite.scf.repositories.CidadeRepository;
import br.com.inite.scf.services.exceptions.DataIntegrityException;
import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class CidadeService {
	
	@Autowired
	CidadeRepository repo;
	
	public Cidade buscarPorID(Integer ID) throws ObjectNotFoundException {
		Optional<Cidade> obj = repo.findById(ID);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id:" + ID + ";Tipo: " + Cidade.class.getName()));
		
	}
	
	
	public Cidade incluir(Cidade obj) {
		obj.setID(null);
		return repo.save(obj);
	}
	
	public Cidade gravar(Cidade obj) throws ObjectNotFoundException {
		buscarPorID(obj.getID());
		return repo.save(obj);
	}
	
	public List<Cidade> buscartodos() throws ObjectNotFoundException {
		return repo.findAll();
	}
	
	public void excluir(Integer ID) throws ObjectNotFoundException {
		buscarPorID(ID);
		try {
				repo.deleteById(ID);
		}
		catch(DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é Possivel Excluir Cidade");
		}
	}

}
