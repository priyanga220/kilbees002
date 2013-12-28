package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.PhaParameters;
import com.kilbees.bussiness.model.PhaParametersId;

/**
 * Home object for domain model class PhaParameters.
 * @see .PhaParameters
 * @author Hibernate Tools
 */

public class PhaParametersHome {

	private static final Log log = LogFactory.getLog(PhaParametersHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PhaParameters transientInstance) {
		log.debug("persisting PhaParameters instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PhaParameters persistentInstance) {
		log.debug("removing PhaParameters instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PhaParameters merge(PhaParameters detachedInstance) {
		log.debug("merging PhaParameters instance");
		try {
			PhaParameters result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PhaParameters findById(PhaParametersId id) {
		log.debug("getting PhaParameters instance with id: " + id);
		try {
			PhaParameters instance = entityManager
					.find(PhaParameters.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
