package com.reciclo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.reciclo.model.Produto;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

	//Usar nome da classe e nao da tabela(classe=Produto/Tabela=PRODUTO)
	@Query("SELECT produto_nome FROM Produto")
	List<Produto> findAllByNomeTeste();
	
}
