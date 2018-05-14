package com.webservices.resources;

import java.beans.beancontext.BeanContextServiceAvailableEvent;
import java.net.URI;
import java.util.List;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import com.webservices.model.employee;
import com.webservices.services.DataNotFoundException;
import com.webservices.services.EmployyServices;

@Path("/employeeResources")
public class employeeResources 
{
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getEmployee")
	public List<employee> getEmp()
	{
		EmployyServices empServ=new EmployyServices();
		return empServ.addEmp();
	}


@GET
@Produces(MediaType.APPLICATION_JSON)
@Path("/{empId}/{name}")
public String getEmpID(@BeanParam beanParamBean beanObj)
{
	/*if(year==2014)
	{
	return empID+"_"+name+"::MatrixParam::"+empid;
	}
	else
	{
		return "default";
	}*/
	return beanObj.getEmpID()+"_"+beanObj.getName()+"::headerParam::"+beanObj.getHeader();
}

@GET
@Produces(MediaType.APPLICATION_JSON)
@Path("/exceptionCheck")
public String getName(employee emp,@BeanParam beanParamBean beanObj)
{
	EmployyServices empSRvc=new EmployyServices();
	empSRvc.addEmp();
	return emp.getName();
}

@GET
@Produces(MediaType.APPLICATION_JSON)
@Path("/empContext")
public String getEmpID(@Context UriInfo uriinfo,@Context HttpHeaders headers)
{
	/*if(year==2014)
	{
	return empID+"_"+name+"::MatrixParam::"+empid;
	}
	else
	{
		return "default";
	}*/
	return uriinfo.getPath()+":::"+uriinfo.getQueryParameters()+":::"+headers.getCookies()+":::"+headers.getRequestHeaders();
}



/*@POST
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/empPost")
public employee getPEmpID(employee emp)
{
	return emp;
}*/


@POST
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/empPost")
public Response getPEmpID(employee emp,@Context UriInfo uriinfo)
{
	String empname=emp.getName();
	URI uri=uriinfo.getAbsolutePathBuilder().path(empname).build();
	
	return Response.created(uri).entity(emp).build();	
	
}


public void deleteEmp()
{
	
}
}
