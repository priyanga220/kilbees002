package com.springinaction.springidol;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AnnotatedAudience 
{
	@Pointcut( "execution(*com.springinaction.springidol.Performer.perform(..))")
	public void performance()
	{
		
	}
	
	@Before("performance()")
	public void takeSeats()
	{
		System.out.println("Annotated Audience - Theaudienceistakingtheirseats.");
	}
	
	@Before("performance()")
	public void turnOffCellPhones()
	{
		System.out.println("Annotated Audience - Theaudienceisturningofftheircellphones");
	}
	
	@AfterReturning("performance()")
	public void applaud()
	{
		System.out.println("Annotated Audience - CLAPCLAPCLAPCLAPCLAP");
	}
	
	@AfterThrowing("performance()")
	public void demandRefund()
	{
		System.out.println("Annotated Audience - Boo!Wewantourmoneyback!");
	}
}
