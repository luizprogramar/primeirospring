package br.com.supermercado.util;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {
	
	private static EntityManagerFactory fabrica = null;
	
	static {
		fabrica = Persistence.createEntityManagerFactory("programador");
	}
	
	public static EntityManagerFactory getEntityManagerFactory() {
	if(fabrica == null) {
		fabrica = Persistence.createEntityManagerFactory("programador");
	}
	
	    return fabrica;
	
	}

}
