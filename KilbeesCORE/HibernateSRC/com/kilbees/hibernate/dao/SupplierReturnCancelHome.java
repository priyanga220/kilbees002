package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.SupplierReturnCancel;

/**
 * Home object for domain model class SupplierReturnCancel.
 * @see .SupplierReturnCancel
 * @author Hibernate Tools
 */

public class SupplierReturnCancelHome {

	private static final Log log = LogFactory
			.getLog(SupplierReturnCancelHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SupplierReturnCancel transientInstance) {
		log.debug("persisting SupplierReturnCancel instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SupplierReturnCancel persistentInstance) {
		log.debug("removing SupplierReturnCancel instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SupplierReturnCancel merge(SupplierReturnCancel detachedInstance) {
		log.debug("merging SupplierReturnCancel instance");
		try {
			SupplierReturnCancel result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SupplierReturnCancel findById(String id) {
		log.debug("getting SupplierReturnCancel instance with id: " + id);
		try {
			SupplierReturnCancel instance = entityManager.find(
					SupplierReturnCancel.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
