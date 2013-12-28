package com.springinaction.springidol;

import com.springinaction.springidol.exec.PerformanceException;
import java.util.Collection;

public class OneManBand implements Performer 
{
	
	public OneManBand()
	{
		
	}

	@Override
	public void perform() throws PerformanceException 
	{
		for (Instrument instrument:instruments)
		{
			instrument.play();
		}
		
	}
	
	private Collection<Instrument> instruments;
	
	public void setInstruments(Collection<Instrument> instruments)
	{
		this.instruments=instruments;
	}

}
