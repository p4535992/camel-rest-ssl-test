package it.abd.esb.camel.rest.endpoint;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import it.abd.esb.camel.alfresco.model.AddNewCustomerRequest;
import it.abd.esb.camel.alfresco.model.UpdateCustomerAddrsRequest;

//Maps for the `say` in the URL
@Path("say")
public class HelloRestService {
	
	@GET
	@Path("/")
    public String ping() throws Exception {
		return null;
	}
	
    @GET
    @Path("hello/{name}") //Maps for the `hello/John` in the URL
    public String handleGet(@PathParam("name") String name) {
		return null;
	}
    
    @GET
    @Path("hello") //Maps for the `hello/John` in the URL
    public String handleGetSimple() {
		return null;
	}
    
	@POST
	@Path("/addCustomer")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON, "application/problem+json" })
	public Object addCustomer(AddNewCustomerRequest request ){
		return null;
		
		
	}
	@PUT
	@Path("/updateCustomer")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON, "application/problem+json" })
	public Object updateAddress(UpdateCustomerAddrsRequest request){
		return null;
		
	}
	@GET
	@Path("/getCustomerDetails/{accountNumber}")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON, "application/problem+json" })
	public Object getCustDetails(@PathParam("accountNumber") String accountNumber){
		return null;
		
	}
}