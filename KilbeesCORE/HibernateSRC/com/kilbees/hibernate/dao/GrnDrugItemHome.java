package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.GrnDrugItem;
import com.kilbees.bussiness.model.GrnDrugItemId;

/**
 * Home object for domain model class GrnDrugItem.
 * @see .GrnDrugItem
 * @author Hibernate Tools
 */

public class GrnDrugItemHome {

	private static final Log log = LogFactory.getLog(GrnDrugItemHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(GrnDrugItem transientInstance) {
		log.debug("persisting GrnDrugItem instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(GrnDrugItem persistentInstance) {
		log.debug("removing GrnDrugItem instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public GrnDrugItem merge(GrnDrugItem detachedInstance) {
		log.debug("merging GrnDrugItem instance");
		try {
			GrnDrugItem result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public GrnDrugItem findById(GrnDrugItemId id) {
		log.debug("getting GrnDrugItem instance with id: " + id);
		try {
			GrnDrugItem instance = entityManager.find(GrnDrugItem.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
