package br.com.htex.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAFactory {
 
	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("hotel");

	public static EntityManager getEntityManager(){

	return factory.createEntityManager();

	}

}
