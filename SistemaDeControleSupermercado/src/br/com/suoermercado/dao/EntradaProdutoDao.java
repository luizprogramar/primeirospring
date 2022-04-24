package br.com.suoermercado.dao;

import br.com.supermercado.model.EntradaProduto;
import br.com.supermercado.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

public class EntradaProdutoDao {
	
	EntityManagerFactory emf = JPAUtil.getEntityManagerFactory();
	
	public void inserir(EntradaProduto entrada) {
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tra = em.getTransaction();
		tra.begin();
		em.persist(entrada);
		tra.commit();
		em.close();
	}

}
