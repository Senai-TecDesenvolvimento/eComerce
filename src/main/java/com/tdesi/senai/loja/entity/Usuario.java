package com.tdesi.senai.loja.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity(name = "usuario")
public class Usuario {

    // Atributos da classe 'Usuario'
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;    
    private String email;
    private String cpf;
    private String senha;
    private String cep;
    private String telefone;
    private Integer isAdmin;


    // Construtor completo da classe 'Usuario'
    public Usuario(String cep, String cpf, String email, Long id, Integer isAdmin, String nome, String senha, String telefone) {
        this.cep = cep;
        this.cpf = cpf;
        this.email = email;
        this.id = id;
        this.isAdmin = isAdmin;
        this.nome = nome;
        this.senha = senha;
        this.telefone = telefone;
    }


    // Getters e Setters da classe 'Usuario'
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Integer getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Integer isAdmin) {
        this.isAdmin = isAdmin;
    }

}