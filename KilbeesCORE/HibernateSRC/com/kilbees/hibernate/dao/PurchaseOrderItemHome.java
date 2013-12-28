package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.PurchaseOrderItem;
import com.kilbees.bussiness.model.PurchaseOrderItemId;

/**
 * Home object for domain model class PurchaseOrderItem.
 * @see .PurchaseOrderItem
 * @author Hibernate Tools
 */

public class PurchaseOrderItemHome {

	private static final Log log = LogFactory
			.getLog(PurchaseOrderItemHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PurchaseOrderItem transientInstance) {
		log.debug("persisting PurchaseOrderItem instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PurchaseOrderItem persistentInstance) {
		log.debug("removing PurchaseOrderItem instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PurchaseOrderItem merge(PurchaseOrderItem detachedInstance) {
		log.debug("merging PurchaseOrderItem instance");
		try {
			PurchaseOrderItem result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PurchaseOrderItem findById(PurchaseOrderItemId id) {
		log.debug("getting PurchaseOrderItem instance with id: " + id);
		try {
			PurchaseOrderItem instance = entityManager.find(
					PurchaseOrderItem.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
