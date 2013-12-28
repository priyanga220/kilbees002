package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.Directions;

/**
 * Home object for domain model class Directions.
 * @see .Directions
 * @author Hibernate Tools
 */

public class DirectionsHome {

	private static final Log log = LogFactory.getLog(DirectionsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Directions transientInstance) {
		log.debug("persisting Directions instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Directions persistentInstance) {
		log.debug("removing Directions instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Directions merge(Directions detachedInstance) {
		log.debug("merging Directions instance");
		try {
			Directions result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Directions findById(String id) {
		log.debug("getting Directions instance with id: " + id);
		try {
			Directions instance = entityManager.find(Directions.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
