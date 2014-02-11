package com.kilbees.struts2.action.utils;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.kilbees.bussiness.model.DrugCategory;
import com.kilbees.hibernate.idao.IItemDAO;
import com.kilbees.struts2.action.AbstractAction;

public class FilterSupplieraAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	private IItemDAO itemDAO;
	
	private List<DrugCategory> categoryList;
	
	

	

	public String loadCategoyFilter()
	{
		categoryList = itemDAO.getCategoryList();
		return SUCCESS;
	}
	
	public IItemDAO getItemDAO() {
		return itemDAO;
	}

	public void setItemDAO(IItemDAO itemDAO) {
		this.itemDAO = itemDAO;
	}
	
	public List<DrugCategory> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(List<DrugCategory> categoryList) {
		this.categoryList = categoryList;
	}

}
