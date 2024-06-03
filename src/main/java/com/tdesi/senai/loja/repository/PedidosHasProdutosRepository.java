package com.tdesi.senai.loja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.tdesi.senai.loja.entity.Pedidos_has_Produtos;
import com.tdesi.senai.loja.entity.Pedidos_has_Produtos_Id;


public interface PedidosHasProdutosRepository extends JpaRepository<Pedidos_has_Produtos, Pedidos_has_Produtos_Id>{

    @Query(value = "select id from pedidos_has_produtos")
    public Pedidos_has_Produtos getPedidoHasProdutos();

}
