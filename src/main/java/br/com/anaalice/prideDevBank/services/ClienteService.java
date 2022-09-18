package br.com.anaalice.prideDevBank.services;


import static br.com.anaalice.prideDevBank.util.ValidationUtil.validarCPF;

import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.anaalice.prideDevBank.entity.ClienteEntity;
import br.com.anaalice.prideDevBank.repository.ClienteRespository;

@Service
public class ClienteService {
	

	private final ClienteRespository clienteRespository;

	public ClienteService(ClienteRespository clienteRespository) {
		this.clienteRespository = clienteRespository;
	}
	
	
	public ClienteEntity criarNovoCliente(ClienteEntity cliente) {
		validarCPF(cliente.getCpf());
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
