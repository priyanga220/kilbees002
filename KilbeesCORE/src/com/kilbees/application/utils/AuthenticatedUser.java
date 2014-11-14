package com.kilbees.application.utils;

import java.io.Serializable;
import java.util.ArrayList;
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
	
	private List<SystemUserFunctions> dashBoardFuncList = new ArrayList<>();
	private List<SystemUserFunctions> bussinessRulesFuncList = new ArrayList<>();
	private List<SystemUserFunctions> salesFuncList = new ArrayList<>();
	private List<SystemUserFunctions> inventryFuncList = new ArrayList<>();
	private List<SystemUserFunctions> reportFuncList = new ArrayList<>();
	private List<SystemUserFunctions> miscFuncList = new ArrayList<>();
	
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
	
	public List<SystemUserFunctions> getDashBoardFuncList() {
		return dashBoardFuncList;
	}

	public void setDashBoardFuncList(List<SystemUserFunctions> dashBoardFuncList) {
		this.dashBoardFuncList = dashBoardFuncList;
	}

	public List<SystemUserFunctions> getBussinessRulesFuncList() {
		return bussinessRulesFuncList;
	}

	public void setBussinessRulesFuncList(
			List<SystemUserFunctions> bussinessRulesFuncList) {
		this.bussinessRulesFuncList = bussinessRulesFuncList;
	}

	public List<SystemUserFunctions> getSalesFuncList() {
		return salesFuncList;
	}

	public void setSalesFuncList(List<SystemUserFunctions> salesFuncList) {
		this.salesFuncList = salesFuncList;
	}

	public List<SystemUserFunctions> getInventryFuncList() {
		return inventryFuncList;
	}

	public void setInventryFuncList(List<SystemUserFunctions> inventryFuncList) {
		this.inventryFuncList = inventryFuncList;
	}

	public List<SystemUserFunctions> getReportFuncList() {
		return reportFuncList;
	}

	public void setReportFuncList(List<SystemUserFunctions> reportFuncList) {
		this.reportFuncList = reportFuncList;
	}

	public List<SystemUserFunctions> getMiscFuncList() {
		return miscFuncList;
	}

	public void setMiscFuncList(List<SystemUserFunctions> miscFuncList) {
		this.miscFuncList = miscFuncList;
	}
	
	

	
	
	
	
	
	
	

}
