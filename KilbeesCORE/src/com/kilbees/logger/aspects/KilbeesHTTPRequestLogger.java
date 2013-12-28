package com.kilbees.logger.aspects;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
/*
 * 
 * 
 * 
 */


@Aspect
public class KilbeesHTTPRequestLogger 
{
	private Logger log = Logger.getLogger(getClass());
	
	@Around("execution(* com.kilbees.struts2.action.login.AuthenticateAction.authenticateUser())")
	public void logAroundRequest(ProceedingJoinPoint jointPoint)
	{
		long start=System.currentTimeMillis();
		log.info(" ************************************ Client HTTPRequest Comes In @  " + start +" To : "+jointPoint.getSignature().getName());
		try {
			jointPoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long end=System.currentTimeMillis();
		log.info(" ************************************ Client HTTPRequest Completed  @  " + end +" By : "+jointPoint.getSignature().getName());
		log.info(" ************************************ Client HTTPRequest Completed  in  " + (end-start) +" milliseconds - By : "+jointPoint.getSignature().getName());
	}
}
