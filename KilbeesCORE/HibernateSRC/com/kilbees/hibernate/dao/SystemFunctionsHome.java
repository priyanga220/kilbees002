package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.SystemFunctions;

/**
 * Home object for domain model class SystemFunctions.
 * @see .SystemFunctions
 * @author Hibernate Tools
 */

public class SystemFunctionsHome {

	private static final Log log = LogFactory.getLog(SystemFunctionsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SystemFunctions transientInstance) {
		log.debug("persisting SystemFunctions instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SystemFunctions persistentInstance) {
		log.debug("removing SystemFunctions instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SystemFunctions merge(SystemFunctions detachedInstance) {
		log.debug("merging SystemFunctions instance");
		try {
			SystemFunctions result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SystemFunctions findById(String id) {
		log.debug("getting SystemFunctions instance with id: " + id);
		try {
			SystemFunctions instance = entityManager.find(
					SystemFunctions.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
