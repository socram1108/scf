package br.com.inite.scf.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.inite.scf.model.Pais;
import br.com.inite.scf.model.repositories.PaisRepository;

@RestController
public class PaisResource {

    @Autowired
    private PaisRepository repo;

    @RequestMapping(value = "/paises", method = RequestMethod.GET)
    public List<Pais> Get() {
        return repo.findAll();
    }

    @RequestMapping(value = "/pais/{id}", method = RequestMethod.GET)
    public ResponseEntity<Pais> GetById(@PathVariable(value = "id") Integer id)
    {
        Optional<Pais> pais = repo.findById(id);
        if(pais.isPresent())
            return new ResponseEntity<Pais>(pais.get(), HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "/pais", method =  RequestMethod.POST)
    public Pais Post(@Validated @RequestBody Pais pais)
    {
        return repo.save(pais);
    }

    @RequestMapping(value = "/pais/{id}", method =  RequestMethod.PUT)
    public ResponseEntity<Pais> Put(@PathVariable(value = "id") Integer id, @Validated @RequestBody Pais newPais)
    {
        Optional<Pais> oldPais = repo.findById(id);
        if(oldPais.isPresent()){
            Pais pais = oldPais.get();
            pais.setNome(newPais.getNome());
            repo.save(pais);
            return new ResponseEntity<Pais>(pais, HttpStatus.OK);
        }
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "/pais/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> Delete(@PathVariable(value = "id") Integer id)
    {
        Optional<Pais> pais = repo.findById(id);
        if(pais.isPresent()){
            repo.delete(pais.get());
            return new ResponseEntity<>(HttpStatus.OK);
        }
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}