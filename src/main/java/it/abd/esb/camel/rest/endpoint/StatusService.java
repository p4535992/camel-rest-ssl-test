package it.abd.esb.camel.rest.endpoint;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import it.abd.esb.camel.alfresco.model.ClaimStatus;
/**
 * @href https://github.com/johnfosborneiii/Camel-CXF-CXFRS-Demo/blob/master/src/main/java/org/blogdemo/claimdemo/ClaimProcessor.java
 *
 */
@Path("/status")
public class StatusService {
     
    @GET
    @Path("/custId/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public ClaimStatus status(@PathParam("id") String custId){
        return null;
    }
 
    @GET
    @Path("/restcancel/{claimNo}")
    @Produces(MediaType.APPLICATION_JSON)
    public ClaimStatus restCancel(@PathParam("claimNo") String claimNo){
        return null;
    }
}
