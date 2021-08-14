package com.anaalice.prideDevBank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anaalice.prideDevBank.entity.ContaEntity;


@Repository
public interface ContaRepository extends JpaRepository<ContaEntity, Integer> {
	
	public List<ContaEntity> findByNumeroAgenciaAndNumeroConta(String numeroAgencia,String numeroConta);

}
