package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.BeforeVerificationItem;
import com.kilbees.bussiness.model.BeforeVerificationItemId;

/**
 * Home object for domain model class BeforeVerificationItem.
 * @see .BeforeVerificationItem
 * @author Hibernate Tools
 */

public class BeforeVerificationItemHome {

	private static final Log log = LogFactory
			.getLog(BeforeVerificationItemHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(BeforeVerificationItem transientInstance) {
		log.debug("persisting BeforeVerificationItem instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(BeforeVerificationItem persistentInstance) {
		log.debug("removing BeforeVerificationItem instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public BeforeVerificationItem merge(BeforeVerificationItem detachedInstance) {
		log.debug("merging BeforeVerificationItem instance");
		try {
			BeforeVerificationItem result = entityManager
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public BeforeVerificationItem findById(BeforeVerificationItemId id) {
		log.debug("getting BeforeVerificationItem instance with id: " + id);
		try {
			BeforeVerificationItem instance = entityManager.find(
					BeforeVerificationItem.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
