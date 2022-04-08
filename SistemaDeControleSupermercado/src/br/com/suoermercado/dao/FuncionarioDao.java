package br.com.suoermercado.dao;

import br.com.supermercado.model.Funcionario;
import br.com.supermercado.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

public class FuncionarioDao {
	
	EntityManagerFactory emf = JPAUtil.getEntityManagerFactory();
	
	public void inserir (Funcionario funcionario) {
		
		EntityManager em = emf.createEntityManager();
		 EntityTransaction transa = em.getTransaction();
		 
		 transa.begin();
		 em.persist(funcionario);
		 transa.commit();
		 em.close();
	}

}
