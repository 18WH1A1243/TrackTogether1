package com.ts.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;

import com.rest.dto.User;
import com.ts.db.HibernateTemplate;

public class UserDAO {
	private SessionFactory factory = null;
	
	public int register(User user) {		
		return HibernateTemplate.addObject(user);
	}

	public User getUser(int userId) {
		return (User)HibernateTemplate.getObject(User.class,userId);
	}

	public List<User> getAllUsers() {
		List<User> users=(List)HibernateTemplate.getObjectListByQuery("From User");
		return users;	
	}

	public List<User> getUserByName(String userName) {	
		return (List)HibernateTemplate.getObjectListByName(User.class,"userName",userName);
	}
	
	public User getUserByUserPass(String userName,String password) {

		return (User)HibernateTemplate.getObjectByUserPass(userName,password);
	}

}