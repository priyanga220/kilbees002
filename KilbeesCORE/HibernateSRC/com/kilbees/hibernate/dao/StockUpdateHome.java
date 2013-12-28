package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.StockUpdate;
import com.kilbees.bussiness.model.StockUpdateId;

/**
 * Home object for domain model class StockUpdate.
 * @see .StockUpdate
 * @author Hibernate Tools
 */
public class StockUpdateHome {

	private static final Log log = LogFactory.getLog(StockUpdateHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(StockUpdate transientInstance) {
		log.debug("persisting StockUpdate instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(StockUpdate persistentInstance) {
		log.debug("removing StockUpdate instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public StockUpdate merge(StockUpdate detachedInstance) {
		log.debug("merging StockUpdate instance");
		try {
			StockUpdate result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public StockUpdate findById(StockUpdateId id) {
		log.debug("getting StockUpdate instance with id: " + id);
		try {
			StockUpdate instance = entityManager.find(StockUpdate.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
