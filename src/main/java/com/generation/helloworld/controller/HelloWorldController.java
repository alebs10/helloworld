package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Classe Controladora
@RequestMapping("/hello")//Qual recurso da minha aplicacao aquele endereco vai responder
public class HelloWorldController {

	@GetMapping //Responde meu recurso
	public String hello() {
		return "Hello World";
	}
	
	@GetMapping("/bsm") 
	public String bsm() {
		return "Lista de BSM's <br /> Persistencia <br /> Mentalidade de crescimento "
				+ "<br /> Responsabilidade Pessoal <br /> Orientação ao Futuro <br />"
				+ "Responsabilidade Pessoal <br /> Orientação ao futuro <br />"
				+ "Competencia Comportamental <br /> Comunicação <br /> Proatividade <br />"
				+ "Orientação ao Detalhe <br /> Trabalho em Equipe";
	}
	
	@GetMapping("/objetivo") 
	public String objetivo() {
		return "Meu objetivo nessa semana de Bootcamp da Generation Brasil, dominar "
				+ "o Spring Boot";
	}
}
