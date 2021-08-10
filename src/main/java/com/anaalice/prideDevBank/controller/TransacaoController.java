package com.anaalice.prideDevBank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anaalice.prideDevBank.entity.ContaEntity;
import com.anaalice.prideDevBank.entity.TransacaoEntity;
import com.anaalice.prideDevBank.services.ContaService;
import com.anaalice.prideDevBank.services.TransacaoService;

@RestController
public class TransacaoController {

	@Autowired
	TransacaoService transacaoService;
	
	@Autowired
	
	ContaService contaService;
	
	@PostMapping("/transacao/${numeroConta}/${numeroAgencia}")
	public ResponseEntity<TransacaoEntity> criaTransacao(@PathVariable String numeroConta,
			@PathVariable String numeroAgencia , @RequestBody TransacaoEntity transacao){
		
		ContaEntity contaOrigem = contaService.getConta(numeroAgencia,numeroConta);
		
		transacao.setContaOrigem(contaOrigem);
		transacaoService.criaTransacao(transacao);
		
		
		
		return ResponseEntity.ok(transacao);
	}
	
}
