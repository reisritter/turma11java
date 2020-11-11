package com.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.model.TemaModel;
import com.blog.repository.TemaRepository;

@RestController
@RequestMapping("/tema")
public class TemaController {

	public TemaController() {}

	@Autowired
	TemaRepository rep;
	
	@GetMapping
	public ResponseEntity<List<TemaModel>> getAll()
	{
		return ResponseEntity.ok(rep.findAll());
	}
	
	@GetMapping("/{nome}")
	public ResponseEntity<TemaModel> getByNome(@PathVariable String nome)
	{
		return ResponseEntity.ok(rep.findByNome(nome));
	}
	
	@PostMapping
	public ResponseEntity<TemaModel> post(@RequestBody TemaModel tema)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(rep.save(tema));
	}
	
	@PutMapping
	public ResponseEntity<TemaModel> put(@RequestBody TemaModel tema)
	{
		return ResponseEntity.status(HttpStatus.OK).body(rep.save(tema));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id)
	{
		rep.deleteById(id);
	}
	
}
