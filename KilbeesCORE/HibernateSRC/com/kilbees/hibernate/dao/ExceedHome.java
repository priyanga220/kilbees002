package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.Exceed;
import com.kilbees.bussiness.model.ExceedId;

/**
 * Home object for domain model class Exceed.
 * @see .Exceed
 * @author Hibernate Tools
 */

public class ExceedHome {

	private static final Log log = LogFactory.getLog(ExceedHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Exceed transientInstance) {
		log.debug("persisting Exceed instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Exceed persistentInstance) {
		log.debug("removing Exceed instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Exceed merge(Exceed detachedInstance) {
		log.debug("merging Exceed instance");
		try {
			Exceed result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Exceed findById(ExceedId id) {
		log.debug("getting Exceed instance with id: " + id);
		try {
			Exceed instance = entityManager.find(Exceed.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
