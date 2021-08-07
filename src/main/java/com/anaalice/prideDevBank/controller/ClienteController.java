package com.anaalice.prideDevBank.controller;


import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.anaalice.prideDevBank.entity.ClienteEntity;
import com.anaalice.prideDevBank.services.ClienteService;

@RestController
public class ClienteController {
	
	@Autowired
	ClienteService service;
	
	
	@PostMapping(value ="/cliente" , consumes = "application/json", produces ="application/json" )
	public  ResponseEntity<ClienteEntity> criaCliente(@RequestBody ClienteEntity cliente ) {
		
		ClienteEntity clienteResponse = service.criarNovoCliente(cliente);
		URI uri = URI.create("/cliente/" + cliente.getId());
		
		return ResponseEntity.created(uri).body(clienteResponse);
		
	}
	
	@GetMapping("/cliente/{id}")
	@ResponseBody
	public ClienteEntity consultaCliente(@PathVariable Integer id) {
		
		ClienteEntity cliente = service.pesquisaCliente(id);
		
		
		return cliente;
		
	}
	
	
	
	
	

}
