package com.kilbees.bussiness.imanager;



import com.kilbees.application.utils.AuthenticatedUser;
import com.kilbees.bussiness.exception.KilbeesLoginException;
import com.kilbees.bussiness.exception.KilbeesRollbackException;
import com.kilbees.bussiness.model.DrugCategory;


public interface IKILBEESLoginManager 
{
	public void getList();
	public String getUsername();
	public String getPassword();
	public DrugCategory getCategory() throws KilbeesRollbackException;
	public AuthenticatedUser authenticateUser() throws KilbeesLoginException;
	public void setUsername(String username);
	public void setPassword(String password);
	
}
