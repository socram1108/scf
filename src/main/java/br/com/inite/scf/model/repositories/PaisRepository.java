package br.com.inite.scf.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.inite.scf.model.Pais;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Integer>{
	
}
