package com.anaalice.prideDevBank.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="transacao")
@Component
public class TransacaoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@JsonProperty("tipo")
	private String tipo;
	
	@JsonProperty("valor")
	private Double valor;
	@ManyToOne
	@JoinColumn(name = "id_conta", referencedColumnName = "id")
	private ContaEntity contaOrigem;
	
	public Integer getId() {
		return id;
	}

	public Double getValor() {
		return valor;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	public ContaEntity getContaOrigem() {
		return contaOrigem;
	}
	public void setContaOrigem(ContaEntity contaOrigem) {
		this.contaOrigem = contaOrigem;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	
}
