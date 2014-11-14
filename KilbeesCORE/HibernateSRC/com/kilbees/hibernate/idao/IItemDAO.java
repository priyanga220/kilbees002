package com.kilbees.hibernate.idao;

import java.util.List;

import com.kilbees.bussiness.model.DrugCategory;
import com.kilbees.bussiness.model.DrugItem;

public interface IItemDAO extends IAbstractDAO
{
	public List<DrugItem> getItemList();
	public List<DrugItem> getItemList(int frm, int to);
	public List<DrugCategory> getCategoryList();
	public int allItemCount();
}
