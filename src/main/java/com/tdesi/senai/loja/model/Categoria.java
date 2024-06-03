package com.tdesi.senai.loja.model;


public enum Categoria {

    // Constantes enum representando diferentes categorias
    ELETRONICOS("Eletrônicos"),
    ROUPAS("Roupas"),
    LIVROS("Livros"),
    BRINQUEDOS("Brinquedos"),
    ALIMENTOS("Alimentos"),
    OUTROS("Outros");

    // Descrição associada a cada constante
    private final String descricao;

    // Construtor do enum Categoria
    Categoria(String descricao) {
        this.descricao = descricao;
    }

    // Método para obter a descrição da categoria
    public String getDescricao() {
        return descricao;
    }

}
