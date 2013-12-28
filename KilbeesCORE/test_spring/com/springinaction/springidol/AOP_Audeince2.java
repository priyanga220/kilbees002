package com.springinaction.springidol;

import org.aspectj.lang.ProceedingJoinPoint;

public class AOP_Audeince2 
{
	public void watchPerformance(ProceedingJoinPoint joinpoint)
	{
		try 
		{
			System.out.println("The audience is taking their seats.  - AOP_Audeince2");
			System.out.println("The audience is turning off their cellphones - AOP_Audeince2");
			long start=System.currentTimeMillis();
			joinpoint.proceed();
			long end=System.currentTimeMillis(); System.out.println("CLAP CLAP CLAP CLAP CLAP -AOP_Audeince2");
			System.out.println("The performance took"+(end-start) + "milliseconds. - AOP_Audeince2");
		} 
		catch(Throwable t)
		{
			System.out.println("Boo!Wewantourmoneyback! - AOP_Audeince2");
		}
	} 
}
