package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.SystemFuncCategories;

/**
 * Home object for domain model class SystemFuncCategories.
 * @see .SystemFuncCategories
 * @author Hibernate Tools
 */

public class SystemFuncCategoriesHome {

	private static final Log log = LogFactory
			.getLog(SystemFuncCategoriesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SystemFuncCategories transientInstance) {
		log.debug("persisting SystemFuncCategories instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SystemFuncCategories persistentInstance) {
		log.debug("removing SystemFuncCategories instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SystemFuncCategories merge(SystemFuncCategories detachedInstance) {
		log.debug("merging SystemFuncCategories instance");
		try {
			SystemFuncCategories result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SystemFuncCategories findById(String id) {
		log.debug("getting SystemFuncCategories instance with id: " + id);
		try {
			SystemFuncCategories instance = entityManager.find(
					SystemFuncCategories.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
