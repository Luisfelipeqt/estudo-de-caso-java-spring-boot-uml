package com.feliperodrigues.estudodecasouml.estudocasouml.entities;

import com.feliperodrigues.estudodecasouml.estudocasouml.enums.TipoCliente;
import jakarta.persistence.*;

import java.util.*;
@Entity
@Table(name = "tb_cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;
    private String email;

    @Column(name = "cpf_ou_cnpj")
    private String cpfouCnpj;
    private Integer  tipo;

    @OneToMany(mappedBy = "cliente")
    private List<Endereco> enderecos = new ArrayList<>();

    @ElementCollection
    @CollectionTable(name = "tb_telefone")
    private Set<String> telefones = new HashSet<>();

    @OneToMany
    @JoinColumn(name = "pedidos_id")
    private List<Pedido> pedidos = new ArrayList<>();

    public Cliente(){
    }

    public Cliente(Integer id, String nome, String email, String cpfouCnpj, TipoCliente tipo) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpfouCnpj = cpfouCnpj;
        this.tipo = tipo.getCod();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpfouCnpj() {
        return cpfouCnpj;
    }

    public void setCpfouCnpj(String cpfouCnpj) {
        this.cpfouCnpj = cpfouCnpj;
    }

    public TipoCliente getTipo() {
        return TipoCliente.toEnum(tipo);
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo.getCod();
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public Set<String> getTelefones() {
        return telefones;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(id, cliente.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
