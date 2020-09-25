package com.rest.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@XmlRootElement
/* @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
property = "deptId")*/
@Entity
public class User {
	@Id@GeneratedValue
	private int userId;
    private String userName;
    private String password;
    private String contactNo;
    
    public User(){
    	super();
    }

	public User(int userId, String userName, String password, String contactNo) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.contactNo = contactNo;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
    
	}