package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.ItemMovement;
import com.kilbees.bussiness.model.ItemMovementId;

/**
 * Home object for domain model class ItemMovement.
 * @see .ItemMovement
 * @author Hibernate Tools
 */

public class ItemMovementHome {

	private static final Log log = LogFactory.getLog(ItemMovementHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ItemMovement transientInstance) {
		log.debug("persisting ItemMovement instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ItemMovement persistentInstance) {
		log.debug("removing ItemMovement instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ItemMovement merge(ItemMovement detachedInstance) {
		log.debug("merging ItemMovement instance");
		try {
			ItemMovement result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ItemMovement findById(ItemMovementId id) {
		log.debug("getting ItemMovement instance with id: " + id);
		try {
			ItemMovement instance = entityManager.find(ItemMovement.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
