package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.SystemUserUnit;
import com.kilbees.bussiness.model.SystemUserUnitId;

/**
 * Home object for domain model class SystemUserUnit.
 * @see .SystemUserUnit
 * @author Hibernate Tools
 */

public class SystemUserUnitHome {

	private static final Log log = LogFactory.getLog(SystemUserUnitHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SystemUserUnit transientInstance) {
		log.debug("persisting SystemUserUnit instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SystemUserUnit persistentInstance) {
		log.debug("removing SystemUserUnit instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SystemUserUnit merge(SystemUserUnit detachedInstance) {
		log.debug("merging SystemUserUnit instance");
		try {
			SystemUserUnit result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SystemUserUnit findById(SystemUserUnitId id) {
		log.debug("getting SystemUserUnit instance with id: " + id);
		try {
			SystemUserUnit instance = entityManager.find(SystemUserUnit.class,
					id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
