package br.edu.univas.si8.ta.rest.api;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/rest")
public interface ShoppingService {
	
	@GET
	@Path("/order/all")
	@Produces(MediaType.APPLICATION_JSON)
	String[] listShoppingDescription();
	
//	@POST
//	@Path("/order/add")
//	@Produces(MediaType.APPLICATION_JSON)
//	Result sum(@FormParam("a") int a, @FormParam("b") int b);
}
