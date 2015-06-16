package com.mybake.service;

import javax.jdo.PersistenceManager;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Controller;

import com.mybake.inentory.Product;
import com.mybake.persistence.PersistenceManagerFactoryImpl;

@Controller
@Path("/inventory")
public class InventoryService {

	@PUT
	@Path("/add")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response addBill(Product product) {
		PersistenceManager persistenceManager = PersistenceManagerFactoryImpl
				.get().getPersistenceManager();
		try {
			persistenceManager.makePersistent(product);
		} finally {
			persistenceManager.close();
		}
		return Response.status(200).entity(product).build();
	}
}
