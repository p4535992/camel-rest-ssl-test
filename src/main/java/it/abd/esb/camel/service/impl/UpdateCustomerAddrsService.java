package it.abd.esb.camel.service.impl;

import javax.ws.rs.core.Response;

import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.abd.esb.camel.alfresco.model.UpdateCustomerAddrsRequest;

public class UpdateCustomerAddrsService {
	
	private static Logger LOG = LoggerFactory.getLogger(UpdateCustomerAddrsService.class);
	 
	// map the request
	public void updateCustmerAddrsRequest(Exchange exchange) {
		UpdateCustomerAddrsRequest request = exchange.getIn().getBody(UpdateCustomerAddrsRequest.class);
		LOG.info("#### Received request to update the address :: " + request.getAccountNumber());
		exchange.getOut().setBody(request);
	}
 
	public void updateCustmerAddrsResponse(Exchange exchange) {
		String transactionId = String.valueOf((long)(Math.random()*1000000000000L));;
		LOG.info("#### Transaction refrence Number  :: " + transactionId);
 
		exchange.getOut().setBody(Response.status(Response.Status.ACCEPTED)
				.entity("Request has been accepted : TransactionId  : " + transactionId).build());
	}

}
