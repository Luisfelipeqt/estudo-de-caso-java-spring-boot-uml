package com.feliperodrigues.estudodecasouml.estudocasouml.services;

import com.feliperodrigues.estudodecasouml.estudocasouml.entities.Categoria;
import com.feliperodrigues.estudodecasouml.estudocasouml.repositories.CategoriaRepository;
import com.feliperodrigues.estudodecasouml.estudocasouml.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;


    public List<Categoria> findAll(){
        return categoriaRepository.findAll();
    }


    public Categoria findById(Integer id) {
        Optional<Categoria> obj = categoriaRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }


}
