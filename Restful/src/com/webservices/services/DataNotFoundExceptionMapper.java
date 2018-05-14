package com.webservices.services;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.webservices.model.ErrorMessage;

@Provider
public class DataNotFoundExceptionMapper implements ExceptionMapper<Throwable>
{

	@Override
	public Response toResponse(Throwable ex) 
	{
		ErrorMessage errMsg=new ErrorMessage(ex.getMessage(),500,"www.err.com");
		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(errMsg).build();
	}
}
