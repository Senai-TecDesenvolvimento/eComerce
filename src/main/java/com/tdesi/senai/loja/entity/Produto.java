package com.tdesi.senai.loja.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import com.tdesi.senai.loja.model.Categoria;


@Entity(name = "produto")
public class Produto {

    // Atributos da classe 'Produto'
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    private Integer quantidade;

    private String outros;

    private Float preco;

    @Enumerated(EnumType.STRING)
    private Categoria categoria;


    // Construtor completo da classe 'Produto'
    public Produto(Categoria categoria, String descricao, Long id, String outros, Float preco, Integer quantidade) {
        this.categoria = categoria;
        this.descricao = descricao;
        this.id = id;
        this.outros = outros;
        this.preco = preco;
        this.quantidade = quantidade;
    }


    // Getters e Setters da classe 'Produto'
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getOutros() {
        return outros;
    }

    public void setOutros(String outros) {
        this.outros = outros;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

}
