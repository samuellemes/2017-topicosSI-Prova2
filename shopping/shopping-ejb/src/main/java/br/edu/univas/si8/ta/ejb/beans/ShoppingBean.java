package br.edu.univas.si8.ta.ejb.beans;

import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import br.edu.univas.si8.ta.ejb.dao.ShoppingDao;
import br.edu.univas.si8.ta.ejb.entities.Shopping;
import br.edu.univas.si8.ta.ejb.interfaces.ShoppingLocal;
import br.edu.univas.si8.ta.ejb.interfaces.ShoppingRemote;

@Stateless
@Local(ShoppingLocal.class)
@Remote(ShoppingRemote.class)
public class ShoppingBean implements ShoppingLocal, ShoppingRemote {

	@EJB
	private ShoppingDao dao;
	
	@Override
	public void createNewItem(String description, String orderTime) {
		Shopping shopping = new Shopping();
		
		shopping.setDescription(description);
		shopping.setOrderTime(orderTime);
	}

	@Override
	public String[] listItemsNames() {
		
		return dao.listAll().stream().map(Shopping::getDescription).collect(Collectors.toList()).toArray(new String[0]);
	}
	

}
