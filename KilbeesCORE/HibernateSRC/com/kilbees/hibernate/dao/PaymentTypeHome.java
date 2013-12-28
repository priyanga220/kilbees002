package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.PaymentType;
import com.kilbees.bussiness.model.PaymentTypeId;

/**
 * Home object for domain model class PaymentType.
 * @see .PaymentType
 * @author Hibernate Tools
 */

public class PaymentTypeHome {

	private static final Log log = LogFactory.getLog(PaymentTypeHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PaymentType transientInstance) {
		log.debug("persisting PaymentType instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PaymentType persistentInstance) {
		log.debug("removing PaymentType instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PaymentType merge(PaymentType detachedInstance) {
		log.debug("merging PaymentType instance");
		try {
			PaymentType result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PaymentType findById(PaymentTypeId id) {
		log.debug("getting PaymentType instance with id: " + id);
		try {
			PaymentType instance = entityManager.find(PaymentType.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
