package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.PharmacyOrder;

/**
 * Home object for domain model class PharmacyOrder.
 * @see .PharmacyOrder
 * @author Hibernate Tools
 */

public class PharmacyOrderHome {

	private static final Log log = LogFactory.getLog(PharmacyOrderHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PharmacyOrder transientInstance) {
		log.debug("persisting PharmacyOrder instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PharmacyOrder persistentInstance) {
		log.debug("removing PharmacyOrder instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PharmacyOrder merge(PharmacyOrder detachedInstance) {
		log.debug("merging PharmacyOrder instance");
		try {
			PharmacyOrder result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PharmacyOrder findById(String id) {
		log.debug("getting PharmacyOrder instance with id: " + id);
		try {
			PharmacyOrder instance = entityManager
					.find(PharmacyOrder.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
