package com.anaalice.prideDevBank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anaalice.prideDevBank.entity.ClienteEntity;
import com.anaalice.prideDevBank.repository.ClienteRespository;

@Service
public class dados {
	
	@Autowired
	ClienteEntity clienteEntity;
	
	@Autowired
	ClienteRespository clienteRespository;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		clienteEntity = clienteRespository
		
	}

}
