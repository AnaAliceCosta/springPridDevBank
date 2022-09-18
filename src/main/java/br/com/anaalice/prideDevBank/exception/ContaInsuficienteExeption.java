package br.com.anaalice.prideDevBank.exception;

public class ContaInsuficienteExeption extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ContaInsuficienteExeption() {};
	public ContaInsuficienteExeption(String message) {
		super(message);
	}
	

}
