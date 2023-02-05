package com.feliperodrigues.estudodecasouml.estudocasouml.resources;

import com.feliperodrigues.estudodecasouml.estudocasouml.entities.Cidade;
import com.feliperodrigues.estudodecasouml.estudocasouml.services.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/cidades")
public class CidadeResource {

    @Autowired
    private CidadeService cidadeService;

    @GetMapping
    public ResponseEntity<List<Cidade>> findAll(){
        List<Cidade> obj = cidadeService.findAll();
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Cidade>> findById(@PathVariable Integer id){
        Cidade obj = cidadeService.findById(id);
        return ResponseEntity.ok().body(Optional.ofNullable(obj));
    }


}
