package it.abd.esb.camel.converter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class MyJsonMapper extends ObjectMapper {    
    /**
	 * 
	 */
	private static final long serialVersionUID = -7464752997675084384L;

	public MyJsonMapper() {
        this.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
    }
}
