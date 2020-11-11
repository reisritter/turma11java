package com.jogo.Controller;

import java.util.List;
import java.util.Optional;

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

import com.jogo.model.Jogo;
import com.jogo.repository.iJogoRepository;

@RestController
@RequestMapping("/jogo")
public class JogoController {

	@Autowired
	iJogoRepository iJogo;
	
	@GetMapping
	public ResponseEntity<List<Jogo>> getAll()
	{
		return ResponseEntity.ok(iJogo.findAll());
	}
	
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<Jogo>> getByNome(@PathVariable String nome)
	{
		return ResponseEntity.ok(iJogo.findByNome(nome));
	}
	
	@GetMapping("/id/{id}")
	public ResponseEntity<Optional<Jogo>> getById(@PathVariable long id)
	{
		return ResponseEntity.ok(iJogo.findById(id));
	}
	
	@PostMapping
	public ResponseEntity<Jogo> post(@RequestBody Jogo jogo)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(iJogo.save(jogo));
	}
	
	@PutMapping
	public ResponseEntity<Jogo> put(@RequestBody Jogo jogo)
	{
		return ResponseEntity.status(HttpStatus.OK).body(iJogo.save(jogo));
	}
	
	@DeleteMapping("{id}")
	public void delById(@PathVariable long id) 
	{
		iJogo.deleteById(id);
	}
	
	

}
