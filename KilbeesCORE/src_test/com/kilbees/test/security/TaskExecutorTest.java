package com.kilbees.test.security;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class TaskExecutorTest 
{
	public static void main(String ar[])
	{
		String threadId = Thread.currentThread().getName();
		System.out.println("Starting Thread excutor from main thread  : "+threadId);
		
		ExecutorService executorService = Executors.newFixedThreadPool(10);

		List<Callable<String>> callables = new ArrayList<Callable<String>>();
		
		List<Future<String>> resu = new ArrayList<Future<String>>();
			
		

		callables.add(new MyCalleble(600));
		
		callables.add(new MyCalleble(800));
		
		callables.add(new MyCalleble(1000));
		
		callables.add(new MyCalleble(400));
		
		callables.add(new MyCalleble(250));
		
		callables.add(new MyCalleble(825));
		
		callables.add(new MyCalleble(102));
		
		callables.add(new MyCalleble(356));
		
		callables.add(new MyCalleble(875));
		
		callables.add(new MyCalleble(965));
		
		callables.add(new MyCalleble(548));
		
		callables.add(new MyCalleble(789));

		
		
		try
		{
			resu = executorService.invokeAll(callables);
			//executorService.shutdown();
			//executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			System.out.println("Invokingggg errror");
			e.printStackTrace();
		}

		executorService.shutdown();
		try
		{
			for(Future< String> fu : resu)
			{
				System.out.println("Thred Results    :   " + fu.get());
			}
		}
		catch(Exception exx)
		{
			System.out.println("Printing errrrorr");
			exx.printStackTrace();
		}

		
		
		
	}
}

class MyCalleble implements Callable<String>
{
	private int waitTime;
	String threadId;// = Thread.currentThread().getName();
	public MyCalleble(int arg)
	{
		this.waitTime = arg;
		
	}

	@Override
	public String call()
	throws Exception 
	{
		threadId = Thread.currentThread().getName();
		System.out.println("Call the MyCalleble with wait time  : "+ waitTime);
		for(int i = 0; i < waitTime ; i++)
		{
			System.out.println("Thread ID : "+threadId +" Iterations     : "+ waitTime);
		}
		return "Result of WAITED : "+this.waitTime;
	}
	
}
