package br.com.htex.dao;

import java.util.List;


import br.com.htex.model.Quarto;
import br.com.htex.util.JPAFactory;
import jakarta.persistence.EntityManager;

public class QuartoDao {
	public void cadastra(Quarto quarto){
		EntityManager em = JPAFactory.getEntityManager();

		em.getTransaction().begin();

		em.persist(quarto);

		em.getTransaction().commit();

		em.close();

		}

		public List<Quarto> lista(){

		EntityManager em = JPAFactory.getEntityManager();

		return em.createQuery("select q from Quarto q", Quarto.class).getResultList();

		}
}
