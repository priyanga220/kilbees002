package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.LoyalityCards;

/**
 * Home object for domain model class LoyalityCards.
 * @see .LoyalityCards
 * @author Hibernate Tools
 */

public class LoyalityCardsHome {

	private static final Log log = LogFactory.getLog(LoyalityCardsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(LoyalityCards transientInstance) {
		log.debug("persisting LoyalityCards instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(LoyalityCards persistentInstance) {
		log.debug("removing LoyalityCards instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public LoyalityCards merge(LoyalityCards detachedInstance) {
		log.debug("merging LoyalityCards instance");
		try {
			LoyalityCards result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public LoyalityCards findById(String id) {
		log.debug("getting LoyalityCards instance with id: " + id);
		try {
			LoyalityCards instance = entityManager
					.find(LoyalityCards.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
