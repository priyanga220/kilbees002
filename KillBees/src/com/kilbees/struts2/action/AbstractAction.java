package com.kilbees.struts2.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.kilbees.application.utils.AuthenticatedUser;
import com.kilbees.application.utils.AuthenticatedUser.UserRole;
import com.kilbees.application.utils.SessionKey;
import com.kilbees.bussiness.exception.SessionNotExist;
import com.opensymphony.xwork2.ActionSupport;

public abstract class AbstractAction extends ActionSupport implements SessionAware
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final Integer DEFAULT_HEADER_KEY = -1;
	public static final String DEFAULT_HEADER_TEXT = "Invalid";
	public enum STATUS {SUCCESS, FAILURE, NOT_FOUND, SERVER_ERROR, DB_ERROR}


	private static final String SESSION_NOT_EXIST = "Session doesn't exist";
	private Map<SessionKey, Object> session = null;
	
	private int x;
	private int y;

	protected STATUS status;

	public String alwaysSuccess() {
		return SUCCESS;
	}
	
	public void addSessionUserVariable(AuthenticatedUser user) throws SessionNotExist {
		if(session != null) {
			session.put(SessionKey.SESSION_USER, user);
	} else {

			throw new SessionNotExist(SESSION_NOT_EXIST);
		}
	}

	public AuthenticatedUser getSessionUserVariable() throws SessionNotExist {
		if(session != null) {
			if(session.containsKey(SessionKey.SESSION_USER)) {
				return (AuthenticatedUser)session.get(SessionKey.SESSION_USER);
			} else {
				throw new SessionNotExist(SESSION_NOT_EXIST);
			}
		} else {
			System.out.println(SESSION_NOT_EXIST);
			throw new SessionNotExist(SESSION_NOT_EXIST);
		}
	}

	public void removeSessionVariable(SessionKey key) throws SessionNotExist {
		if(session != null) {
			if(session.containsKey(key)) {
				System.out.println("Session EXISTS AND Removinggggggg  yaa");
				session.remove(key);
			}
		} else {
			System.out.println(SESSION_NOT_EXIST);
			throw new SessionNotExist(SESSION_NOT_EXIST);
		}
	}

	public boolean verifySessionUser() throws SessionNotExist {
		if(session != null) {
			return session.containsKey(SessionKey.SESSION_USER);
		} else {
			System.out.println(SESSION_NOT_EXIST);
			throw new SessionNotExist(SESSION_NOT_EXIST);
		}
	}

	@Override
	@SuppressWarnings("unchecked")
	public void setSession(@SuppressWarnings("rawtypes")Map session) {
		this.session = session;
	}

	public STATUS getStatus() {
		return status;
	}

	public void setStatus(STATUS status) {
		this.status = status;
	}
	
	public boolean isLogin(){
		try{
			AuthenticatedUser user = (AuthenticatedUser)session.get(SessionKey.SESSION_USER);
			if(user != null){
				return true;
			}
			return false;
		}catch (Exception e) {
			return false;
		}
	}
	
	public boolean isAdmin() {
		try{
			AuthenticatedUser user = (AuthenticatedUser)session.get(SessionKey.SESSION_USER);
			if(user != null && user.getRole() == UserRole.ADMIN){
				return true;
			}
			return false;
		}catch (Exception e) {
			return false;
		}
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
