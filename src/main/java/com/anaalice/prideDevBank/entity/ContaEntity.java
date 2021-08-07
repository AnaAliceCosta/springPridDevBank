package com.anaalice.prideDevBank.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="conta")
@Component
public class ContaEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String numero;
	private String conta;
	@OneToOne
	@JoinColumn(name = "id_cliente", referencedColumnName = "id")
	private ClienteEntity cliente;
	
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
	public ClienteEntity getCliente() {
		return cliente;
	}
	public void setCliente(ClienteEntity cliente) {
		this.cliente = cliente;
	}
	
	
	


}
