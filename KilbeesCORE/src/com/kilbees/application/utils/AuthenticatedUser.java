package com.kilbees.application.utils;

import java.io.Serializable;
import java.util.List;

import com.kilbees.bussiness.model.SystemUserFunctions;

public class AuthenticatedUser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public enum UserRole
	{
		ADMIN,
		NORML,
		SADMIN,
	}
	
	private String userName;
	private String passWord;
	private List<SystemUserFunctions> userFuncList;
	private UserRole role;
	
	public AuthenticatedUser()
	{

	}

	public AuthenticatedUser(String un, String pw)
	{
		this.userName = un;
		this.passWord = pw;
	}
	
	public String getUserName() 
	{
		return userName;
	}
	public void setUserName(String userName) 
	{
		this.userName = userName;
	}
	public String getPassWord() 
	{
		return passWord;
	}
	public void setPassWord(String passWord) 
	{
		this.passWord = passWord;
	}
	
	public UserRole getRole() {
		return role;
	}

	public void setRole(UserRole role) {
		this.role = role;
	}

	public List<SystemUserFunctions> getUserFuncList() {
		return userFuncList;
	}

	public void setUserFuncList(List<SystemUserFunctions> userFuncList) {
		this.userFuncList = userFuncList;
	}
	
	
	
	
	
	
	

}
