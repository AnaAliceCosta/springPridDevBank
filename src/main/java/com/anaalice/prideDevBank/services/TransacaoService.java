package com.anaalice.prideDevBank.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anaalice.prideDevBank.entity.TransacaoEntity;
import com.anaalice.prideDevBank.repository.TransacaoRepository;

@Service
public class TransacaoService {


	@Autowired
	TransacaoRepository transacaoRepository;
	
	public void criaTransacao(TransacaoEntity transacao) {
		transacaoRepository.save(transacao);
	}
}
