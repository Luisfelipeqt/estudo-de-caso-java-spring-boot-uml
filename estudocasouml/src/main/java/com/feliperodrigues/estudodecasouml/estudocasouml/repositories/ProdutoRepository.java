package com.feliperodrigues.estudodecasouml.estudocasouml.repositories;

import com.feliperodrigues.estudodecasouml.estudocasouml.entities.Categoria;
import com.feliperodrigues.estudodecasouml.estudocasouml.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
