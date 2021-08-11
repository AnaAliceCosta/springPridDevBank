package com.anaalice.prideDevBank.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anaalice.prideDevBank.entity.ContaEntity;
import com.anaalice.prideDevBank.entity.TransacaoEntity;
import com.anaalice.prideDevBank.repository.TransacaoRepository;

@Service
public class TransacaoService {


	@Autowired
	TransacaoRepository transacaoRepository;
	
	@Autowired
	ContaService contaService;
	
	
	public void criaTransacao(TransacaoEntity transacao, String numeroConta, String numeroAgencia) {
		String tipoTransacao = transacao.getTipo();
		
		ContaEntity contaOrigem = contaService.getConta(numeroAgencia,numeroConta);
		
		
		if(tipoTransacao.equals("Deposito")) {
			contaOrigem.setSaldo(contaOrigem.getSaldo() + transacao.getValor());
		}
		
		//saque
		
		transacao.setContaOrigem(contaOrigem);
		
		transacaoRepository.save(transacao);
	}
}
