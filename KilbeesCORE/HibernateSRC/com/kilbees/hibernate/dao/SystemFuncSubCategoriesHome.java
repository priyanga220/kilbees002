package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.SystemFuncSubCategories;

/**
 * Home object for domain model class SystemFuncSubCategories.
 * @see .SystemFuncSubCategories
 * @author Hibernate Tools
 */

public class SystemFuncSubCategoriesHome {

	private static final Log log = LogFactory
			.getLog(SystemFuncSubCategoriesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SystemFuncSubCategories transientInstance) {
		log.debug("persisting SystemFuncSubCategories instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SystemFuncSubCategories persistentInstance) {
		log.debug("removing SystemFuncSubCategories instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SystemFuncSubCategories merge(
			SystemFuncSubCategories detachedInstance) {
		log.debug("merging SystemFuncSubCategories instance");
		try {
			SystemFuncSubCategories result = entityManager
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SystemFuncSubCategories findById(String id) {
		log.debug("getting SystemFuncSubCategories instance with id: " + id);
		try {
			SystemFuncSubCategories instance = entityManager.find(
					SystemFuncSubCategories.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
