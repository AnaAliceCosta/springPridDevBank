package com.anaalice.prideDevBank.services;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anaalice.prideDevBank.entity.ClienteEntity;
import com.anaalice.prideDevBank.repository.ClienteRespository;

@Service
public class ClienteService {
	
	@Autowired
	ClienteRespository clienteRespository;
	
	@Autowired
	ClienteEntity cliente;

	
	public ClienteEntity criarNovoCliente(ClienteEntity cliente) {
		
		clienteRespository.save(cliente);
		
		return cliente;
		
	}
	
	
	public ClienteEntity pesquisaCliente(Integer id) {
		Optional<ClienteEntity> clienteOptional = clienteRespository.findById(id);
		
		if(clienteOptional.isPresent()) {
			return clienteOptional.get();
		}
		
		return  null;
	}

}
