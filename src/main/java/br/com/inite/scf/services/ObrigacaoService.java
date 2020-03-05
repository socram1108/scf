package br.com.inite.scf.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import br.com.inite.scf.model.Obrigacao;
import br.com.inite.scf.repositories.ObrigacaoRepository;
import br.com.inite.scf.services.exceptions.DataIntegrityException;
import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class ObrigacaoService {
	
	@Autowired
	ObrigacaoRepository repo;
	
	public Obrigacao buscarPorID(Integer ID) throws ObjectNotFoundException {
		Optional<Obrigacao> obj = repo.findById(ID);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id:" + ID + ";Tipo: " + Obrigacao.class.getName()));
		
	}
	
	
	public Obrigacao incluir(Obrigacao obj) {
		obj.setID(null);
		return repo.save(obj);
	}
	
	public Obrigacao gravar(Obrigacao obj) throws ObjectNotFoundException {
		buscarPorID(obj.getID());
		return repo.save(obj);
	}
	
	public List<Obrigacao> buscartodos() throws ObjectNotFoundException {
		return repo.findAll();
	}
	
	public void excluir(Integer ID) throws ObjectNotFoundException {
		buscarPorID(ID);
		try {
				repo.deleteById(ID);
		}
		catch(DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é Possivel Excluir Obrigacao");
		}
	}

}
