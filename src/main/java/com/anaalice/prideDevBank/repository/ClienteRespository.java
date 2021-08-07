package com.anaalice.prideDevBank.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.anaalice.prideDevBank.entity.ClienteEntity;

@Repository
public interface ClienteRespository extends CrudRepository<ClienteEntity,Integer>{

}
