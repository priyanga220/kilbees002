package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.DrugItemUnitQuantity;
import com.kilbees.bussiness.model.DrugItemUnitQuantityId;

/**
 * Home object for domain model class DrugItemUnitQuantity.
 * @see .DrugItemUnitQuantity
 * @author Hibernate Tools
 */

public class DrugItemUnitQuantityHome {

	private static final Log log = LogFactory
			.getLog(DrugItemUnitQuantityHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(DrugItemUnitQuantity transientInstance) {
		log.debug("persisting DrugItemUnitQuantity instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(DrugItemUnitQuantity persistentInstance) {
		log.debug("removing DrugItemUnitQuantity instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public DrugItemUnitQuantity merge(DrugItemUnitQuantity detachedInstance) {
		log.debug("merging DrugItemUnitQuantity instance");
		try {
			DrugItemUnitQuantity result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public DrugItemUnitQuantity findById(DrugItemUnitQuantityId id) {
		log.debug("getting DrugItemUnitQuantity instance with id: " + id);
		try {
			DrugItemUnitQuantity instance = entityManager.find(
					DrugItemUnitQuantity.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
