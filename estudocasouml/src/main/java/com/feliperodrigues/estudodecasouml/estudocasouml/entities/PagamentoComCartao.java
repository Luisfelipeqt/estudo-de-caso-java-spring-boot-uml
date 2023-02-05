package com.feliperodrigues.estudodecasouml.estudocasouml.entities;

import com.feliperodrigues.estudodecasouml.estudocasouml.enums.EstadoPagamento;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serial;

@Entity
@Table(name = "tb_pagamento_cartao")
public class PagamentoComCartao extends Pagamento {
    @Serial
    private static final long serialVersionUID = 1L;

    private Integer numeroDeParcelas;

    public PagamentoComCartao(){
    }

    public PagamentoComCartao(Integer numeroDeParcelas) {
        this.numeroDeParcelas = numeroDeParcelas;
    }

    public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroDeParcelas) {
        super(id, estado, pedido);
        this.numeroDeParcelas = numeroDeParcelas;
    }

    public Integer getNumeroDeParcelas() {
        return numeroDeParcelas;
    }

    public void setNumeroDeParcelas(Integer numeroDeParcelas) {
        this.numeroDeParcelas = numeroDeParcelas;
    }
}
