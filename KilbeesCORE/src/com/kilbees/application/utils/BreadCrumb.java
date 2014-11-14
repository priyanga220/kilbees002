package com.kilbees.application.utils;

public class BreadCrumb 
{
	private boolean isSet = false;
	private String home;
	private String levelOne;
	private String levelTwo;
	private String levelThree;
	
	public BreadCrumb()
	{
		this.home = Constants.HOME_URL;
	}
	public boolean isSet() 
	{
		return isSet;
	}
	public void setSet(boolean isSet) 
	{
		this.isSet = isSet;
	}
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
	public String getLevelOne() {
		return levelOne;
	}
	public void setLevelOne(String levelOne) {
		this.levelOne = levelOne;
	}
	public String getLevelTwo() {
		return levelTwo;
	}
	public void setLevelTwo(String levelTwo) {
		this.levelTwo = levelTwo;
	}
	public String getLevelThree() {
		return levelThree;
	}
	public void setLevelThree(String levelThree) {
		this.levelThree = levelThree;
	}
	
	
	
	
}
