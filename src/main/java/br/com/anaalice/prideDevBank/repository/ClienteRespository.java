package br.com.anaalice.prideDevBank.repository;
import br.com.anaalice.prideDevBank.entity.ClienteEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRespository extends CrudRepository<ClienteEntity,Integer>{

}
