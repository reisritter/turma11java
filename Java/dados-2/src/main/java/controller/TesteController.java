package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {

	public TesteController() {}
	
	@GetMapping
	public String helloWorld(String nome) 
	{
		return "Hello World! "+nome;
	}
	
	@PostMapping("/post")
	public String post(String nome) 
	{
		return "Post " + nome;
	}

}
