package it.abd.esb.camel.interceptor;


import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.core.Response;

import org.apache.cxf.common.util.Base64Exception;
import org.apache.cxf.common.util.Base64Utility;

/**
 * @href https://scholarinjava.com/basic-authentication-in-rest-api-using-jax-rs-filters/
 * @author ScholarInJava
 */
@PreMatching
public class BasicAuthentication implements ContainerRequestFilter {
	public BasicAuthentication() {
		System.out.println("BasicAuthentication starting up");
	}

	public void filter(ContainerRequestContext reqCntext) throws IOException {
		System.out.println("BasicAuthentication :: filter :: start");
		String authorization = reqCntext.getHeaderString("Authorization");
		String[] inputs = authorization.split(" ");
		if (inputs.length != 2 || !"Basic".equals(inputs[0])) {
			reqCntext.abortWith(sendResponse());
			return;
		}
		String decoderVal = null;
		try {
			decoderVal = new String(Base64Utility.decode(inputs[1]));
		} catch (Base64Exception ex) {
			sendResponse();
		}
		String[] namePassword = decoderVal.split(":");
		if (isAuthenticated(namePassword[0], namePassword[1])) {
			// lets continue
		} else {
			reqCntext.abortWith(sendResponse());
		}
	}

	private Response sendResponse() {
		return Response.status(401).entity("Un-Autheticated User").build();
	}

	public boolean isAuthenticated(String name, String password) {
		if ("scholarinjava".equalsIgnoreCase(name) && "scholar".equalsIgnoreCase(password)) {
			return true;
		}
		return false;

	}

	public static void main(String[] args) {
		String userNamePwd = "scholarinjava:scholar";
		System.out.println("Use Password :: " + "Basic " + Base64Utility.encode(userNamePwd.getBytes()));
	}

}
