package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.SystemModules;

/**
 * Home object for domain model class SystemModules.
 * @see .SystemModules
 * @author Hibernate Tools
 */

public class SystemModulesHome {

	private static final Log log = LogFactory.getLog(SystemModulesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SystemModules transientInstance) {
		log.debug("persisting SystemModules instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SystemModules persistentInstance) {
		log.debug("removing SystemModules instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SystemModules merge(SystemModules detachedInstance) {
		log.debug("merging SystemModules instance");
		try {
			SystemModules result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SystemModules findById(String id) {
		log.debug("getting SystemModules instance with id: " + id);
		try {
			SystemModules instance = entityManager
					.find(SystemModules.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
