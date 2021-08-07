package com.anaalice.prideDevBank.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
}
