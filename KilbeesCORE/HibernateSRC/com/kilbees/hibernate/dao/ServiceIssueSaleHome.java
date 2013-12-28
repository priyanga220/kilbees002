package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.ServiceIssueSale;
import com.kilbees.bussiness.model.ServiceIssueSaleId;

/**
 * Home object for domain model class ServiceIssueSale.
 * @see .ServiceIssueSale
 * @author Hibernate Tools
 */

public class ServiceIssueSaleHome {

	private static final Log log = LogFactory
			.getLog(ServiceIssueSaleHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ServiceIssueSale transientInstance) {
		log.debug("persisting ServiceIssueSale instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ServiceIssueSale persistentInstance) {
		log.debug("removing ServiceIssueSale instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ServiceIssueSale merge(ServiceIssueSale detachedInstance) {
		log.debug("merging ServiceIssueSale instance");
		try {
			ServiceIssueSale result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ServiceIssueSale findById(ServiceIssueSaleId id) {
		log.debug("getting ServiceIssueSale instance with id: " + id);
		try {
			ServiceIssueSale instance = entityManager.find(
					ServiceIssueSale.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
