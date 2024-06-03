package com.tdesi.senai.loja.entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;


@Entity(name = "pedido")
public class Pedido {

    // Atributos da classe 'Pedido'
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Usuario usuario;

    private String feedback;

    private Float total;

    @OneToMany(mappedBy = "pedido")
    private Set<Pedidos_has_Produtos> pedidoHasProdutos;

    // Construtor completo da classe 'Pedido'
    public Pedido(String feedback, Long id, Float total, Usuario usuario) {
        this.feedback = feedback;
        this.id = id;
        this.total = total;
        this.usuario = usuario;
    }


    // Getters e Setters da classe 'Pedido'
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
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

    public Set<Pedidos_has_Produtos> getPedidoHasProdutos() {
        return pedidoHasProdutos;
    }

    public void setPedidoHasProdutos(Set<Pedidos_has_Produtos> pedidoHasProdutos) {
        this.pedidoHasProdutos = pedidoHasProdutos;
    }

}
