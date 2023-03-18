package br.com.htex.dao;

import java.util.List;

import br.com.htex.model.Funcionario;
import br.com.htex.util.JPAFactory;
import jakarta.persistence.EntityManager;

public class FuncionarioDao {
	public void cadastra(Funcionario funcionario){
		EntityManager em = JPAFactory.getEntityManager();

		em.getTransaction().begin();

		em.persist(funcionario);

		em.getTransaction().commit();

		em.close();

		}

		public List<Funcionario> lista(){

		EntityManager em = JPAFactory.getEntityManager();

		return em.createQuery("select f from Funcionario f", Funcionario.class).getResultList();

		}
}
