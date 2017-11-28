package br.edu.univas.si8.ta.ejb.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.univas.si8.ta.ejb.entities.Shopping;

@Stateless
public class ShoppingDao {
	
	@PersistenceContext(unitName = "shopping")
	private EntityManager em;
	

	public void insert(Shopping shopping_order) {
		em.persist(shopping_order);
	}
	
	public List<Shopping> listAll () {
		return em.createQuery("from shopping_order c", Shopping.class).getResultList();
	}
}
