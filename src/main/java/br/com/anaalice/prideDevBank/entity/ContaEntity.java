package br.com.anaalice.prideDevBank.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="conta")
@Component
public class ContaEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@JsonProperty("numeroAgencia")
	private String numeroAgencia;
	
	@JsonProperty("numeroConta")
	private String numeroConta;	
	
	@JsonProperty("Saldo")
	private Double saldo;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name = "id_cliente", referencedColumnName = "id")
	private ClienteEntity cliente;
	
	public String getNumeroAgencia() {
		return numeroAgencia;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Integer getId() {
		return this.id;
	}
	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public ClienteEntity getCliente() {
		return cliente;
	}
	public void setCliente(ClienteEntity cliente) {
		this.cliente = cliente;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	
	


}
