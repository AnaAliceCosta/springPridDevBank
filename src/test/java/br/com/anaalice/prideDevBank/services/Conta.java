package br.com.anaalice.prideDevBank.domain;

public class Conta {
    private double saldo;

    public Double getSaldo() {
        this.saldo = 100;
        return saldo;
    }

    public Double sacar(Double valor) {
        if (this.saldo < valor)
            throw new RuntimeException("saldo Insuficiente");
        return getSaldo() - valor;


    }


    public Double depositar(Double valor) {
        return this.saldo += valor;
    }
}
