package br.com.caelum.vraptor.blank;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

//teste0: Lista vazia
//teste1: Lista com apenas 1 item com quantidade 1
//teste2: Lista com apenas 1 item com quantidade maior que 1
//teste3: Lista com apenas 2 itens com quantidade 1
//teste4: Lista com apenas 2 item com quantidade maior que 1

public class TestaCalculaValorTotal {
	
	@Test
	public void teste0(){
		List<Item> itens= new ArrayList<Item>();
		Assert.assertEquals( 0.0 , Pedido.calculaValorTotal(itens), 0.2);
	}
	
	@Test
	public void teste1(){
		List<Item> itens= new ArrayList<Item>();
		Item item= new Item("jaca", 1, 3.0);
		itens.add(item);
		Assert.assertEquals( 3.0 , Pedido.calculaValorTotal(itens), 0.2);
	}
	
	@Test
	public void teste2(){
		List<Item> itens= new ArrayList<Item>();
		Item item= new Item("melancia", 2, 5.5);
		itens.add(item);
		Assert.assertEquals(11.0 , Pedido.calculaValorTotal(itens), 0.2);
	}
	
	@Test
	public void teste3(){
		List<Item> itens= new ArrayList<Item>();
		Item item= new Item("jaca", 1, 3.0);
		itens.add(item);
		Item item1= new Item("melancia", 1, 5.5);
		itens.add(item1);
		Assert.assertEquals( 8.5 , Pedido.calculaValorTotal(itens), 0.2);
	}
	
	@Test
	public void teste4(){
		List<Item> itens= new ArrayList<Item>();
		Item item= new Item("jaca", 3, 3.0);
		itens.add(item);
		Item item1= new Item("melancia", 2, 5.5);
		itens.add(item1);
		Assert.assertEquals( 20.0 , Pedido.calculaValorTotal(itens), 0.2);
	}
	

}
