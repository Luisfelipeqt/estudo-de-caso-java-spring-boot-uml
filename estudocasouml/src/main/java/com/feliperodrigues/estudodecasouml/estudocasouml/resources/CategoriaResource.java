package com.feliperodrigues.estudodecasouml.estudocasouml.resources;

import com.feliperodrigues.estudodecasouml.estudocasouml.entities.Categoria;
import com.feliperodrigues.estudodecasouml.estudocasouml.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    @Autowired
    private CategoriaService categoriaService;


    @GetMapping
    public ResponseEntity<List<Categoria>> findAll(){
        List<Categoria> obj = categoriaService.findAll();
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Categoria>> findById(@PathVariable Integer id){
        Categoria obj = categoriaService.findById(id);
        return ResponseEntity.ok().body(Optional.ofNullable(obj));
    }
}
