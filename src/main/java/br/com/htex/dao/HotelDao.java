package br.com.htex.dao;

import java.util.List;

import br.com.htex.model.Hotel;
import br.com.htex.util.JPAFactory;
import jakarta.persistence.EntityManager;

public class HotelDao {
	public void cadastra(Hotel hotel){
		EntityManager em = JPAFactory.getEntityManager();

		em.getTransaction().begin();

		em.persist(hotel);

		em.getTransaction().commit();

		em.close();

		}

		public List<Hotel> lista(){

		EntityManager em = JPAFactory.getEntityManager();

		return em.createQuery("select h from Hotel h", Hotel.class).getResultList();

		}
}
