package br.edu.univas.si8.ta.rest.application;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import br.edu.univas.si8.ta.rest.impl.ShoppingServiceImpl;

@ApplicationPath("/rest")
public class RestApplication extends Application {
	
	public Set<Class<?>> getClasses () {
		Set<Class<?>> classes = new HashSet<>();
		classes.add(ShoppingServiceImpl.class);
		return classes;
	}
}
