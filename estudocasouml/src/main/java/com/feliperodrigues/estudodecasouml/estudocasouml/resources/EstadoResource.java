package com.feliperodrigues.estudodecasouml.estudocasouml.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feliperodrigues.estudodecasouml.estudocasouml.entities.Estado;
import com.feliperodrigues.estudodecasouml.estudocasouml.services.EstadoService;

@RestController
@RequestMapping(value = "/estados")
public class EstadoResource {

	@Autowired
	private EstadoService estadoService;
	
	@GetMapping
	public ResponseEntity<List<Estado>> findAll(){
		List<Estado> obj = estadoService.findAll();
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Estado>> findById(@PathVariable Integer id){
		Estado obj = estadoService.findById(id);
        return ResponseEntity.ok().body(Optional.ofNullable(obj));
    }
}
