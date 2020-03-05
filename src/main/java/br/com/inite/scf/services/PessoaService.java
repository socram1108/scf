package br.com.inite.scf.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import br.com.inite.scf.model.Pessoa;
import br.com.inite.scf.repositories.PessoaRepository;
import br.com.inite.scf.services.exceptions.DataIntegrityException;
import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class PessoaService {
	
	@Autowired
	PessoaRepository repo;
	
	public Pessoa buscarPorID(Integer ID) throws ObjectNotFoundException {
		Optional<Pessoa> obj = repo.findById(ID);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id:" + ID + ";Tipo: " + Pessoa.class.getName()));
		
	}
	
	
	public Pessoa incluir(Pessoa obj) {
		obj.setID(null);
		return repo.save(obj);
	}
	
	public Pessoa gravar(Pessoa obj) throws ObjectNotFoundException {
		buscarPorID(obj.getID());
		return repo.save(obj);
	}
	
	public List<Pessoa> buscartodos() throws ObjectNotFoundException {
		return repo.findAll();
	}
	
	public void excluir(Integer ID) throws ObjectNotFoundException {
		buscarPorID(ID);
		try {
				repo.deleteById(ID);
		}
		catch(DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é Possivel Excluir Pessoa");
		}
	}

}
