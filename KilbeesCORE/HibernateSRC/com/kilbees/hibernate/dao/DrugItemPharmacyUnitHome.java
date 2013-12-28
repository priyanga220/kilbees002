package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.DrugItemPharmacyUnit;
import com.kilbees.bussiness.model.DrugItemPharmacyUnitId;

/**
 * Home object for domain model class DrugItemPharmacyUnit.
 * @see .DrugItemPharmacyUnit
 * @author Hibernate Tools
 */

public class DrugItemPharmacyUnitHome {

	private static final Log log = LogFactory
			.getLog(DrugItemPharmacyUnitHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(DrugItemPharmacyUnit transientInstance) {
		log.debug("persisting DrugItemPharmacyUnit instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(DrugItemPharmacyUnit persistentInstance) {
		log.debug("removing DrugItemPharmacyUnit instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public DrugItemPharmacyUnit merge(DrugItemPharmacyUnit detachedInstance) {
		log.debug("merging DrugItemPharmacyUnit instance");
		try {
			DrugItemPharmacyUnit result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public DrugItemPharmacyUnit findById(DrugItemPharmacyUnitId id) {
		log.debug("getting DrugItemPharmacyUnit instance with id: " + id);
		try {
			DrugItemPharmacyUnit instance = entityManager.find(
					DrugItemPharmacyUnit.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
