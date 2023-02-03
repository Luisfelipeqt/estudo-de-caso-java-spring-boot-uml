package com.feliperodrigues.estudodecasouml.estudocasouml.entities;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "tb_pedido")
public class Pedido implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date instate;

    public Pedido(){
    }

    public Pedido(Integer id, Date instate) {
        this.id = id;
        this.instate = instate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getInstate() {
        return instate;
    }

    public void setInstate(Date instate) {
        this.instate = instate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pedido pedido)) return false;
        return Objects.equals(getId(), pedido.getId()) && Objects.equals(getInstate(), pedido.getInstate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getInstate());
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", instate=" + instate +
                '}';
    }
}
