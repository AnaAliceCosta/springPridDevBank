package com.anaalice.prideDevBank.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anaalice.prideDevBank.entity.ContaEntity;
import com.anaalice.prideDevBank.services.ContaService;


@RestController
public class ContaController {

	@Autowired ContaService service;
	
	
	@PostMapping(value = "/conta", produces = "application/json", consumes = "application/json")
	public ResponseEntity<ContaEntity> criarConta(@RequestBody ContaEntity conta){
		
		ContaEntity novaConta = service.savarConta(conta);
		
		URI uri = URI.create("/cliente/" + novaConta.getId());
		
		return ResponseEntity.created(uri).body(novaConta); 
	}
	
//	@GetMapping("/cliente/${id}")
//	public ResponseEntity<ContaEntity> consultarConta(){
//		
//		
//		return ResponseEntity.ok(cliente);
//		
//	}
	
	
}
