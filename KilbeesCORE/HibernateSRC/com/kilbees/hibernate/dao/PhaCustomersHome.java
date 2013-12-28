package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.PhaCustomers;
import com.kilbees.bussiness.model.PhaCustomersId;

/**
 * Home object for domain model class PhaCustomers.
 * @see .PhaCustomers
 * @author Hibernate Tools
 */

public class PhaCustomersHome {

	private static final Log log = LogFactory.getLog(PhaCustomersHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PhaCustomers transientInstance) {
		log.debug("persisting PhaCustomers instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PhaCustomers persistentInstance) {
		log.debug("removing PhaCustomers instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PhaCustomers merge(PhaCustomers detachedInstance) {
		log.debug("merging PhaCustomers instance");
		try {
			PhaCustomers result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PhaCustomers findById(PhaCustomersId id) {
		log.debug("getting PhaCustomers instance with id: " + id);
		try {
			PhaCustomers instance = entityManager.find(PhaCustomers.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
