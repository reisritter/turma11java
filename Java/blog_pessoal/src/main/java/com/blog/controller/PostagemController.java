package com.blog.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.model.PostagemModel;
import com.blog.repository.PostagemRepository;

@RestController
@RequestMapping("/postagem")
public class PostagemController {	
	
	@Autowired
	PostagemRepository pos;
	
	@GetMapping("/all")
	public ResponseEntity<List<PostagemModel>> findAll()
	{
		return ResponseEntity.ok(pos.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<PostagemModel>> findById(@PathVariable long id)
	{
		return ResponseEntity.ok(pos.findById(id));
	}
	
	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<List<PostagemModel>> getTitulo(@PathVariable String titulo)
	{
		return ResponseEntity.ok(pos.getByTitulo(titulo));
	}
	
	@PostMapping
	public ResponseEntity<PostagemModel> post(@RequestBody PostagemModel posModel)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(pos.save(posModel));
	}

}
