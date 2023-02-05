package com.feliperodrigues.estudodecasouml.estudocasouml.resources;

import com.feliperodrigues.estudodecasouml.estudocasouml.entities.Cliente;
import com.feliperodrigues.estudodecasouml.estudocasouml.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {

    @Autowired
    private ClienteService clienteService;


    @GetMapping
    public ResponseEntity<List<Cliente>> findAll(){
        List<Cliente> obj = clienteService.findAll();
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Cliente> findById(@PathVariable Integer id){
        Cliente obj = clienteService.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
