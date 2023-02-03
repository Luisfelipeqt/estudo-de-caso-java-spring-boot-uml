package com.feliperodrigues.estudodecasouml.estudocasouml.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoResource {

    @GetMapping
    public String findAll(){
        return "Rest está funcionando";
    }
}
