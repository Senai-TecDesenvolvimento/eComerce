package com.tdesi.senai.loja.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * Classe controladora responsável por gerenciar os endpoints dos usuarios.
 * Utiliza as anotações do Spring Boot para configurar os endpoints REST.
 */
@RestController
@RequestMapping(value= "/usuarios")
public class UsuariosController {

    /**
     * Endpoint para testar UsuariosController.
     * Mapeia uma solicitação GET para a URL /usuarios/usuario e retorna uma mensagem de confirmação.
     *
     * @return ResponseEntity contendo uma mensagem de confirmação.
     */
    @RequestMapping(method = RequestMethod.GET, value="usuario")
    public ResponseEntity<String> teste() {

        return ResponseEntity.ok("OK from ['UsuariosController'] ");
    }    

}
