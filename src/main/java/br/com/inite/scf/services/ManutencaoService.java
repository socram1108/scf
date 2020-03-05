package br.com.inite.scf.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import br.com.inite.scf.model.Manutencao;
import br.com.inite.scf.repositories.ManutencaoRepository;
import br.com.inite.scf.services.exceptions.DataIntegrityException;
import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class ManutencaoService {
	
	@Autowired
	ManutencaoRepository repo;
	
	public Manutencao buscarPorID(Integer ID) throws ObjectNotFoundException {
		Optional<Manutencao> obj = repo.findById(ID);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id:" + ID + ";Tipo: " + Manutencao.class.getName()));
		
	}
	
	
	public Manutencao incluir(Manutencao obj) {
		obj.setID(null);
		return repo.save(obj);
	}
	
	public Manutencao gravar(Manutencao obj) throws ObjectNotFoundException {
		buscarPorID(obj.getID());
		return repo.save(obj);
	}
	
	public List<Manutencao> buscartodos() throws ObjectNotFoundException {
		return repo.findAll();
	}
	
	public void excluir(Integer ID) throws ObjectNotFoundException {
		buscarPorID(ID);
		try {
				repo.deleteById(ID);
		}
		catch(DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é Possivel Excluir Manutencao");
		}
	}

}
