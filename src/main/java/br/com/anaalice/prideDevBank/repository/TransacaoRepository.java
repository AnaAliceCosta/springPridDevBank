package br.com.anaalice.prideDevBank.repository;

import java.util.List;

import br.com.anaalice.prideDevBank.entity.ContaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.anaalice.prideDevBank.entity.TransacaoEntity;


@Repository
public interface TransacaoRepository extends CrudRepository<TransacaoEntity, Integer> {
	
	public List<TransacaoEntity> findByContaOrigem(ContaEntity contaOrigem);
	

}
