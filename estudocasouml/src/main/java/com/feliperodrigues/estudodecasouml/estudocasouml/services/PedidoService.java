package com.feliperodrigues.estudodecasouml.estudocasouml.services;

import com.feliperodrigues.estudodecasouml.estudocasouml.entities.Categoria;
import com.feliperodrigues.estudodecasouml.estudocasouml.entities.Pedido;
import com.feliperodrigues.estudodecasouml.estudocasouml.repositories.CategoriaRepository;
import com.feliperodrigues.estudodecasouml.estudocasouml.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;


    public List<Pedido> findAll(){
        return pedidoRepository.findAll();
    }

    public Optional<Pedido> findById(Integer id){
        Optional<Pedido> obj = pedidoRepository.findById(id);
        return obj;
    }
}
