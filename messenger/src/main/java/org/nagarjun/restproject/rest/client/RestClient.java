package org.nagarjun.restproject.rest.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

import org.nagarjun.restproject.messenger.model.Message;



public class RestClient {

	public static void main(String[] args){
		Client client = ClientBuilder.newClient();
		Response response = client.target("http://localhost:8080/messenger/webapi/messages/2").request().get();
		System.out.println(response.readEntity(String.class));
	}
}
