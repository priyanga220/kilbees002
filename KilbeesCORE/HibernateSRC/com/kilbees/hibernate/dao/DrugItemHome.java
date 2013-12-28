package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.DrugItem;

/**
 * Home object for domain model class DrugItem.
 * @see .DrugItem
 * @author Hibernate Tools
 */

public class DrugItemHome {

	private static final Log log = LogFactory.getLog(DrugItemHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(DrugItem transientInstance) {
		log.debug("persisting DrugItem instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(DrugItem persistentInstance) {
		log.debug("removing DrugItem instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public DrugItem merge(DrugItem detachedInstance) {
		log.debug("merging DrugItem instance");
		try {
			DrugItem result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public DrugItem findById(String id) {
		log.debug("getting DrugItem instance with id: " + id);
		try {
			DrugItem instance = entityManager.find(DrugItem.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
