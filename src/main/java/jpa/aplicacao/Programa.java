package jpa.aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpa.dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		


		//conectando ao banco de dados
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		Pessoa p  = em.find(Pessoa.class,2); // buscou
		
		System.out.println(p);
		
		//transação monitorada
		
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		System.out.println("PRONTO!");
		System.out.println("PRONTO!");
		
		em.close();
		emf.close();
		
		/*
		 * INSERIR PESSOA NO BD
		 * Pessoa p1 = new Pessoa(null, "Marina Reis", "m@gmail.com");
		Pessoa p2 = new Pessoa(null, "João Reis", "jj@gmail.com");
		Pessoa p3 = new Pessoa(null, "Lua ", "ll@gmail.com");

		//conectando ao banco de dados
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		
		System.out.println("PRONTO!");
		
		*/
		
		
	}

}
