package com.springinaction.springidol;

import java.util.Map;

import com.springinaction.springidol.exec.PerformanceException;

public class OneManBand2 implements Performer
{
	public OneManBand2()
	{
	}

	@Override
	public void perform() throws PerformanceException 
	{
		for (String key:instruments.keySet())
		{
			System.out.print(key + " : ");
			Instrument instrument = instruments.get(key);
			instrument.play();
		}
		
	}
	
	private Map<String,Instrument> instruments;
	
	public void setInstruments(Map<String,Instrument>instruments)
	{
		this.instruments=instruments;
	}

}
