package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.GrnCancel;
import com.kilbees.bussiness.model.GrnCancelId;

/**
 * Home object for domain model class GrnCancel.
 * @see .GrnCancel
 * @author Hibernate Tools
 */

public class GrnCancelHome {

	private static final Log log = LogFactory.getLog(GrnCancelHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(GrnCancel transientInstance) {
		log.debug("persisting GrnCancel instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(GrnCancel persistentInstance) {
		log.debug("removing GrnCancel instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public GrnCancel merge(GrnCancel detachedInstance) {
		log.debug("merging GrnCancel instance");
		try {
			GrnCancel result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public GrnCancel findById(GrnCancelId id) {
		log.debug("getting GrnCancel instance with id: " + id);
		try {
			GrnCancel instance = entityManager.find(GrnCancel.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
