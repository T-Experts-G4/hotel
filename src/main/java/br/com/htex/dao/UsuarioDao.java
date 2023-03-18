package br.com.htex.dao;

import br.com.htex.model.Usuario;
import br.com.htex.util.JPAFactory;
import jakarta.persistence.EntityManager;

public class UsuarioDao {
	public void cadastra(Usuario usuario){
		
		EntityManager em = JPAFactory.getEntityManager();

		em.getTransaction().begin();
		em.persist(usuario);
		em.getTransaction().commit();

		em.close();

		}
}
