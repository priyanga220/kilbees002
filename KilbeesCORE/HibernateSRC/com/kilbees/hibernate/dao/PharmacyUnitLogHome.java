package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.PharmacyUnitLog;
import com.kilbees.bussiness.model.PharmacyUnitLogId;

/**
 * Home object for domain model class PharmacyUnitLog.
 * @see .PharmacyUnitLog
 * @author Hibernate Tools
 */

public class PharmacyUnitLogHome {

	private static final Log log = LogFactory.getLog(PharmacyUnitLogHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PharmacyUnitLog transientInstance) {
		log.debug("persisting PharmacyUnitLog instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PharmacyUnitLog persistentInstance) {
		log.debug("removing PharmacyUnitLog instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PharmacyUnitLog merge(PharmacyUnitLog detachedInstance) {
		log.debug("merging PharmacyUnitLog instance");
		try {
			PharmacyUnitLog result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PharmacyUnitLog findById(PharmacyUnitLogId id) {
		log.debug("getting PharmacyUnitLog instance with id: " + id);
		try {
			PharmacyUnitLog instance = entityManager.find(
					PharmacyUnitLog.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
