package com.tdesi.senai.loja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.tdesi.senai.loja.entity.Usuario;


/**
 * Interface 'UsuarioRepository'
 * Esta interface extende JpaRepository para fornecer operações CRUD padrão para a entidade Usuario.
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
    //@Query(value = "select u from Usuario u where u.id = ?1")
    @Query(value = "select id from usuario")
    public Usuario getUsuario(Long id);

}
