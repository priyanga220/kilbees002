package com.habuma.spitter;

import com.kilbees.bussiness.model.DrugCategory;

public interface ISpitterDAO 
{
	public void addCategory(DrugCategory cat);
	
	public void getCategoryByID(int id);
}
