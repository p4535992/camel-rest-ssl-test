package it.abd.esb.camel.rest.endpoint.impl;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.camel.Exchange;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wordnik.swagger.annotations.ApiResponses;
import com.wordnik.swagger.annotations.ApiResponse;

import it.abd.esb.camel.alfresco.model.Customer;
import it.abd.esb.camel.alfresco.model.Order;
import it.abd.esb.camel.rest.endpoint.PersonService;

// This could be an interface if CAMEL-6014 is fixed.
/**
 * This Java class with be hosted in the URI path defined by the @Path annotation. @Path annotations on the methods
 * of this class always refer to a path relative to the path defined at the class level.
 * <p/>
 * For example, with 'http://localhost:8181/cxf' as the default CXF servlet path and '/crm' as the JAX-RS server path,
 * this class will be hosted in 'http://localhost:8181/cxf/crm/customerservice'.  An @Path("/customers") annotation on
 * one of the methods would result in 'http://localhost:8181/cxf/crm/customerservice/customers'.
 */
@Path("/personservice")
@Api(value = "/personservice", description = "Sample CXF service with Swagger documentation")
public class PersonServiceImpl extends PersonService{
	
	
	private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(PersonServiceImpl.class);
	
    long currentId = 123;
    Map<Long, Customer> customers = new HashMap<Long, Customer>();
    Map<Long, Order> orders = new HashMap<Long, Order>();
	
    public PersonServiceImpl() {
        init();
    }
	
	private String name;
	
	@GET
	@Path("/")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@ApiOperation(value = "NNNNNNNNNNNNNNNNN")
	public String ping() throws Exception {
		return "SUCCESS";
	}
	
	@GET
    @Path("/person/get/")
	@Produces({MediaType.APPLICATION_JSON})	
	@ApiOperation(value = "TTTTTTTTTTTTT")
    public Customer getPerson() {
		//String accountNo = exchange.getIn().getBody(String.class);		
    	logger.info("START GET PERSON");
    	//exchange.getOut().setBody(accountNo);
        return null;
    }
    
    @GET
    @Path("/person/get/{id}/")
    @Produces("application/xml")
    public Customer getPerson(@PathParam("id") String id) {
    	logger.info("START GET PERSON WITH ID:"+id);
        return null;
    }

    @POST
    @Path("/person/post")
    @ApiOperation(value = "ZZZZZZZZZZZZZ")
    public Response putPerson(Customer person) {
    	logger.info("START GET PERSON : " + person.toString());
        return null;
    }

    @DELETE
    @Path("/person/delete/{id}")
    @ApiOperation(value = "YYYYYYYYYYYYYY")
    public void deletePerson(@PathParam("id") String id) {
    	logger.info("START DELETE PERSON");
    }
    
    /**
     * This method is mapped to an HTTP GET of 'http://localhost:8181/cxf/crm/customerservice/customers/{id}'.  The value for
     * {id} will be passed to this message as a parameter, using the @PathParam annotation.
     * <p/>
     * The method returns a Customer object - for creating the HTTP response, this object is marshaled into XML using JAXB.
     * <p/>
     * For example: surfing to 'http://localhost:8181/cxf/crm/customerservice/customers/123' will show you the information of
     * customer 123 in XML format.
     */
    @GET
    @Path("/customers/{id}/")
    @Produces("application/xml")
    @ApiOperation(value = "Find Customer by ID", notes = "More notes about this method", response = Customer.class)
    @ApiResponses(value = {
      @ApiResponse(code = 500, message = "Invalid ID supplied"),
      @ApiResponse(code = 204, message = "Customer not found") 
    })
    public Customer getCustomer(@ApiParam(value = "ID of Customer to fetch", required = true) @PathParam("id") String id) {
    	logger.info("----invoking getCustomer, Customer id is: " + id);
        long idNumber = Long.parseLong(id);
        Customer c = customers.get(idNumber);
        return c;
    }

    /**
     * Using HTTP PUT, we can can upload the XML representation of a customer object.  This operation will be mapped
     * to the method below and the XML representation will get unmarshaled into a real Customer object using JAXB.
     * <p/>
     * The method itself just updates the customer object in our local data map and afterwards uses the Reponse class to
     * build the appropriate HTTP response: either OK if the update succeeded (translates to HTTP Status 200/OK) or not
     * modified if the method failed to update a customer object (translates to HTTP Status 304/Not Modified).
     * <p/>
     * Note how this method is using the same @Path value as our next method - the HTTP method used will determine which
     * method is being invoked.
     */
    @PUT
    @Path("/customers/")
    @ApiOperation(value = "Update an existing Customer")
    @ApiResponses(value = {
                           @ApiResponse(code = 500, message = "Invalid ID supplied"),
                           @ApiResponse(code = 204, message = "Customer not found") 
                         })

    public Response updateCustomer(@ApiParam(value = "Customer object that needs to be updated", required = true) Customer customer) {
    	logger.info("----invoking updateCustomer, Customer name is: " + customer.getName());
        Customer c = customers.get(customer.getId());
        Response r;
        if (c != null) {
            customers.put(customer.getId(), customer);
            r = Response.ok().build();
        } else {
            r = Response.notModified().build();
        }

        return r;
    }

    /**
     * Using HTTP POST, we can add a new customer to the system by uploading the XML representation for the customer.
     * This operation will be mapped to the method below and the XML representation will get unmarshaled into a real
     * Customer object.
     * <p/>
     * After the method has added the customer to the local data map, it will use the Response class to build the HTTP reponse,
     * sending back the inserted customer object together with a HTTP Status 200/OK.  This allows us to send back the
     * new id for the customer object to the client application along with any other data that might have been updated in
     * the process.
     * <p/>
     * Note how this method is using the same @Path value as our previous method - the HTTP method used will determine which
     * method is being invoked.
     */
    @POST
    @Path("/customers/")
    @ApiOperation(value = "Add a new Customer")
    @ApiResponses(value = { @ApiResponse(code = 500, message = "Invalid ID supplied")})
    public Response addCustomer(@ApiParam(value = "Customer object that needs to be updated", required = true)
                                Customer customer) {
        System.out.println("----invoking addCustomer, Customer name is: " + customer.getName());
        customer.setId(++currentId);

        customers.put(customer.getId(), customer);

        return Response.ok().type("application/xml").entity(customer).build();
    }

    /**
     * This method is mapped to an HTTP DELETE of 'http://localhost:8181/cxf/crm/customerservice/customers/{id}'.  The value for
     * {id} will be passed to this message as a parameter, using the @PathParam annotation.
     * <p/>
     * The method uses the Response class to create the HTTP response: either HTTP Status 200/OK if the customer object was
     * successfully removed from the local data map or a HTTP Status 304/Not Modified if it failed to remove the object.
     */
    @DELETE
    @Path("/customers/{id}/")
    @ApiOperation(value = "Delete Customer")
    @ApiResponses(value = {
                           @ApiResponse(code = 500, message = "Invalid ID supplied"),
                           @ApiResponse(code = 204, message = "Customer not found") 
                         })
    public Response deleteCustomer(@ApiParam(value = "ID of Customer to delete", required = true) @PathParam("id") String id) {
        System.out.println("----invoking deleteCustomer, Customer id is: " + id);
        long idNumber = Long.parseLong(id);
        Customer c = customers.get(idNumber);

        Response r;
        if (c != null) {
            r = Response.ok().build();
            customers.remove(idNumber);
        } else {
            r = Response.notModified().build();
        }

        return r;
    }

    /**
     * This method is mapped to an HTTP GET of 'http://localhost:8181/cxf/crm/customerservice/orders/{id}'.  The value for
     * {id} will be passed to this message as a parameter, using the @PathParam annotation.
     * <p/>
     * The method returns an Order object - the class for that object includes a few more JAX-RS annotations, allowing it to
     * display one of these two outputs, depending on the actual URI path being used:
     * - display the order information itself in XML format
     * - display details about a product in the order in XML format in a path relative to the URI defined here
     */    
    @Path("/orders/{orderId}/")
    @ApiOperation(value = "XXXXXXXXX", notes = "XXXXXXXXXX", response = Order.class)
    public Order getOrder(@PathParam("orderId") String orderId) {
        System.out.println("----invoking getOrder, Order id is: " + orderId);
        long idNumber = Long.parseLong(orderId);
        Order c = orders.get(idNumber);
        return c;
    }

    final void init() {
        Customer c = new Customer();
        c.setName("John");
        c.setId(123);
        customers.put(c.getId(), c);

        Order o = new Order();
        o.setDescription("order 223");
        o.setId(223);
        orders.put(o.getId(), o);
    }
    
}