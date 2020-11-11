package com.jogo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jogo.model.Categoria;

public interface ICategoriaRepository extends JpaRepository<Categoria,Long> {

	@Query(nativeQuery = true,value = "select id,nome from categoria where nome like %:nome%")
	List<Categoria> findByNome(String nome);
	
}
