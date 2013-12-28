package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.BeforeVerification;
import com.kilbees.bussiness.model.BeforeVerificationId;

/**
 * Home object for domain model class BeforeVerification.
 * @see .BeforeVerification
 * @author Hibernate Tools
 */

public class BeforeVerificationHome {

	private static final Log log = LogFactory
			.getLog(BeforeVerificationHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(BeforeVerification transientInstance) {
		log.debug("persisting BeforeVerification instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(BeforeVerification persistentInstance) {
		log.debug("removing BeforeVerification instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public BeforeVerification merge(BeforeVerification detachedInstance) {
		log.debug("merging BeforeVerification instance");
		try {
			BeforeVerification result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public BeforeVerification findById(BeforeVerificationId id) {
		log.debug("getting BeforeVerification instance with id: " + id);
		try {
			BeforeVerification instance = entityManager.find(
					BeforeVerification.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
