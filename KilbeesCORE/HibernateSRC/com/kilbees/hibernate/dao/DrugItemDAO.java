package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.kilbees.application.utils.Constants;
import com.kilbees.bussiness.exception.KilbeesLoginException;
import com.kilbees.bussiness.exception.KilbeesRollbackException;
import com.kilbees.bussiness.model.DomainDefault;
import com.kilbees.bussiness.model.DrugItem;
import com.kilbees.bussiness.model.SystemLogin;
import com.kilbees.hibernate.idao.IDrugItemDAO;

/**
 * Home object for domain model class DrugItem.
 * @see .DrugItem
 * @author Hibernate Tools
 */

@Repository
@Transactional(readOnly = true)
public class DrugItemDAO extends AbstractDao<DrugItem, String> implements IDrugItemDAO {

	private static final Log log = LogFactory.getLog(DrugItemDAO.class);
	
	private SessionFactory sessionFactory;

	

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true , isolation = Isolation.DEFAULT, rollbackFor = KilbeesRollbackException.class) 
	public List<DrugItem> loadDrugItemByCategory(String categoryNo) throws KilbeesRollbackException 
	{
		List<DrugItem> result = null;
		
		Query query = sessionFactory.getCurrentSession().createQuery("from DrugItem di where di.drugCategory.categoryNo=:catNo").setParameter("catNo", categoryNo);
		query.setCacheable(true);
		result =  query.list();
		
		if(result == null || result.size() == 0)
		{
			throw new KilbeesRollbackException(Constants.NO_RESULT);
		}
		
		return result;
		
		

		
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@Autowired
	@Qualifier("sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) 
	{
		Logger log = Logger.getLogger(getClass());
		log.info(Constants.SET_SESSION_FAC_INFO);
		this.sessionFactory = sessionFactory;
	}

	/*@Override
	public List<? extends DomainDefault> searchByQuaryStringWithLimit(
			String sql, Map<String, Object> parameterMap, int start, int max) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getDataSize(String quary, Map<String, Object> parameterMap) {
		// TODO Auto-generated method stub
		return 0;
	}*/
	

}
