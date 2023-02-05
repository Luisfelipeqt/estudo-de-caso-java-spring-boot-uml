package com.feliperodrigues.estudodecasouml.estudocasouml.services;

import com.feliperodrigues.estudodecasouml.estudocasouml.entities.Cliente;
import com.feliperodrigues.estudodecasouml.estudocasouml.repositories.ClienteRepository;
import com.feliperodrigues.estudodecasouml.estudocasouml.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;


    public List<Cliente> findAll(){
        return clienteRepository.findAll();
    }

    public Cliente findById(Integer id){
        Optional<Cliente> obj = clienteRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
