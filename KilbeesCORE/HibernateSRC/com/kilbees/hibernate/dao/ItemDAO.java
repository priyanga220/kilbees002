package com.kilbees.hibernate.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.kilbees.bussiness.model.DrugCategory;
import com.kilbees.bussiness.model.DrugItem;
import com.kilbees.hibernate.idao.IItemDAO;

@Repository
public class ItemDAO extends AbstractDao<DrugItem, String> implements IItemDAO 
{
	
	public SessionFactory sessionFactory;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<DrugItem> getItemList()
	{
		Query query = getSessionFactory().getCurrentSession().createQuery(	"from DrugItem it");
		query.setCacheable(true); 
		List<DrugItem> list = query.list();
		return list;
	}
	
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<DrugItem> getItemList(int frm , int to)
	{
		Query query = getSessionFactory().getCurrentSession().createQuery(	"from DrugItem it");
		query.setCacheable(true); 
		List<DrugItem> list = query.list();
		return list;
	}
	
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int allItemCount()
	{
		Query query = getSessionFactory().getCurrentSession().createQuery(	"select count(*) from DrugItem it");
		query.setCacheable(true); 
		int count = ((Long)query.uniqueResult()).intValue();
		System.out.println("Item Count   :  "+count);
		return count;
	}
	
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<DrugCategory> getCategoryList()
	{
		Query query = getSessionFactory().getCurrentSession().createQuery(	"from DrugCategory it");
		query.setCacheable(true); 
		List<DrugCategory> list = query.list();
		return list;
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
