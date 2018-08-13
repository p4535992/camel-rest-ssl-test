package it.abd.esb.camel.alfresco.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class Message {
    private final int code;

    public Message(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
    
    
}
