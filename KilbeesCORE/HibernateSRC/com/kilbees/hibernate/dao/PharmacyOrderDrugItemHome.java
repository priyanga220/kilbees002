package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.PharmacyOrderDrugItem;
import com.kilbees.bussiness.model.PharmacyOrderDrugItemId;

/**
 * Home object for domain model class PharmacyOrderDrugItem.
 * @see .PharmacyOrderDrugItem
 * @author Hibernate Tools
 */

public class PharmacyOrderDrugItemHome {

	private static final Log log = LogFactory
			.getLog(PharmacyOrderDrugItemHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PharmacyOrderDrugItem transientInstance) {
		log.debug("persisting PharmacyOrderDrugItem instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PharmacyOrderDrugItem persistentInstance) {
		log.debug("removing PharmacyOrderDrugItem instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PharmacyOrderDrugItem merge(PharmacyOrderDrugItem detachedInstance) {
		log.debug("merging PharmacyOrderDrugItem instance");
		try {
			PharmacyOrderDrugItem result = entityManager
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PharmacyOrderDrugItem findById(PharmacyOrderDrugItemId id) {
		log.debug("getting PharmacyOrderDrugItem instance with id: " + id);
		try {
			PharmacyOrderDrugItem instance = entityManager.find(
					PharmacyOrderDrugItem.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
