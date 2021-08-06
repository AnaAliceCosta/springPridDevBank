package com.anaalice.prideDevBank.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ContaEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String numero;
	private String conta;
	
	
	public int getId() {
		return id;
	}
	public String getNumero() {
		return numero;
	}
	public String getConta() {
		return conta;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	
	
	


}
