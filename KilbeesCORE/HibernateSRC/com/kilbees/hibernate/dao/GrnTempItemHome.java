package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.GrnTempItem;
import com.kilbees.bussiness.model.GrnTempItemId;

/**
 * Home object for domain model class GrnTempItem.
 * @see .GrnTempItem
 * @author Hibernate Tools
 */
public class GrnTempItemHome {

	private static final Log log = LogFactory.getLog(GrnTempItemHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(GrnTempItem transientInstance) {
		log.debug("persisting GrnTempItem instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(GrnTempItem persistentInstance) {
		log.debug("removing GrnTempItem instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public GrnTempItem merge(GrnTempItem detachedInstance) {
		log.debug("merging GrnTempItem instance");
		try {
			GrnTempItem result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public GrnTempItem findById(GrnTempItemId id) {
		log.debug("getting GrnTempItem instance with id: " + id);
		try {
			GrnTempItem instance = entityManager.find(GrnTempItem.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
