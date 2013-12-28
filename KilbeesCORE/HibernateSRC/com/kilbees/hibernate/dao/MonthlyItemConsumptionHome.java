package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.MonthlyItemConsumption;
import com.kilbees.bussiness.model.MonthlyItemConsumptionId;

/**
 * Home object for domain model class MonthlyItemConsumption.
 * @see .MonthlyItemConsumption
 * @author Hibernate Tools
 */

public class MonthlyItemConsumptionHome {

	private static final Log log = LogFactory
			.getLog(MonthlyItemConsumptionHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(MonthlyItemConsumption transientInstance) {
		log.debug("persisting MonthlyItemConsumption instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(MonthlyItemConsumption persistentInstance) {
		log.debug("removing MonthlyItemConsumption instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public MonthlyItemConsumption merge(MonthlyItemConsumption detachedInstance) {
		log.debug("merging MonthlyItemConsumption instance");
		try {
			MonthlyItemConsumption result = entityManager
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public MonthlyItemConsumption findById(MonthlyItemConsumptionId id) {
		log.debug("getting MonthlyItemConsumption instance with id: " + id);
		try {
			MonthlyItemConsumption instance = entityManager.find(
					MonthlyItemConsumption.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
