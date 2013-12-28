package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.ItemPrice;
import com.kilbees.bussiness.model.ItemPriceId;

/**
 * Home object for domain model class ItemPrice.
 * @see .ItemPrice
 * @author Hibernate Tools
 */

public class ItemPriceHome {

	private static final Log log = LogFactory.getLog(ItemPriceHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ItemPrice transientInstance) {
		log.debug("persisting ItemPrice instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ItemPrice persistentInstance) {
		log.debug("removing ItemPrice instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ItemPrice merge(ItemPrice detachedInstance) {
		log.debug("merging ItemPrice instance");
		try {
			ItemPrice result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ItemPrice findById(ItemPriceId id) {
		log.debug("getting ItemPrice instance with id: " + id);
		try {
			ItemPrice instance = entityManager.find(ItemPrice.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
