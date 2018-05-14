package com.webservices.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/messages")
public class messagesResource 
{
	@GET
	@Path("/getmsg")
	@Produces(MediaType.TEXT_PLAIN)
public String getMsg()
{
	return "hello Rest WebServices...!!!";
}
}
