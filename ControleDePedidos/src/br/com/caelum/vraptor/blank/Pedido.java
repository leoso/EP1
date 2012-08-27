package br.com.caelum.vraptor.blank;

import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Pedido {
	
	@Id @GeneratedValue
	private Long id;	
	
	private Cliente cliente;
	
//	@Temporal(TemporalType.DATE)
	private Calendar data;

	private int quantidadeDeItens;
	private double valorTotal;
	
	@OneToMany(mappedBy = "Pedido", cascade = CascadeType.ALL)
	private List<Item> itens;
	
	
	public static double calculaValorTotal(List<Item> itens){
		double aux=0;
		if(itens.size()==0){
			return aux;
		}
		for(int i=0; i< itens.size(); i++ ){
			Item item= itens.get(i);
			aux= aux + item.getValorTotalDesteItem();
		}
		return aux;
		
	}
	
	public Pedido(Cliente cliente, List<Item> itens){
		this.cliente= cliente;
		//this.data= data;
		this.quantidadeDeItens= itens.size();
		this.valorTotal= calculaValorTotal(itens);
	}

}
