package com.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rest.dto.User;
import com.ts.dao.UserDAO;

@Path("myresource")
public class MyResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
    
    @Path("regUser")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void registerUser(User user) {
    	System.out.println("Data recieved in register User" + user);
    	UserDAO userDao = new UserDAO();
    	userDao.register(user);
    }
    @Path("userLogin/{userName}/{password}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public User getUserByUserName(@PathParam("userName") String userName, @PathParam("password") String password){
    	System.out.println(userName);
		System.out.println("Recieved : " + userName + password); 
		UserDAO userDao = new UserDAO();
		User user = userDao.getUserByUserPass(userName,password);	
		//System.out.println(farmer); 
		if(user != null) {
			System.out.println(user);
			return user;
		} else {
			return null;
		}
		
		}

}
