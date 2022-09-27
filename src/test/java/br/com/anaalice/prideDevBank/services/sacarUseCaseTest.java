package br.com.anaalice.prideDevBank.services;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class sacarUseCaseTest {

    br.com.anaalice.prideDevBank.domain.Conta conta = new Conta();
    @BeforeEach
    void setup() {
        conta.depositar(100.0);
    }

    @Test
    void sacarCemReais() {

        Double saldoAnteiror = conta.getSaldo();
        Double saldoAtual = conta.sacar(100.0);

        Double saldoEsperado = saldoAnteiror - 100.0;
        Assert.assertEquals(saldoAtual, saldoEsperado);
    }


    @Test
    void depositarValor() {
        Double saldoAnteiror = conta.getSaldo();
        Double saldoAtual = conta.depositar(100.0);
        Double saldoEsperado = saldoAnteiror + 100.0;
        Assert.assertEquals(saldoAtual,saldoEsperado);
    }
    @Test
    void sacarSemSaldo() {
        Assert.assertThrows(RuntimeException.class, ()-> conta.sacar(200.0));
    }
}
