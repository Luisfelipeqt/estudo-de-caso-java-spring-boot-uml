package com.feliperodrigues.estudodecasouml.estudocasouml.resources;

import com.feliperodrigues.estudodecasouml.estudocasouml.entities.Categoria;
import com.feliperodrigues.estudodecasouml.estudocasouml.entities.Pedido;
import com.feliperodrigues.estudodecasouml.estudocasouml.entities.Produto;
import com.feliperodrigues.estudodecasouml.estudocasouml.services.CategoriaService;
import com.feliperodrigues.estudodecasouml.estudocasouml.services.PedidoService;
import com.feliperodrigues.estudodecasouml.estudocasouml.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoResource {

    @Autowired
    private ProdutoService produtoService;


    @GetMapping
    public ResponseEntity<List<Produto>> findAll(){
        List<Produto> obj = produtoService.findAll();
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Produto>> findById(@PathVariable Integer id){
        Produto obj = produtoService.findById(id);
        return ResponseEntity.ok().body(Optional.ofNullable(obj));
    }
}
