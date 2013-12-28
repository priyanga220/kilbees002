package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.PurchaseOrder;
import com.kilbees.bussiness.model.PurchaseOrderId;

/**
 * Home object for domain model class PurchaseOrder.
 * @see .PurchaseOrder
 * @author Hibernate Tools
 */

public class PurchaseOrderHome {

	private static final Log log = LogFactory.getLog(PurchaseOrderHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PurchaseOrder transientInstance) {
		log.debug("persisting PurchaseOrder instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PurchaseOrder persistentInstance) {
		log.debug("removing PurchaseOrder instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PurchaseOrder merge(PurchaseOrder detachedInstance) {
		log.debug("merging PurchaseOrder instance");
		try {
			PurchaseOrder result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PurchaseOrder findById(PurchaseOrderId id) {
		log.debug("getting PurchaseOrder instance with id: " + id);
		try {
			PurchaseOrder instance = entityManager
					.find(PurchaseOrder.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
