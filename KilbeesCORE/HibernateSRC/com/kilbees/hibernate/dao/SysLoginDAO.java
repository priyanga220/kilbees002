package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.kilbees.application.utils.Constants;
import com.kilbees.bussiness.exception.KilbeesLoginException;
import com.kilbees.bussiness.model.SystemLogin;
import com.kilbees.hibernate.idao.ISysLoginDAO;

/**
 * Home object for domain model class SystemLogin.
 * @see .SystemLogin
 * @author Hibernate Tools
 */

@Repository
public class SysLoginDAO extends AbstractDao<SystemLogin, String> implements ISysLoginDAO 
{
	public SessionFactory sessionFactory;

	private static final Log log = LogFactory.getLog(SysLoginDAO.class);

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true , isolation = Isolation.DEFAULT, rollbackFor = KilbeesLoginException.class) 
	public SystemLogin retrieveUserBy(String UserName) throws KilbeesLoginException
	{
		Session hSession =  getSessionFactory().getCurrentSession();
		Query query = hSession.createQuery(	"from SystemLogin sl where sl.userName=:userName").setParameter("userName", UserName);
		query.setCacheable(true);
		List<SystemLogin> slL =  query.list();
		if(slL!=null && slL.size() == 1)
		{
			return slL.get(0);
		}
		else if(slL.size() > 1)
		{
			throw new KilbeesLoginException(Constants.MULTIPLE_USERS_SAME_UN);
		}
		throw new KilbeesLoginException(Constants.USERNAME_NOT_VALID);
	}

	/*@PersistenceContext
	private EntityManager entityManager;

	public void persist(SystemLogin transientInstance) {
		log.debug("persisting SystemLogin instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SystemLogin persistentInstance) {
		log.debug("removing SystemLogin instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SystemLogin merge(SystemLogin detachedInstance) {
		log.debug("merging SystemLogin instance");
		try {
			SystemLogin result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SystemLogin findById(String id) {
		log.debug("getting SystemLogin instance with id: " + id);
		try {
			SystemLogin instance = entityManager.find(SystemLogin.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}*/
	
	
}
