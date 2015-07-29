package com.org.test.service;
import javax.annotation.Resource;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

import org.apache.log4j.Logger;
import org.codehaus.jettison.json.JSONException;

import com.org.test.dao.UserDao;
import com.org.test.model.User;

@Path("/userService")
@Transactional
public class UserServiceRest {
	protected final Logger logger =Logger.getLogger(this.getClass()) ;
	@Resource(name = "userDao")
	private UserDao userDao;
    @Context
    private Request request;
    @Context
    private UriInfo uriInfo;
	@GET
    @Path("/getUserData/{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public User putUserData(@PathParam("id") int id) throws JSONException{
		/*System.out.println("####getUser#####");
        System.out.println("id:" + id);
        System.out.println("Method:" + request.getMethod());
        System.out.println("uri:" + uriInfo.getPath());*/
		User user=userDao.findById(id);
		logger.info("****************************");
		logger.info(user.toString());
		logger.info("****************************");
		
		if (user==null||user.getId()==0){
			return null;
		}else{
//			return new JSONObject().put("userid", user.getId())
//	                .put("username", user.getUsername())
//	                .put("password", user.getPassword());
			return user;
		}
	}

}
