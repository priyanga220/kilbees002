package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.PharmacyIssueCancelItem;
import com.kilbees.bussiness.model.PharmacyIssueCancelItemId;

/**
 * Home object for domain model class PharmacyIssueCancelItem.
 * @see .PharmacyIssueCancelItem
 * @author Hibernate Tools
 */

public class PharmacyIssueCancelItemHome {

	private static final Log log = LogFactory
			.getLog(PharmacyIssueCancelItemHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PharmacyIssueCancelItem transientInstance) {
		log.debug("persisting PharmacyIssueCancelItem instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PharmacyIssueCancelItem persistentInstance) {
		log.debug("removing PharmacyIssueCancelItem instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PharmacyIssueCancelItem merge(
			PharmacyIssueCancelItem detachedInstance) {
		log.debug("merging PharmacyIssueCancelItem instance");
		try {
			PharmacyIssueCancelItem result = entityManager
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PharmacyIssueCancelItem findById(PharmacyIssueCancelItemId id) {
		log.debug("getting PharmacyIssueCancelItem instance with id: " + id);
		try {
			PharmacyIssueCancelItem instance = entityManager.find(
					PharmacyIssueCancelItem.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
