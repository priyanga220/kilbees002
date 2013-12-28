package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.StockValuation;
import com.kilbees.bussiness.model.StockValuationId;

/**
 * Home object for domain model class StockValuation.
 * @see .StockValuation
 * @author Hibernate Tools
 */

public class StockValuationHome {

	private static final Log log = LogFactory.getLog(StockValuationHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(StockValuation transientInstance) {
		log.debug("persisting StockValuation instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(StockValuation persistentInstance) {
		log.debug("removing StockValuation instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public StockValuation merge(StockValuation detachedInstance) {
		log.debug("merging StockValuation instance");
		try {
			StockValuation result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public StockValuation findById(StockValuationId id) {
		log.debug("getting StockValuation instance with id: " + id);
		try {
			StockValuation instance = entityManager.find(StockValuation.class,
					id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
