package br.com.anaalice.prideDevBank.repository;

import java.util.List;

import br.com.anaalice.prideDevBank.entity.ContaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ContaRepository extends JpaRepository<ContaEntity, Integer> {
	
	public List<ContaEntity> findByNumeroAgenciaAndNumeroConta(String numeroAgencia,String numeroConta);

}
