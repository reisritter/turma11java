package com.group.Loja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"controller"})
public class Dados2Application {

	public static void main(String[] args) {
		SpringApplication.run(Dados2Application.class, args);
	}

}
