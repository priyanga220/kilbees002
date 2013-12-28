package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.TempQuantity;
import com.kilbees.bussiness.model.TempQuantityId;

/**
 * Home object for domain model class TempQuantity.
 * @see .TempQuantity
 * @author Hibernate Tools
 */

public class TempQuantityHome {

	private static final Log log = LogFactory.getLog(TempQuantityHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TempQuantity transientInstance) {
		log.debug("persisting TempQuantity instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TempQuantity persistentInstance) {
		log.debug("removing TempQuantity instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TempQuantity merge(TempQuantity detachedInstance) {
		log.debug("merging TempQuantity instance");
		try {
			TempQuantity result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TempQuantity findById(TempQuantityId id) {
		log.debug("getting TempQuantity instance with id: " + id);
		try {
			TempQuantity instance = entityManager.find(TempQuantity.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
