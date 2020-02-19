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

import br.com.inite.scf.model.Cidade;
import br.com.inite.scf.model.repositories.CidadeRepository;

@RestController
public class CidadeResource {
	
	@Autowired
    private CidadeRepository cidadeRepository;

    @RequestMapping(value = "/cidade", method = RequestMethod.GET)
    public List<Cidade> Get() {
        return cidadeRepository.findAll();
    }

    @RequestMapping(value = "/cidade/{id}", method = RequestMethod.GET)
    public ResponseEntity<Cidade> GetById(@PathVariable(value = "id") Integer id)
    {
        Optional<Cidade> cidade = cidadeRepository.findById(id);
        if(cidade.isPresent())
            return new ResponseEntity<Cidade>(cidade.get(), HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "/cidade", method =  RequestMethod.POST)
    public Cidade Post(@Validated @RequestBody Cidade cidade)
    {
        return cidadeRepository.save(cidade);
    }

    @RequestMapping(value = "/cidade/{id}", method =  RequestMethod.PUT)
    public ResponseEntity<Cidade> Put(@PathVariable(value = "id") Integer id, @Validated @RequestBody Cidade newCidade)
    {
        Optional<Cidade> oldCidade = cidadeRepository.findById(id);
        if(oldCidade.isPresent()){
            Cidade cidade = oldCidade.get();
            cidade.setNome(newCidade.getNome());
            cidadeRepository.save(cidade);
            return new ResponseEntity<Cidade>(cidade, HttpStatus.OK);
        }
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "/cidade/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> Delete(@PathVariable(value = "id") Integer id)
    {
        Optional<Cidade> cidade = cidadeRepository.findById(id);
        if(cidade.isPresent()){
            cidadeRepository.delete(cidade.get());
            return new ResponseEntity<>(HttpStatus.OK);
        }
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}

