package br.com.htex.dao;

import java.util.List;

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
	public Usuario buscarId(Integer id) {
		EntityManager em = JPAFactory.getEntityManager();
		return em.find(Usuario.class, id);
	}
	
	
	public List<Usuario> lista() {
		EntityManager em = JPAFactory.getEntityManager();
		
		return em.createQuery("SELECT u FROM users u", Usuario.class).getResultList();
	}
	

}
