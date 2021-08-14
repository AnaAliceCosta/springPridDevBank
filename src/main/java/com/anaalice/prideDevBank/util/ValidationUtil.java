package com.anaalice.prideDevBank.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.anaalice.prideDevBank.entity.ContaEntity;
import com.anaalice.prideDevBank.exception.ContaInsuficienteExeption;


public class ValidationUtil {

	public static void validarCPF(String cpf) {

        String patternString = "[0-9]{11}";

        Pattern pattern = Pattern.compile(patternString);

        Matcher matcher = pattern.matcher(cpf);
        boolean matches = matcher.matches();
        
        if(!matches) {
        	throw new RuntimeException("CPF Invalido");
        }
	}
	
	public static void validaSaldo(ContaEntity conta, Double valorTransacao) {
		if(valorTransacao > conta.getSaldo()) {
			throw new ContaInsuficienteExeption("saldo insuficiente");
			
		}
	}
}
