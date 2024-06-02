package com.tdesi.senai.loja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.tdesi.senai.loja.entity.Pedido;


/**
 * Interface 'PedidoRepository'
 * Esta interface extende JpaRepository para fornecer operações CRUD padrão para a entidade Pedido.
 */
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    
    //@Query(value = "select p from Pedido p where p.id = ?1")
    @Query(value = "select id from pedido")
    public Pedido getPedido(Long id);

}
