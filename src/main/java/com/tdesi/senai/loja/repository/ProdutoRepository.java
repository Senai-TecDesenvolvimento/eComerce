package com.tdesi.senai.loja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.tdesi.senai.loja.entity.Produto;


/**
 * Interface 'ProdutoRepository'
 * Esta interface extende JpaRepository para fornecer operações CRUD padrão para a entidade Produto.
 */
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    
    @Query(value = "select p from Produto p where p.id = ?1")
    public Produto getProduto(Long id);

}