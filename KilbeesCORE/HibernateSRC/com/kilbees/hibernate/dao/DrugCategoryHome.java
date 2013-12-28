package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.DrugCategory;

/**
 * Home object for domain model class DrugCategory.
 * @see .DrugCategory
 * @author Hibernate Tools
 */

public class DrugCategoryHome {

	private static final Log log = LogFactory.getLog(DrugCategoryHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(DrugCategory transientInstance) {
		log.debug("persisting DrugCategory instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(DrugCategory persistentInstance) {
		log.debug("removing DrugCategory instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public DrugCategory merge(DrugCategory detachedInstance) {
		log.debug("merging DrugCategory instance");
		try {
			DrugCategory result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public DrugCategory findById(String id) {
		log.debug("getting DrugCategory instance with id: " + id);
		try {
			DrugCategory instance = entityManager.find(DrugCategory.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
