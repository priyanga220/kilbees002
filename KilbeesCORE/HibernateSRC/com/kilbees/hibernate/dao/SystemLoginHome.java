package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.SystemLogin;

/**
 * Home object for domain model class SystemLogin.
 * @see .SystemLogin
 * @author Hibernate Tools
 */

public class SystemLoginHome {

	private static final Log log = LogFactory.getLog(SystemLoginHome.class);

	@PersistenceContext
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
	}
}
