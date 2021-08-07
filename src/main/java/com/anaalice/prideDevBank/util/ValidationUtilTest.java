package com.anaalice.prideDevBank.util;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidationUtilTest {
	@Test
	void deveValidarCPF(){
		assertDoesNotThrow(()-> ValidationUtil.validarCPF("12345678909"));
	}
	
	@Test
	void deveDarErroAoInformarCPFIncorreto(){
		Assertions.assertThrows(RuntimeException.class,()-> ValidationUtil.validarCPF("1234567890a"));
	}
	
	@Test
	void deveDarErroAoInformarCPFImcompleto(){
		Assertions.assertThrows(RuntimeException.class,()-> ValidationUtil.validarCPF("1234567890"));
	}
}
