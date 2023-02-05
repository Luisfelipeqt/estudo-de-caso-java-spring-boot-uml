package com.feliperodrigues.estudodecasouml.estudocasouml.repositories;

import com.feliperodrigues.estudodecasouml.estudocasouml.entities.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {
}
