package com.feliperodrigues.estudodecasouml.estudocasouml.services;

import com.feliperodrigues.estudodecasouml.estudocasouml.entities.Categoria;
import com.feliperodrigues.estudodecasouml.estudocasouml.entities.Produto;
import com.feliperodrigues.estudodecasouml.estudocasouml.repositories.CategoriaRepository;
import com.feliperodrigues.estudodecasouml.estudocasouml.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;


    public List<Produto> findAll(){
        return produtoRepository.findAll();
    }

    public Optional<Produto> findById( Integer id){
        Optional<Produto> obj = produtoRepository.findById(id);
        return obj;
    }
}
