package com.anaalice.prideDevBank.services;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anaalice.prideDevBank.entity.ContaEntity;
import com.anaalice.prideDevBank.entity.TransacaoEntity;
import com.anaalice.prideDevBank.repository.TransacaoRepository;
import com.anaalice.prideDevBank.util.ValidationUtil;

@Service
public class TransacaoService {

	@Autowired
	TransacaoRepository transacaoRepository;

	@Autowired
	ContaService contaService;

	
	static final int DEPOSITO = 1;
	static final int SAQUE = 2;
	

	public void criaTransacao(TransacaoEntity transacao, String numeroConta, String numeroAgencia) {
		LocalDateTime data = LocalDateTime.now();
		transacao.setData(data);
		ContaEntity contaOrigem = contaService.getConta(numeroAgencia, numeroConta);

		

//		if (tipoTransacao == 1) {
//
//			retorno = realizaDeposito(contaOrigem, transacao);
//
//		} else if (tipoTransacao == 2) {
//
//			retorno = realizaSaque(contaOrigem, transacao);
//
//		} else {
//			retorno = false;
//		}

		switch (transacao.getTipo()) {
		case "Deposito":
			realizaDeposito(contaOrigem, transacao);
			break;
		case "Saque" :
			realizaSaque(contaOrigem, transacao);
			break;
		default:
			break;
		}

		transacao.setContaOrigem(contaOrigem);
		transacaoRepository.save(transacao);

	}

	private void realizaDeposito(ContaEntity contaOrigem, TransacaoEntity transacao) {
		contaOrigem.setSaldo(contaOrigem.getSaldo() + transacao.getValor());

	}

	private void realizaSaque(ContaEntity contaOrigem, TransacaoEntity transacao) {

			ValidationUtil.validaSaldo(contaOrigem, transacao.getValor());
			Double novoSaldo = contaOrigem.getSaldo() - transacao.getValor();
			contaOrigem.setSaldo(novoSaldo);

	}

	public List<TransacaoEntity> consultaTransacoes(String numeroConta, String numeroAgencia) {
		ContaEntity contaOrigem = contaService.getConta(numeroAgencia, numeroConta);
		return transacaoRepository.findByContaOrigem(contaOrigem);
		
	}
}
