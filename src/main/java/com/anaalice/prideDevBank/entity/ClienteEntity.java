package com.anaalice.prideDevBank.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="cliente", uniqueConstraints = @UniqueConstraint(columnNames = {"cpf"} ))
@Component
public class ClienteEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@NonNull
	@JsonProperty("nome")
	private String nome;
	
	@NonNull
	@JsonProperty("cpf")
	private String cpf;

	@JsonProperty("nomeSocial")
	private String nomeSocial;
	
	public Integer getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}


	public String getNomeSocial() {
		return nomeSocial;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setNomeSocial(String nomeSocial) {
		this.nomeSocial = nomeSocial;
	}
	

}
