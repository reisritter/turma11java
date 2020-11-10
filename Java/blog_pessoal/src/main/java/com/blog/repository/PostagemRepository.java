package com.blog.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.blog.model.*;

public interface PostagemRepository extends JpaRepository<PostagemModel,Long> {

	@Query(nativeQuery = true, value="select id,titulo,texto from postagem where titulo like %:titulo%")
	List<PostagemModel> getByTitulo(String titulo);
}
