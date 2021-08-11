package com.anaalice.prideDevBank.repository;

import org.springframework.data.repository.CrudRepository;

import com.anaalice.prideDevBank.entity.ContaEntity;

public interface ContaRepository extends CrudRepository<ContaEntity, Integer> {
	
	ContaEntity findByNumeroConta( String numeroConta);
	
	ContaEntity findByNumeroContaAndNumeroAgencia(String numeroConta, String numeroAgencia);
	

}
