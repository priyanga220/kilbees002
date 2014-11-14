package com.kilbees.web.service.soap;

import org.hibernate.Query;
import org.hibernate.Session;

import com.kilbees.bussiness.model.DrugCategory;

public class SoapwsExample implements ISoapwsExample 
{

	@Override
	public DrugCategory getCategory(String catid) 
	{
		DrugCategory cat = null;

		Session ses =  sessionFactory.getCurrentSession();
		System.out.println("Flushmode   : "+ses.getFlushMode().toString());
		System.out.print("Checking Lay Loading");
		Query query = ses.createQuery(	"from DrugCategory dc where dc.categoryNo=?").setString(1, catid);
		query.setCacheable(true); 
		cat = (DrugCategory)query.uniqueResult();
		if (cat != null) {
			System.out.println("load DrugCategory 10  "+cat.getCategoryName());
			cat.setCategoryName(username);
			if(password.equals("11223344"))
			{
				throw new RuntimeException();// KilbeesRollbackException("Bussines Rule RL000001 Violated");
			}
		}
		return cat;
	}

}
