package br.edu.univas.si8.ta.ejb.interfaces;

public interface Shopping {
	
	void createNewItem(String name, String email);
	
	String[] listItemsNames();
	
}
