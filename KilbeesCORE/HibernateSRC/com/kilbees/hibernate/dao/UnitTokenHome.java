package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.UnitToken;
import com.kilbees.bussiness.model.UnitTokenId;

/**
 * Home object for domain model class UnitToken.
 * @see .UnitToken
 * @author Hibernate Tools
 */

public class UnitTokenHome {

	private static final Log log = LogFactory.getLog(UnitTokenHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(UnitToken transientInstance) {
		log.debug("persisting UnitToken instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(UnitToken persistentInstance) {
		log.debug("removing UnitToken instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public UnitToken merge(UnitToken detachedInstance) {
		log.debug("merging UnitToken instance");
		try {
			UnitToken result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public UnitToken findById(UnitTokenId id) {
		log.debug("getting UnitToken instance with id: " + id);
		try {
			UnitToken instance = entityManager.find(UnitToken.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
