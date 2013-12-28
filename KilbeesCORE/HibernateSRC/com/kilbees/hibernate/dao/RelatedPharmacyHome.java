package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.RelatedPharmacy;
import com.kilbees.bussiness.model.RelatedPharmacyId;

/**
 * Home object for domain model class RelatedPharmacy.
 * @see .RelatedPharmacy
 * @author Hibernate Tools
 */

public class RelatedPharmacyHome {

	private static final Log log = LogFactory.getLog(RelatedPharmacyHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(RelatedPharmacy transientInstance) {
		log.debug("persisting RelatedPharmacy instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(RelatedPharmacy persistentInstance) {
		log.debug("removing RelatedPharmacy instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public RelatedPharmacy merge(RelatedPharmacy detachedInstance) {
		log.debug("merging RelatedPharmacy instance");
		try {
			RelatedPharmacy result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public RelatedPharmacy findById(RelatedPharmacyId id) {
		log.debug("getting RelatedPharmacy instance with id: " + id);
		try {
			RelatedPharmacy instance = entityManager.find(
					RelatedPharmacy.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
