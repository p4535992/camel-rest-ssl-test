package it.abd.esb.camel.rest.processor;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import it.abd.esb.camel.alfresco.model.ClaimInput;
import it.abd.esb.camel.alfresco.model.ClaimOutput;
import it.abd.esb.camel.alfresco.model.ClaimStatus;
/**
 * @href https://github.com/johnfosborneiii/Camel-CXF-CXFRS-Demo/blob/master/src/main/java/org/blogdemo/claimdemo/ClaimProcessor.java
 *
 */
public class ClaimProcessor implements Processor{
    public ClaimOutput process(ClaimInput input) throws Exception {
        // get the id of the input
        //ClaimInput input = exchange.getIn().getBody(ClaimInput.class);
 
        System.out.println(input);
         
        // set reply including the id
        ClaimOutput output = new ClaimOutput();
        output.setClaimNo("A00099484");
        output.setCustomerName(input.getCustomerName());
        output.setStatus("DONE");
        //exchange.getOut().setBody(output);
        return output;
    }
    
    public ClaimStatus status(String id) throws Exception {
        // get the id of the input
     //ClaimInput input = exchange.getIn().getBody(ClaimInput.class);

     System.out.println(id);
     System.out.println("ClaimInput :["+ClaimInput.class.getPackage().getName()+"]");
      
        // set reply including the id
     ClaimStatus status = new ClaimStatus();
     status.setCustomerID(id);
     status.setPolno("A123456789");
     status.setClaimNo("34567789");
     status.setStatus("OK");
     
     return status;
    }
    
    public List<String> prepareList(String polno){
        final List<String> params = new ArrayList<String>();
        params.add(polno);
         
        return params;
    }
     
     public ClaimStatus cancel(String claimNo) throws Exception {
           
            ClaimStatus status = new ClaimStatus();
            status.setClaimNo(claimNo);
            status.setStatus("OK");
             
            return status;
       }

	@Override
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		
	}
}