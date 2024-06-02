package com.tdesi.senai.loja.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity(name = "pedido")
public class Pedido {

    // Atributos da classe 'Pedido'
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private Usuario usuario;

    private String feedback;

    private Float total;


    // Construtor Completo da classe 'Pedido'
    public Pedido(String feedback, long id, Float total, Usuario usuario) {
        this.feedback = feedback;
        this.id = id;
        this.total = total;
        this.usuario = usuario;
    }


    // Getters e Setters da classe 'Pedido'
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getFeedback() {
        return feedback;
    }
    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
    public Float getTotal() {
        return total;
    }
    public void setTotal(Float total) {
        this.total = total;
    }

}
