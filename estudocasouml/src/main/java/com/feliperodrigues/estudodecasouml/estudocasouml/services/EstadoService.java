package com.feliperodrigues.estudodecasouml.estudocasouml.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feliperodrigues.estudodecasouml.estudocasouml.entities.Estado;
import com.feliperodrigues.estudodecasouml.estudocasouml.repositories.EstadoRepository;
import com.feliperodrigues.estudodecasouml.estudocasouml.services.exceptions.ObjectNotFoundException;

@Service
public class EstadoService {
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	public List<Estado> findAll(){
		return estadoRepository.findAll();
	}
	
	public Estado findById(Integer id) {
        Optional<Estado> obj = estadoRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

}
