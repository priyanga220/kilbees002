package com.springinaction.springidol;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.springinaction.springidol.exec.PerformanceException;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;

public class AnnotatedInstrumentalist implements Performer 
{
	
	/*public AnnotatedInstrumentalist()
	{
		
	}*/
	
	@Inject
	public AnnotatedInstrumentalist(Provider<Knife> knifeProvider)
	{
		System.out.println("");
		System.out.println("Provider Example ");
		knives =new HashSet<Knife>();
		for(int i=0;i<5; i++) 
		{
			knives.add(knifeProvider.get());
		}
		
		int ii = 0;
		for (Knife kn  : knives) 
		{
			System.out.println("Knife Number  :  "+ ii++);
			kn.Cut();
		}
	}
	
	@Override
	public void perform() throws PerformanceException {
		System.out.println("Playing "+song + " : ");
		System.out.println("    ");
		
		System.out.println("Playing    instrument get by annotated autowiring");
		instrument.play();
		
		System.out.println("");
		System.out.println("Playing    Qualified instrument get by annotated autowiring");
		qualifiedInstrument.play();
		
		System.out.println("");
		System.out.println("Playing instrument get by annotated Inject");
		injectedinstrument.play();
		
		System.out.println("");
		System.out.println("Playing Qualifed instrument get by annotated Inject");
		injectedQualifiedinstrument.play();
		


	}
	
	private String song;
	
	public void setSong(String song)
	{
		this.song=song;
	}
	public String getSong()
	{
		return song;
	}
	
	public String screamSong()
	{
		return song;
	}
	
	private Instrument instrument;
	
	@Autowired
	public void setInstrument(Instrument instrument)
	{
		this.instrument=instrument;
	}
	
	@Autowired
	@StringedInstrument
	private Instrument qualifiedInstrument;
	

	public void setQualifiedInstrument(Instrument qualifiedInstrument)
	{
		this.qualifiedInstrument = qualifiedInstrument;
	}
	
	private Instrument injectedinstrument;
	
	@Inject
	public void setInjectedInstrument(Instrument instrument)
	{
		this.injectedinstrument=instrument;
	}
	
	private Set<Knife>knives;
	
	private Instrument injectedQualifiedinstrument;
	
	@Inject
	@Named("guitar")
	public void setInjectedQualifiedinstrument(Instrument injectedQualifiedinstrument)
	{
		this.injectedQualifiedinstrument=injectedQualifiedinstrument;
	}
	
	
	
	
	

}
