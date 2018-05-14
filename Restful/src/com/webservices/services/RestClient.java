package com.webservices.services;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;

import com.sun.research.ws.wadl.Response;

public class RestClient {

	public static void main(String[] args) 
	{
		ClientConfig config=new ClientConfig();
		Client client=ClientBuilder.newClient(config);
		
		WebTarget target=client.target(UriBuilder.fromUri("http://localhost:8080/Restful/").build());
		
		String response=target.path("rest").path("employeeResources").path("getEmployee").request().accept(MediaType.APPLICATION_JSON).get(Response.class).toString();
		
		System.out.println(response);
	}

}
