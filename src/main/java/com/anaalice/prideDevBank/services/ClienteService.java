package com.anaalice.prideDevBank.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anaalice.prideDevBank.entity.ClienteEntity;
import com.anaalice.prideDevBank.entity.ContaEntity;
import com.anaalice.prideDevBank.repository.ClienteRespository;

@Service
public class ClienteService {
	
	@Autowired
	ClienteRespository clienteRespository;
	
	@Autowired
	ClienteEntity cliente;

	
	public void criarNovoCliente(String nome, String cpf, String nomeSocial) {

	
		
//		cliente.setNome(nome);
		cliente.setCpf(cpf);
		cliente.setNomeSocial(nomeSocial);
		
		
		clienteRespository.save(cliente);
		
	}

}
