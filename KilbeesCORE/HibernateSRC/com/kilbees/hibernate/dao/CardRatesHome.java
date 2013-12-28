package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.CardRates;
import com.kilbees.bussiness.model.CardRatesId;

/**
 * Home object for domain model class CardRates.
 * @see .CardRates
 * @author Hibernate Tools
 */

public class CardRatesHome {

	private static final Log log = LogFactory.getLog(CardRatesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(CardRates transientInstance) {
		log.debug("persisting CardRates instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(CardRates persistentInstance) {
		log.debug("removing CardRates instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public CardRates merge(CardRates detachedInstance) {
		log.debug("merging CardRates instance");
		try {
			CardRates result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CardRates findById(CardRatesId id) {
		log.debug("getting CardRates instance with id: " + id);
		try {
			CardRates instance = entityManager.find(CardRates.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
