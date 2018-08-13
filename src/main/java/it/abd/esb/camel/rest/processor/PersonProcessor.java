package it.abd.esb.camel.rest.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class PersonProcessor implements Processor{

	public void process(Exchange exchange) throws Exception {

		// Get input from exchange
		String msg = exchange.getIn().getBody(String.class);
		// set output in exchange
		exchange.getOut().setBody("Hello World Process" + msg);
	}
	

}
