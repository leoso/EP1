package br.com.caelum.vraptor.blank;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.Entity;

@Entity
public class Cliente {
	
	@Id @GeneratedValue
	private Long id;
	
	private String nome;
	
	public Cliente(String nome){
		this.nome= nome;
	}

	
}
