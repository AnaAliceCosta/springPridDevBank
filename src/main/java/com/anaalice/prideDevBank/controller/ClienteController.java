package com.anaalice.prideDevBank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anaalice.prideDevBank.services.ClienteService;

@RestController
public class ClienteController {
	
	@Autowired
	ClienteService service;
	
	
	@GetMapping("/cliente")
	public String criaCliente(@RequestParam("nome") String nome, 
			@RequestParam("cpf") String cpf,@RequestParam("nomeSocial") String nomeSocial  ) {
		
		service.criarNovoCliente(nome, cpf,nomeSocial);
		
		return("<h1> Cliente cadsatrado com sucesso</h1>");
		
		
	}
	

}
