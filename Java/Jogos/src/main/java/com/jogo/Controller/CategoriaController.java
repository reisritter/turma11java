package com.jogo.Controller;

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

import com.jogo.model.Categoria;
import com.jogo.repository.ICategoriaRepository;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

	@Autowired
	ICategoriaRepository iCategoria;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> getAll()
	{
		return ResponseEntity.ok(iCategoria.findAll());
	}
	
	@GetMapping("/all")
	public List<Categoria> getAllList()
	{
		return iCategoria.findAll();
	}
	
	@GetMapping("/{nome}")
	public ResponseEntity<List<Categoria>> getByNome(@PathVariable String nome)
	{
		return ResponseEntity.ok(iCategoria.findByNome(nome));
	}
	
	@PostMapping
	public ResponseEntity<Categoria> post(@RequestBody Categoria cat)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(iCategoria.save(cat));
	}
	
	@PutMapping
	public ResponseEntity<Categoria> put (@RequestBody Categoria cat)
	{
		return ResponseEntity.status(HttpStatus.OK).body(iCategoria.save(cat));
	}
	
	@DeleteMapping("/{id}")
	public void deletById(@PathVariable long id)
	{
		iCategoria.deleteById(id);
	}
	

}
