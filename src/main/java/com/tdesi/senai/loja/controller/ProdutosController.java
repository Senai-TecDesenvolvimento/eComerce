package com.tdesi.senai.loja.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * Classe controladora responsável por gerenciar os endpoints dos produtos.
 * Utiliza as anotações do Spring Boot para configurar os endpoints REST.
 */
@RestController
@RequestMapping(value= "/produtos")
public class ProdutosController {

    /**
     * Endpoint para testar ProdutosController.
     * Mapeia uma solicitação GET para a URL /produtos/produto e retorna uma mensagem de confirmação.
     *
     * @return ResponseEntity contendo uma mensagem de confirmação.
     */
    @RequestMapping(method = RequestMethod.GET, value="produto")
    public ResponseEntity<String> teste() {

        return ResponseEntity.ok("OK from ['ProdutosController'] ");
    }    

}
