package com.anaalice.prideDevBank.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.anaalice.prideDevBank.entity.ContaEntity;
import com.anaalice.prideDevBank.repository.ContaRepository;

@Service
public class ContaService {
	@Autowired 
	ContaRepository contaRespository;
	
	public ContaEntity savarConta(ContaEntity conta) {
		contaRespository.save(conta);
		
		return conta;
	}

	public ContaEntity getConta(String numeroAgencia, String numeroConta) {
		List<ContaEntity> contaList = contaRespository
				.findByNumeroAgenciaAndNumeroConta(numeroAgencia, numeroConta);
		
		ContaEntity contaEntity = contaList.get(0);
		
		return contaEntity;
		
	}

}
