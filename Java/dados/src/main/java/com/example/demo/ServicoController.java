package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/hello")
@RestController
public class ServicoController {

	public ServicoController() {}
	
	@GetMapping("/get1")
	public String hello() 
	{
		return "Get1 Hello World!";
	}
	
	@GetMapping("/get2")
	public String hello2() 
	{
		return "Get2 Hello World!";
	}

}
