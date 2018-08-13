package it.abd.esb.camel.alfresco.model;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@XmlRootElement(name = "UpdateCustomerAddrsRequest")
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateCustomerAddrsRequest {
	
	private String accountNumber;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	

}
