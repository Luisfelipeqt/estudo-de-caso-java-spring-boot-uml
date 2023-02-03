package com.feliperodrigues.estudodecasouml.estudocasouml.resources;

import com.feliperodrigues.estudodecasouml.estudocasouml.entities.Categoria;
import com.feliperodrigues.estudodecasouml.estudocasouml.entities.Pedido;
import com.feliperodrigues.estudodecasouml.estudocasouml.services.CategoriaService;
import com.feliperodrigues.estudodecasouml.estudocasouml.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoResource {

    @Autowired
    private PedidoService pedidoService;


    @GetMapping
    public ResponseEntity<List<Pedido>> findAll(){
        List<Pedido> obj = pedidoService.findAll();
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Pedido>> findById(@PathVariable Integer id){
        Pedido obj = pedidoService.findById(id);
        return ResponseEntity.ok().body(Optional.ofNullable(obj));
    }
}
