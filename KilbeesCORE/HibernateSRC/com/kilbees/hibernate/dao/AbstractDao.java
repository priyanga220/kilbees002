package com.kilbees.hibernate.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.kilbees.bussiness.model.DomainDefault;
import com.kilbees.hibernate.idao.IAbstractDAO;

public abstract class AbstractDao<T, K> implements IAbstractDAO
{
	public SessionFactory sessionFactory;
	
	@Override
	public List<? extends DomainDefault> retrieveByQuaryString( String queryString) 
	{
		// TODO Auto-generated method stub
		System.out.println("This is form That IABSTARCTDAO--> ABSTRACTDAO **********************************");
		return null;
	}
	
	@Override
	public List<? extends DomainDefault> searchByQuaryStringWithLimit(String sql, Map<String, Object> parameterMap, int start, int max) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public int getDataSize(String quary, Map<String, Object> parameterMap) 
	{
		// TODO Auto-generated method stub
		return 0;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Autowired
	@Qualifier("sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	

	
	
	
}
