package com.kilbees.struts2.interceptor;

import java.util.Map;

import org.apache.struts2.interceptor.ParameterAware;

import com.kilbees.application.utils.BreadCrumb;
import com.kilbees.application.utils.SessionKey;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class BreadcrumbResolverInterceptor implements Interceptor,ParameterAware {

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
	public String intercept(ActionInvocation invocation) throws Exception 
	{
		//String sf = invocation.getInvocationContext().getr
		Map<String, Object> sessionAtrri = invocation.getInvocationContext().getSession();
		BreadCrumb bc = null;
		if(sessionAtrri !=null && sessionAtrri.get(SessionKey.BREADCRUMB)!=null)
		{
			 bc = (BreadCrumb)sessionAtrri.get(SessionKey.BREADCRUMB);
		}
		if(bc == null)
		{
			bc = new BreadCrumb();
		}
		return invocation.invoke();
	}
	
	@Override
	public void setParameters(Map<String,String[]> parameters)
	{
		
	}

}
