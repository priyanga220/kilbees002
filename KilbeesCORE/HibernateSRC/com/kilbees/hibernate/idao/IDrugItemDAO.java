package com.kilbees.hibernate.idao;

import java.util.List;

import com.kilbees.bussiness.exception.KilbeesRollbackException;
import com.kilbees.bussiness.model.DrugItem;

public interface IDrugItemDAO extends IAbstractDAO
{
	public List<DrugItem> loadDrugItemByCategory(String categoryNo) throws KilbeesRollbackException;
}
