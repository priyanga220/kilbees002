package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.SupplierReturnItem;
import com.kilbees.bussiness.model.SupplierReturnItemId;

/**
 * Home object for domain model class SupplierReturnItem.
 * @see .SupplierReturnItem
 * @author Hibernate Tools
 */

public class SupplierReturnItemHome {

	private static final Log log = LogFactory
			.getLog(SupplierReturnItemHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SupplierReturnItem transientInstance) {
		log.debug("persisting SupplierReturnItem instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SupplierReturnItem persistentInstance) {
		log.debug("removing SupplierReturnItem instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SupplierReturnItem merge(SupplierReturnItem detachedInstance) {
		log.debug("merging SupplierReturnItem instance");
		try {
			SupplierReturnItem result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SupplierReturnItem findById(SupplierReturnItemId id) {
		log.debug("getting SupplierReturnItem instance with id: " + id);
		try {
			SupplierReturnItem instance = entityManager.find(
					SupplierReturnItem.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
