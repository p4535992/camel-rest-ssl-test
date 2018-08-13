package it.abd.esb.camel.service.impl;

import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.abd.esb.camel.alfresco.model.BillingAddress;
import it.abd.esb.camel.alfresco.model.GetCustomerDetsResponse;

public class GetCustomerDetailsService {
	

	private static Logger LOG = LoggerFactory.getLogger(GetCustomerDetailsService.class);
	// map the request
	public void getCustmerDetRequest(Exchange exchange) {
		String accountNo = exchange.getIn().getBody(String.class);
		LOG.info("#### Received AccountNumber :: " + accountNo);
		exchange.getOut().setBody(accountNo);
	}
	// map the response
	public void getCustmerDetResponse(Exchange exchange) {
		String accountNo = exchange.getIn().getBody(String.class);
		GetCustomerDetsResponse response = new GetCustomerDetsResponse();
		response.setAccountNumber(accountNo);
		response.setFirstName("ABC");
		response.setLastName("XYZ");
		response.setEmail("xxxx@gmail.com");
		response.setPhone("1234567890");
		BillingAddress address = new BillingAddress();
		address.setAddress1("Test 1");
		address.setAddress2("Test 2");
		address.setCity("Mumbai");
		address.setStateCode("MH");
		address.setZipCode("123456");
		address.setCountry("INDIA");
		response.setBillingAddress(address);
		response.setStatus("Active");
		exchange.getOut().setBody(response);

	}

}
