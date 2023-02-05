package com.feliperodrigues.estudodecasouml.estudocasouml.repositories;

import com.feliperodrigues.estudodecasouml.estudocasouml.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
