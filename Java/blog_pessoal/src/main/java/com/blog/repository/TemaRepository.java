package com.blog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.model.TemaModel;

public interface TemaRepository extends JpaRepository<TemaModel,Long> {

	TemaModel findByNome(String nome);
	
}
