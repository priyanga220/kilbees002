package com.kilbees.hibernate.idao;

import com.kilbees.bussiness.exception.KilbeesLoginException;
import com.kilbees.bussiness.model.SystemLogin;

public interface ISysLoginDAO extends IAbstractDAO
{
	public SystemLogin retrieveUserBy(String UserName) throws KilbeesLoginException;
}
