package br.com.inite.scf.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import br.com.inite.scf.model.Veiculo;
import br.com.inite.scf.repositories.VeiculoRepository;
import br.com.inite.scf.services.exceptions.DataIntegrityException;
import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class VeiculoService {
	
	@Autowired
	VeiculoRepository repo;
	
	public Veiculo buscarPorID(Integer ID) throws ObjectNotFoundException {
		Optional<Veiculo> obj = repo.findById(ID);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id:" + ID + ";Tipo: " + Veiculo.class.getName()));
		
	}
	
	
	public Veiculo incluir(Veiculo obj) {
		obj.setID(null);
		return repo.save(obj);
	}
	
	public Veiculo gravar(Veiculo obj) throws ObjectNotFoundException {
		buscarPorID(obj.getID());
		return repo.save(obj);
	}
	
	public List<Veiculo> buscartodos() throws ObjectNotFoundException {
		return repo.findAll();
	}
	
	public void excluir(Integer ID) throws ObjectNotFoundException {
		buscarPorID(ID);
		try {
				repo.deleteById(ID);
		}
		catch(DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é Possivel Excluir Veiculo");
		}
	}

}
