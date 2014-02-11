package com.kilbees.struts2.action.login;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.kilbees.application.utils.AuthenticatedUser;
import com.kilbees.application.utils.SessionKey;
import com.kilbees.bussiness.exception.KilbeesLoginException;
import com.kilbees.bussiness.exception.KilbeesRollbackException;
import com.kilbees.bussiness.exception.SessionNotExist;
import com.kilbees.bussiness.imanager.IKILBEESLoginManager;
import com.kilbees.bussiness.manager.KILBEESLoginManager;
import com.kilbees.bussiness.model.DrugCategory;
import com.kilbees.bussiness.model.SystemUserFunctions;
import com.kilbees.struts2.action.AbstractAction;



public class AuthenticateAction extends AbstractAction 
{

	private static final long serialVersionUID = 1L;
	private List<DrugCategory> collection;
	private DrugCategory category;
	private Logger logger = Logger.getLogger(AuthenticateAction.class);
	
	

	@Autowired
	private IKILBEESLoginManager loginManager;

	public String welcomeGuest()
	{
		return SUCCESS;
	}

	public String authenticateUser()
	{
		loginManager.getList();
		try
		{
			category = loginManager.getCategory();
			AuthenticatedUser au = loginManager.authenticateUser();
			logger.info("Authenticate Successful In Login ction");
			addSessionUserVariable(au);
			status = STATUS.SUCCESS;
			return SUCCESS;
		} 
		catch(KilbeesLoginException klex)
		{
			logger.info("[Login] Login exception " + klex.getMessage());
			addActionError(getText("user.login.error.authentication"));
			status = STATUS.FAILURE;
			return LOGIN;
		}
		catch (SessionNotExist e)
		{
			logger.info("[User] session variable set exception");
			addActionError(getText("user.login.error.authentication"));
			status = STATUS.FAILURE;
			return LOGIN;
		}
		catch(Exception ex)
		{
			logger.info("Exeption Occured   "+ex.getMessage());
			return ERROR;
		}
				
		
	}
	
	public String gotoHome()
	{
		try 
		{
			category = loginManager.getCategory();
			return SUCCESS;
		} catch (KilbeesRollbackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return LOGIN;
		}
		
	}
	
	public String logOut()
	{
		try 
		{
			removeSessionVariable(SessionKey.SESSION_USER);
			removeSessionVariable(SessionKey.HISTORY_ACTION);
		} 
		catch (SessionNotExist e) 
		{
			System.out.println(e);
		}
		addActionMessage("You have been Succesfully Logged Out");
		return SUCCESS;
	}
	
	//Validations----------------------------------------------------------------------------------------------------------

	public void validateAuthenticateUser()
	{
		if(loginManager.getUsername() == null || loginManager.getUsername().isEmpty())
		{
			addFieldError("kilbeesLoginManager.username", getText("username.required"));
		}
		if(loginManager.getPassword() == null || loginManager.getPassword().isEmpty())
		{
			addFieldError("kilbeesLoginManager.password", getText("password.required"));
		}
	}
	
	//END : Validations----------------------------------------------------------------------------------------------------
	
	
	//Getters & Setters----------------------------------------------------------------------------------------------------
	
	
	public IKILBEESLoginManager getKilbeesLoginManager() {
		return loginManager;
	}

	public void setKilbeesLoginManager(KILBEESLoginManager loginManager) 
	{
		this.loginManager = loginManager;
	}
	
	public List<DrugCategory> getCollection() {
		return collection;
	}

	public void setCollection(List<DrugCategory> collection) {
		this.collection = collection;
	}
	
	public DrugCategory getCategory() {
		return category;
	}

	public void setCategory(DrugCategory category) {
		this.category = category;
	}

	
	//END : Getters & Setters--------------------------------------------------------------------------------------------------

}
