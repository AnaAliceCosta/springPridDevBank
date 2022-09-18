package br.com.anaalice.prideDevBank.services;

import java.util.List;

import br.com.anaalice.prideDevBank.entity.ContaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.anaalice.prideDevBank.repository.ContaRepository;

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
