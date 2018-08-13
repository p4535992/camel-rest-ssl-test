package it.abd.esb.camel.rest.route;

public interface RouteParameters {
	
    public static final String SIGN_DOCUMENT_ENDPOINT = "direct:signDocument";
    public static final String SIGN_DOCUMENT_PATH = "/signDocument";
    //public static final String SIGN_DOCUMENT_SERVICE_RESOURCE_CLASS = "it.abd.esb.camel.rest.endpoint.SignDocumentEndPoint";
    
    public static final String AUTH_FAILED = "{"
			+ "\"success\": false,"
			+ "\"message\": \"Authentication failed.\""
			+ "\"token\": null"
			+ "}";
    
    public static final String AUTH_SUCCEEDED = "{"
			+ "\"success\": true,"
			+ "\"message\": \"Authentication succeeded.\""
			+ "\"token\": \"%s\""
			+ "}";

}
