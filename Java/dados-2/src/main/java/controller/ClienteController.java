package controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import model.Cliente;

@RestController
public class ClienteController {
	
	@PostMapping(path="/novo",consumes="application/json")
	public void novoCliente(@RequestBody Cliente c) 
	{
		System.out.println(c.getNome());
	}

}
