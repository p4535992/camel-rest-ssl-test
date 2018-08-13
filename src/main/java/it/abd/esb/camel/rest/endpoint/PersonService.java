package it.abd.esb.camel.rest.endpoint;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.camel.Exchange;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wordnik.swagger.annotations.ApiResponses;

import it.abd.esb.camel.alfresco.model.Customer;
import it.abd.esb.camel.alfresco.model.Order;

import com.wordnik.swagger.annotations.ApiResponse;
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
public class PersonService {
	
	@GET
	@Path("/")
	@ApiOperation(value = "ping", notes = "make a ping", response = Response.class)	
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Given admin user found"),
		@ApiResponse(code = 404, message = "Given admin user not found"),
		@ApiResponse(code = 500, message = "Internal server error due to encoding the data"),
		@ApiResponse(code = 400, message = "Bad request due to decoding the data"),
		@ApiResponse(code = 415, message = "DAtype format not supported"),
		@ApiResponse(code = 412, message = "Pre condition failed due to required data not found") })
	public String ping() throws Exception {
		return null;
	}
	
	@GET
    @Path("/person/get/")
    @Produces(MediaType.APPLICATION_JSON)
    public Customer getPerson() {
		return null;
	}
    
    @GET
    @Path("/person/get/{id}/")
    @Produces(MediaType.APPLICATION_JSON)  
    public Customer getPerson(@PathParam("id") String id) {
		return null;
	}

    @POST
    @Path("/person/post")
    public Response putPerson(Customer person) {
		return null;
	}

    @DELETE
    @Path("/person/delete/{id}")
    public void deletePerson(@PathParam("id") String id) {
    	String s = "";
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
		return null;
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
		return null;
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
		return null;
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
    public Response deleteCustomer(@ApiParam(value = "ID of Customer to delete", required = true) @PathParam("id") String id){
		return null;
	}
    
    //http://localhost:8181/cxf/crm/customerservice/orders/223/products/323
    @GET
    @Path("/orders/{orderId}/")
    @Produces(MediaType.APPLICATION_JSON)
    public Order getOrder(@PathParam("orderId") String orderId) {
		return null;
	}
}
