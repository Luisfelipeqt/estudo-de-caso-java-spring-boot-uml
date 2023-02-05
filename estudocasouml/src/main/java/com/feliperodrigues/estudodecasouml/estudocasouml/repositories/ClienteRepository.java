package com.feliperodrigues.estudodecasouml.estudocasouml.repositories;

import com.feliperodrigues.estudodecasouml.estudocasouml.entities.Categoria;
import com.feliperodrigues.estudodecasouml.estudocasouml.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
