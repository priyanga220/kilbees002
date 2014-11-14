package com.kilbees.struts2.interceptor;

import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.kilbees.application.utils.AuthenticatedUser;
import com.kilbees.application.utils.SessionKey;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class LoginInterceptor implements Interceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		HttpServletResponse response = ServletActionContext.getResponse();

        response.setHeader("Cache-Control", "no-store");
        response.setHeader("Pragma", "no-cache");
        response.setDateHeader("Expires", 0);
		Map<String, Object> sessionAtrri = invocation.getInvocationContext().getSession();
		if(sessionAtrri == null || sessionAtrri.get(SessionKey.SESSION_USER) == null)
		{
			System.out.println("Sesion Object is NULL");
			return "login";
		}
		else
		{
			System.out.println("Sesion Object is NOT NULL AND INVOLKING ACTION");
			if(!((AuthenticatedUser)sessionAtrri.get(SessionKey.SESSION_USER)).equals(null))
			{
				System.out.println("Involking the Action "+invocation.getAction().toString());
				return invocation.invoke();
			}
			else
			{
				return "login";
			}
			
		}

	}

}
