package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.PurchaseOrderTempItem;
import com.kilbees.bussiness.model.PurchaseOrderTempItemId;

/**
 * Home object for domain model class PurchaseOrderTempItem.
 * @see .PurchaseOrderTempItem
 * @author Hibernate Tools
 */

public class PurchaseOrderTempItemHome {

	private static final Log log = LogFactory
			.getLog(PurchaseOrderTempItemHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PurchaseOrderTempItem transientInstance) {
		log.debug("persisting PurchaseOrderTempItem instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PurchaseOrderTempItem persistentInstance) {
		log.debug("removing PurchaseOrderTempItem instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PurchaseOrderTempItem merge(PurchaseOrderTempItem detachedInstance) {
		log.debug("merging PurchaseOrderTempItem instance");
		try {
			PurchaseOrderTempItem result = entityManager
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PurchaseOrderTempItem findById(PurchaseOrderTempItemId id) {
		log.debug("getting PurchaseOrderTempItem instance with id: " + id);
		try {
			PurchaseOrderTempItem instance = entityManager.find(
					PurchaseOrderTempItem.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
