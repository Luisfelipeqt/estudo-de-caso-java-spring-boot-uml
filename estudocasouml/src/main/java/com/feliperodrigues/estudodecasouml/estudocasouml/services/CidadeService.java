package com.feliperodrigues.estudodecasouml.estudocasouml.services;

import com.feliperodrigues.estudodecasouml.estudocasouml.entities.Cidade;
import com.feliperodrigues.estudodecasouml.estudocasouml.repositories.CidadeRepository;
import com.feliperodrigues.estudodecasouml.estudocasouml.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;


    public List<Cidade> findAll(){
        return cidadeRepository.findAll();
    }

    public Cidade findById(Integer id){
        Optional<Cidade> obj = cidadeRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado!"));
    }
}