package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.ReorderTempItem;
import com.kilbees.bussiness.model.ReorderTempItemId;

/**
 * Home object for domain model class ReorderTempItem.
 * @see .ReorderTempItem
 * @author Hibernate Tools
 */

public class ReorderTempItemHome {

	private static final Log log = LogFactory.getLog(ReorderTempItemHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ReorderTempItem transientInstance) {
		log.debug("persisting ReorderTempItem instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ReorderTempItem persistentInstance) {
		log.debug("removing ReorderTempItem instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ReorderTempItem merge(ReorderTempItem detachedInstance) {
		log.debug("merging ReorderTempItem instance");
		try {
			ReorderTempItem result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ReorderTempItem findById(ReorderTempItemId id) {
		log.debug("getting ReorderTempItem instance with id: " + id);
		try {
			ReorderTempItem instance = entityManager.find(
					ReorderTempItem.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
