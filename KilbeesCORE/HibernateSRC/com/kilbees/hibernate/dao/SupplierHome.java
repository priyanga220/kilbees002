package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.Supplier;
import com.kilbees.bussiness.model.SupplierId;

/**
 * Home object for domain model class Supplier.
 * @see .Supplier
 * @author Hibernate Tools
 */

public class SupplierHome {

	private static final Log log = LogFactory.getLog(SupplierHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Supplier transientInstance) {
		log.debug("persisting Supplier instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Supplier persistentInstance) {
		log.debug("removing Supplier instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Supplier merge(Supplier detachedInstance) {
		log.debug("merging Supplier instance");
		try {
			Supplier result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Supplier findById(SupplierId id) {
		log.debug("getting Supplier instance with id: " + id);
		try {
			Supplier instance = entityManager.find(Supplier.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
