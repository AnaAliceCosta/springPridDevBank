package br.com.anaalice.prideDevBank.services;

import br.com.anaalice.prideDevBank.entity.ClienteEntity;
import br.com.anaalice.prideDevBank.repository.ClienteRespository;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
class ClienteServiceTest {

    @InjectMocks
    private static ClienteService clienteService;

    @Mock
    ClienteRespository clienteRespository;
    @BeforeEach
    void setup() {
        clienteService = new ClienteService(clienteRespository);
    }

    @Test
    void criarNovoCliente() {

        ClienteEntity cliente= new ClienteEntity();
        cliente.setCpf("12345678909");
        Mockito.doReturn(cliente).when(clienteRespository).save(Mockito.any(ClienteEntity.class));

        ClienteEntity clienteEntity = clienteService.criarNovoCliente(cliente);

        Assert.assertEquals(clienteEntity.getCpf(),cliente.getCpf());


    }

//    @Test
//    void pesquisaCliente() {
//    }
}