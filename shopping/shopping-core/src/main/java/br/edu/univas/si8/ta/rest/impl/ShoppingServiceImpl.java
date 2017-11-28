package br.edu.univas.si8.ta.rest.impl;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import br.edu.univas.si8.ta.ejb.interfaces.Shopping;
import br.edu.univas.si8.ta.rest.api.ShoppingService;

@RequestScoped
public class ShoppingServiceImpl implements ShoppingService {
	
	@EJB(mappedName = "java:app/shopping-ejb-0.1-SNAPSHOT/ShoppingBean!br.edu.univas.si8.ta.ejb.interfaces.ShoppingRemote")
	private Shopping shopping;

	@Override
	public String[] listShoppingDescription() {
		return shopping.listItemsNames();
	}

//	@Override
//	public String saveNewClient(String name, String email) {
//		clients.createNewItem(name, email);
//		return "{\"message\": \"Success\"}";
//	}
}
