package com.anaalice.prideDevBank.util;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

public class ValidationUtilTest {
	@Test
	void deveValidarCPF(){
		assertDoesNotThrow(()-> ValidationUtil.validarCPF("12345678909"));
	}
}
