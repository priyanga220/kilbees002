package com.kilbees.bussiness.model;

import java.text.SimpleDateFormat;

public abstract class DomainDefault 
{
	protected SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-MM-yyyy");
	SimpleDateFormat TIME = new SimpleDateFormat("HH:mm");
	private static final SimpleDateFormat DATE_FULL_FORMAT = new SimpleDateFormat("dd-MM-yyyy HH:mm");
}
