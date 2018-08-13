package it.abd.esb.camel.service.soap;

import it.abd.esb.camel.alfresco.model.ClaimInput;
import it.abd.esb.camel.alfresco.model.ClaimOutput;
import it.abd.esb.camel.alfresco.model.ClaimStatus;

/**
 * Costruisce il servizio soap
 * @href https://github.com/johnfosborneiii/Camel-CXF-CXFRS-Demo/blob/master/src/main/java/org/blogdemo/claimdemo/ClaimProcessor.java
 *
 */
public interface ClaimService {
    
    public ClaimOutput apply(ClaimInput input);
    public ClaimStatus cancel(String claimNo);
 
}
