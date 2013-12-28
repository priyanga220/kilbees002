package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.PharmacyValuation;

/**
 * Home object for domain model class PharmacyValuation.
 * @see .PharmacyValuation
 * @author Hibernate Tools
 */

public class PharmacyValuationHome {

	private static final Log log = LogFactory
			.getLog(PharmacyValuationHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PharmacyValuation transientInstance) {
		log.debug("persisting PharmacyValuation instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PharmacyValuation persistentInstance) {
		log.debug("removing PharmacyValuation instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PharmacyValuation merge(PharmacyValuation detachedInstance) {
		log.debug("merging PharmacyValuation instance");
		try {
			PharmacyValuation result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PharmacyValuation findById(BigDecimal id) {
		log.debug("getting PharmacyValuation instance with id: " + id);
		try {
			PharmacyValuation instance = entityManager.find(
					PharmacyValuation.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
