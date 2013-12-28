package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.ExceedDrugItem;
import com.kilbees.bussiness.model.ExceedDrugItemId;

/**
 * Home object for domain model class ExceedDrugItem.
 * @see .ExceedDrugItem
 * @author Hibernate Tools
 */

public class ExceedDrugItemHome {

	private static final Log log = LogFactory.getLog(ExceedDrugItemHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ExceedDrugItem transientInstance) {
		log.debug("persisting ExceedDrugItem instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ExceedDrugItem persistentInstance) {
		log.debug("removing ExceedDrugItem instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ExceedDrugItem merge(ExceedDrugItem detachedInstance) {
		log.debug("merging ExceedDrugItem instance");
		try {
			ExceedDrugItem result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ExceedDrugItem findById(ExceedDrugItemId id) {
		log.debug("getting ExceedDrugItem instance with id: " + id);
		try {
			ExceedDrugItem instance = entityManager.find(ExceedDrugItem.class,
					id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
