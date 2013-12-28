package com.springinaction.springidol;

@StringedInstrument
public class QualifiedInstrument implements Instrument 
{

	public QualifiedInstrument()
	{
		
	}
	@Override
	public void play() {
		System.out.println("Qualified Instrument  : PLAY PLAY PLAY");

	}

}
