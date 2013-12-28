package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.SystemUserFunctions;
import com.kilbees.bussiness.model.SystemUserFunctionsId;

/**
 * Home object for domain model class SystemUserFunctions.
 * @see .SystemUserFunctions
 * @author Hibernate Tools
 */

public class SystemUserFunctionsHome {

	private static final Log log = LogFactory
			.getLog(SystemUserFunctionsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SystemUserFunctions transientInstance) {
		log.debug("persisting SystemUserFunctions instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SystemUserFunctions persistentInstance) {
		log.debug("removing SystemUserFunctions instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SystemUserFunctions merge(SystemUserFunctions detachedInstance) {
		log.debug("merging SystemUserFunctions instance");
		try {
			SystemUserFunctions result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SystemUserFunctions findById(SystemUserFunctionsId id) {
		log.debug("getting SystemUserFunctions instance with id: " + id);
		try {
			SystemUserFunctions instance = entityManager.find(
					SystemUserFunctions.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
