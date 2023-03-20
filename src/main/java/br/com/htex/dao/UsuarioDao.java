package br.com.htex.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.htex.model.Usuario;
import br.com.htex.util.JPAFactory;

public class UsuarioDao {
	public void cadastra(Usuario usuario){
		
		EntityManager em = JPAFactory.getEntityManager();

		em.getTransaction().begin();
		em.persist(usuario);
		em.getTransaction().commit();

		em.close();

		}
	
	public  Usuario buscarId(Integer id) {
		EntityManager em = JPAFactory.getEntityManager();
		return em.find(Usuario.class, id);
	}


	public List<Usuario> lista() {
		EntityManager em = JPAFactory.getEntityManager();

		return em.createQuery("select u from users u", Usuario.class).getResultList();
	}
	
	public Usuario remove(Integer id){
		
		EntityManager em = JPAFactory.getEntityManager();
		
		Usuario usuario = em.find(Usuario.class, id);
		
		em.getTransaction().begin();
		em.remove(usuario);
		em.getTransaction().commit();

		em.close();
		
		return usuario;
		
		}

}
