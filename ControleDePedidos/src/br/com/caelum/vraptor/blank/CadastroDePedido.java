package br.com.caelum.vraptor.blank;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import sun.util.resources.CalendarData_pt;

public class CadastroDePedido {
	public static void main(String[] args) {
		AnnotationConfiguration configuration = new AnnotationConfiguration();
		configuration.configure();

		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();

		Cliente cliente = new Cliente("Leonardo");	
		
		List<Item> itens= new ArrayList<Item>();
		Item item= new Item("jaca", 2, 3.0);
		itens.add(item);
	
		Pedido pedido = new Pedido(cliente, itens);
		
		Transaction tx = session.beginTransaction();
		session.save(pedido);
		tx.commit();
	}
}
