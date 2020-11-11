package com.jogo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jogo.model.Jogo;

public interface iJogoRepository extends JpaRepository<Jogo, Long>{

	@Query(nativeQuery = true,value = "select id,nome,preco,categoria_id from jogo where nome like %:nome%")
	List<Jogo> findByNome(String nome);
	
}
