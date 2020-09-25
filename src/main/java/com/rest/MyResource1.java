package com.rest;

import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rest.dto.User;
import com.ts.dao.UserDAO;

@Path("myresource1")
public class MyResource1 {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
    @Path("regUser")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String daoTest() {
    	User user = new User();
    	user.setUserId(1);
    	user.setUserName("SAI");
    	user.setPassword("sai");
    	user.setContactNo("99887766");
    	
    	UserDAO userDAO = new UserDAO();
    	userDAO.register(user);
    	    	return "Success";
    }
    
}
