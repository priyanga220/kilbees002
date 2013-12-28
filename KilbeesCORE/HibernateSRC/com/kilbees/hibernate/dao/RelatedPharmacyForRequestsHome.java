package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.RelatedPharmacyForRequests;
import com.kilbees.bussiness.model.RelatedPharmacyForRequestsId;

/**
 * Home object for domain model class RelatedPharmacyForRequests.
 * @see .RelatedPharmacyForRequests
 * @author Hibernate Tools
 */

public class RelatedPharmacyForRequestsHome {

	private static final Log log = LogFactory
			.getLog(RelatedPharmacyForRequestsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(RelatedPharmacyForRequests transientInstance) {
		log.debug("persisting RelatedPharmacyForRequests instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(RelatedPharmacyForRequests persistentInstance) {
		log.debug("removing RelatedPharmacyForRequests instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public RelatedPharmacyForRequests merge(
			RelatedPharmacyForRequests detachedInstance) {
		log.debug("merging RelatedPharmacyForRequests instance");
		try {
			RelatedPharmacyForRequests result = entityManager
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public RelatedPharmacyForRequests findById(RelatedPharmacyForRequestsId id) {
		log.debug("getting RelatedPharmacyForRequests instance with id: " + id);
		try {
			RelatedPharmacyForRequests instance = entityManager.find(
					RelatedPharmacyForRequests.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
