package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.Theme;

/**
 * Home object for domain model class Theme.
 * @see .Theme
 * @author Hibernate Tools
 */

public class ThemeHome {

	private static final Log log = LogFactory.getLog(ThemeHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Theme transientInstance) {
		log.debug("persisting Theme instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Theme persistentInstance) {
		log.debug("removing Theme instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Theme merge(Theme detachedInstance) {
		log.debug("merging Theme instance");
		try {
			Theme result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Theme findById(String id) {
		log.debug("getting Theme instance with id: " + id);
		try {
			Theme instance = entityManager.find(Theme.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
