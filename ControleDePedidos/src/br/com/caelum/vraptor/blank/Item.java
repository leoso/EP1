package br.com.caelum.vraptor.blank;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Item {
	
	@Id @GeneratedValue
	private Long id;
	
	private String nomeDoItem;
	private int quantidade;
	private double valorUnitario;
	private double valorTotalDesteItem;
	

	public double getValorTotalDesteItem() {
		return valorTotalDesteItem;
	}


	public Item(String nomeDoItem, int quantidade, double valorUnitario ){
		this.nomeDoItem = nomeDoItem;
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
		this.valorTotalDesteItem= quantidade * valorUnitario;
	}

	
	
}
