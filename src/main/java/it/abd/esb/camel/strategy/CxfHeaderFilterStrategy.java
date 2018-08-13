package it.abd.esb.camel.strategy;

import org.apache.camel.Exchange;
import org.apache.camel.impl.DefaultHeaderFilterStrategy;


public class CxfHeaderFilterStrategy extends DefaultHeaderFilterStrategy {

    @Override
    public boolean applyFilterToCamelHeaders(String headerName, Object headerValue, Exchange exchange) {
        return true;
    }
}