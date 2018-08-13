package it.abd.esb.camel.rest.endpoint.impl;

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
import it.abd.esb.camel.rest.endpoint.HelloRestService;
import it.abd.esb.camel.service.HelloService;

@Path("say")
public class HelloRestServiceImpl extends HelloRestService{
    //Just like Spring.  Please add Getters/Setters. Blueprint annotations are still work in progress
    private HelloService helloService;
       
    /*
        Constructor
     */
    public HelloRestServiceImpl(){
    }
    /*
        Getters and Setters
     */
    public HelloService getHelloService() {
        return helloService;
    }
    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }
    
	@GET
	@Path("/")
	public String ping() throws Exception {
		return "SUCCESS";
	}
    
    @GET
    @Path("hello/{name}") //Maps for the `hello/John` in the URL
    public String handleGet(String name){
        return helloService.sayHello(name);
    }
    
    @GET
    @Path("hello") //Maps for the `hello/John` in the URL
    public String handleGetSimple(){
        return helloService.sayHello("me");
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