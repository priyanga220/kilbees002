package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.CustPointSpends;
import com.kilbees.bussiness.model.CustPointSpendsId;

/**
 * Home object for domain model class CustPointSpends.
 * @see .CustPointSpends
 * @author Hibernate Tools
 */

public class CustPointSpendsHome {

	private static final Log log = LogFactory.getLog(CustPointSpendsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(CustPointSpends transientInstance) {
		log.debug("persisting CustPointSpends instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(CustPointSpends persistentInstance) {
		log.debug("removing CustPointSpends instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public CustPointSpends merge(CustPointSpends detachedInstance) {
		log.debug("merging CustPointSpends instance");
		try {
			CustPointSpends result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CustPointSpends findById(CustPointSpendsId id) {
		log.debug("getting CustPointSpends instance with id: " + id);
		try {
			CustPointSpends instance = entityManager.find(
					CustPointSpends.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
