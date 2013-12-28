package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.PharmacyUnit;

/**
 * Home object for domain model class PharmacyUnit.
 * @see .PharmacyUnit
 * @author Hibernate Tools
 */

public class PharmacyUnitHome {

	private static final Log log = LogFactory.getLog(PharmacyUnitHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PharmacyUnit transientInstance) {
		log.debug("persisting PharmacyUnit instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PharmacyUnit persistentInstance) {
		log.debug("removing PharmacyUnit instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PharmacyUnit merge(PharmacyUnit detachedInstance) {
		log.debug("merging PharmacyUnit instance");
		try {
			PharmacyUnit result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PharmacyUnit findById(String id) {
		log.debug("getting PharmacyUnit instance with id: " + id);
		try {
			PharmacyUnit instance = entityManager.find(PharmacyUnit.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
