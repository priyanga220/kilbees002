package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.GrnEditDrugItem;
import com.kilbees.bussiness.model.GrnEditDrugItemId;

/**
 * Home object for domain model class GrnEditDrugItem.
 * @see .GrnEditDrugItem
 * @author Hibernate Tools
 */

public class GrnEditDrugItemHome {

	private static final Log log = LogFactory.getLog(GrnEditDrugItemHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(GrnEditDrugItem transientInstance) {
		log.debug("persisting GrnEditDrugItem instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(GrnEditDrugItem persistentInstance) {
		log.debug("removing GrnEditDrugItem instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public GrnEditDrugItem merge(GrnEditDrugItem detachedInstance) {
		log.debug("merging GrnEditDrugItem instance");
		try {
			GrnEditDrugItem result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public GrnEditDrugItem findById(GrnEditDrugItemId id) {
		log.debug("getting GrnEditDrugItem instance with id: " + id);
		try {
			GrnEditDrugItem instance = entityManager.find(
					GrnEditDrugItem.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
