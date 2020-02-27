package br.com.inite.scf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.inite.scf.model.Frete;

@Repository
public interface FreteRepository extends JpaRepository<Frete, Integer>{

}
