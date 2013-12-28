package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.GrnEdit;
import com.kilbees.bussiness.model.GrnEditId;

/**
 * Home object for domain model class GrnEdit.
 * @see .GrnEdit
 * @author Hibernate Tools
 */
public class GrnEditHome {

	private static final Log log = LogFactory.getLog(GrnEditHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(GrnEdit transientInstance) {
		log.debug("persisting GrnEdit instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(GrnEdit persistentInstance) {
		log.debug("removing GrnEdit instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public GrnEdit merge(GrnEdit detachedInstance) {
		log.debug("merging GrnEdit instance");
		try {
			GrnEdit result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public GrnEdit findById(GrnEditId id) {
		log.debug("getting GrnEdit instance with id: " + id);
		try {
			GrnEdit instance = entityManager.find(GrnEdit.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
