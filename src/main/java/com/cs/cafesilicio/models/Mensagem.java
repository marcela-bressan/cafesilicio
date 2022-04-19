package com.cs.cafesilicio.models;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mensagem implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue  (strategy = GenerationType.AUTO)
	private long id;
	private String texto;
	
	public Mensagem() {
		
	}
	public Mensagem(String texto) {
		this.texto = texto;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public String getTexto() {
		return this.texto;
	}
	
	
}
