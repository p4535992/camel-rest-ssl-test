package it.abd.esb.camel.service.impl;

import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.abd.esb.camel.alfresco.model.AddNewCustomerRequest;
import it.abd.esb.camel.alfresco.model.NewCustomerResponse;

public class NewCustomerService {
	
	private static Logger LOG = LoggerFactory.getLogger(NewCustomerService.class);
	 
	// map the request
	public void addNewCustRequest(Exchange exchange) {
		AddNewCustomerRequest request = exchange.getIn().getBody(AddNewCustomerRequest.class);
		LOG.info("#### Received New Customer request :: " + request.getFirstName() + " " + request.getLastName());
		exchange.getOut().setBody(request.getFirstName());
	}
 
	// map the response
	public void newCustResponse(Exchange exchange) {
 
		String custName = exchange.getIn().getBody(String.class);
		NewCustomerResponse response = new NewCustomerResponse();
		response.setCustmerName(custName);
		String accountNumber = String.valueOf((long)(Math.random()*10000000000L));
		LOG.info("#### Assigned AccountNumber::" + accountNumber);
		response.setAccountNumber(accountNumber);
		// Set the response
		exchange.getOut().setBody(response);
 
	}

}
