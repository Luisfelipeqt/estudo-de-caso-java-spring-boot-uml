package com.feliperodrigues.estudodecasouml.estudocasouml.repositories;

import com.feliperodrigues.estudodecasouml.estudocasouml.entities.Cliente;
import com.feliperodrigues.estudodecasouml.estudocasouml.entities.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
}
