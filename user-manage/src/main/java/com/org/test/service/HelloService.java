package com.org.test.service;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import com.org.test.dao.HelloWorld;

@Path("/helloService")
public class HelloService {
	
	protected final Logger logger =Logger.getLogger(this.getClass()) ;

	@Resource(name = "helloWorld")
	private HelloWorld helloWorld;
	@GET
	@Produces({ MediaType.TEXT_PLAIN})
	@Path("/request/{param}")
	public String getHello(@Context HttpServletRequest servletRequest, 
			@Context HttpServletResponse servletResponse,@PathParam("param") String param){
		return helloWorld.helloWorld(param);
	}

}
