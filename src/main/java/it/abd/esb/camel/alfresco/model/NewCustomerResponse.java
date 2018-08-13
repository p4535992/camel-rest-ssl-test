package it.abd.esb.camel.alfresco.model;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author ScholarInJava
 */
@XmlRootElement(name = "NewCustomerResponse")
@JsonIgnoreProperties(ignoreUnknown = true)
public class NewCustomerResponse {
	
	private String accountNumber;
	private String custmerName;


	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCustmerName() {
		return custmerName;
	}

	public void setCustmerName(String custmerName) {
		this.custmerName = custmerName;
	}
	

}
