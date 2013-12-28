package com.springinaction.springidol;

import org.springframework.context.annotation.Scope;

@Scope 
public class Knife implements Tools
{
	public Knife()
	{
		
	}

	@Override
	public void Cut() {
		System.out.println("Coutiing : Cutting : Cutting ");
		
	}
}
