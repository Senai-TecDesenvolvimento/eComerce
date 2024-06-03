package com.tdesi.senai.loja.entity;

import java.io.Serializable;
import java.util.Objects;


/**
 * Classe que representa a chave composta para a entidade 'Pedidos_has_Produtos'.
 * Esta classe é necessária para identificar exclusivamente cada relação entre 'Pedido' e 'Produto'.
 */
public class Pedidos_has_Produtos_Id implements Serializable {

    // Atributos da classe 'Pedido_has_Produtos_Id'
    private Long pedido; // Representa a chave do pedido
    private Long produto; // Representa a chave do produto
    

    // Construtor vazio da classe 'Pedido_has_Produtos_Id'
    // Necessário para o funcionamento do JPA.
    public Pedidos_has_Produtos_Id() {} 


    // Construtor completo da classe 'Pedido_has_produtos_id'
    // Necessário para inicializar 'PedidosHasProdutosId' com os valores de pedido e produto.
    public Pedidos_has_Produtos_Id(Long pedido, Long produto) {
        this.pedido = pedido;
        this.produto = produto;
    }


    // Getters e Setters da classe 'Pedido_has_Produtos_Id'
    public Long getPedido() {
        return pedido;
    }

    public void setPedido(Long pedido) {
        this.pedido = pedido;
    }

    public Long getProduto() {
        return produto;
    }

    public void setProduto(Long produto) {
        this.produto = produto;
    }


    // Verifica se dois objetos 'PedidosHasProdutosId' são iguais.
    // true se forem iguais, caso contrário false..
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pedidos_has_Produtos_Id that = (Pedidos_has_Produtos_Id) o;
        return Objects.equals(pedido, that.pedido) &&
               Objects.equals(produto, that.produto);
    }


    // Calcula o código hash do objeto.
    // Necessário para 'equals()'..
    @Override
    public int hashCode() {
        return Objects.hash(pedido, produto);
    }

}