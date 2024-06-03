package com.tdesi.senai.loja.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity(name = "pedidos_has_produtos")
@IdClass(Pedidos_has_Produtos_Id.class)
public class Pedidos_has_Produtos {
    
    // Atributos da classe 'Pedidos_has_Produtos'
    @Id
    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;

    @Id
    @ManyToOne 
    @JoinColumn(name = "produto_id")
    Produto produto;


    // Construtor completo da classe 'Pedidos_has_Produtos'
    public Pedidos_has_Produtos() {}


    // Construtor completo da classe 'Pedidos_has_Produtos'
    public Pedidos_has_Produtos(Pedido pedido, Produto produto) {
        this.pedido = pedido;
        this.produto = produto;
    }

   
    // Getters e setters da classe 'Pedidos_has_Produtos'
    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

}
