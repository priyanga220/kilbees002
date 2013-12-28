package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.ItemConsumption;
import com.kilbees.bussiness.model.ItemConsumptionId;

/**
 * Home object for domain model class ItemConsumption.
 * @see .ItemConsumption
 * @author Hibernate Tools
 */

public class ItemConsumptionHome {

	private static final Log log = LogFactory.getLog(ItemConsumptionHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ItemConsumption transientInstance) {
		log.debug("persisting ItemConsumption instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ItemConsumption persistentInstance) {
		log.debug("removing ItemConsumption instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ItemConsumption merge(ItemConsumption detachedInstance) {
		log.debug("merging ItemConsumption instance");
		try {
			ItemConsumption result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ItemConsumption findById(ItemConsumptionId id) {
		log.debug("getting ItemConsumption instance with id: " + id);
		try {
			ItemConsumption instance = entityManager.find(
					ItemConsumption.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
