package br.com.ifrs.edu.dev1.rodrigo_oleto.trabalhojpa.trabalhojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.ifrs.edu.dev1.rodrigo_oleto.Entity.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class Programa {
public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(null,"Rodrigo","teste@teste");
		Pessoa p3 = new Pessoa(null,"res","test");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		EntityManagerFactory entity = Persistence.createEntityManagerFactory("exemplojpa");
		EntityManager en = entity.createEntityManager();
		
		en.getTransaction().begin();
		en.persist(p1);
		en.persist(p2);
		en.persist(p3);
		en.getTransaction().commit();
		System.out.println("funfou DALHE");
		en.close();
		entity.close();
	}
    
}
