package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springinaction.springidol.exec.PerformanceException;

public class Main {

	public static void main(String[] args) 
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-hibernate-configuration.xml");
				Performer performer=(Performer)ctx.getBean("duke");
				Performer performer2=(Performer)ctx.getBean("duke2");
				Performer kenny =(Performer)ctx.getBean("kenny2");
				Performer hank =(Performer)ctx.getBean("hank1");
				
				Performer hank2 =(Performer)ctx.getBean("hank2");
				Performer hank3 =(Performer)ctx.getBean("hank3");
				
				Performer poeticJuggler=(Performer)ctx.getBean("poeticDuke");
				try
				{
					System.out.println("");
					System.out.println("Normal bean");
					performer.perform();
					System.out.println("");
					System.out.println("Constructor arg");
					performer2.perform();
					System.out.println("");
					System.out.println("Constructor arg  <constructor-arg ref");
					poeticJuggler.perform();
					System.out.println("");
					System.out.println("Setter Injection  <hhhhh ref");
					kenny.perform();
					System.out.println("");
					System.out.println("Collections     :  List");
					hank.perform();
					System.out.println("");
					System.out.println("Collections     :  Set");
					hank2.perform();
					System.out.println("");
					System.out.println("Collections     :  Map");
					hank3.perform();
					
					System.out.println("");
					System.out.println("");
					System.out.println("");
					System.out.println("AUTOWIRE ");
					Performer autowirekenny=(Performer)ctx.getBean("autowirekenny");
					autowirekenny.perform();
					
					System.out.println("");
					System.out.println("Annotated AUTOWIRE / inject");
					Performer annotatedautowirekenny=(Performer)ctx.getBean("annotatedautowirekenny");
					annotatedautowirekenny.perform();
				}
				catch(PerformanceException ex)
				{
					
				}
				finally
				{
				}

	}

}
