package com.reciclo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reciclo.model.Produto;
import com.reciclo.repository.ProdutoRepository;

@RestController
public class ProdutoController {
	
	@Autowired
	ProdutoRepository rep ;
	
	 @GetMapping
	  public ResponseEntity<List<Produto>> pegaTudo()
	 {
		 return ResponseEntity.ok(rep.findAll());
	 }
}
