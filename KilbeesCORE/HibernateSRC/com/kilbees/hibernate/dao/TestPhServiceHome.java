package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.TestPhService;
import com.kilbees.bussiness.model.TestPhServiceId;

/**
 * Home object for domain model class TestPhService.
 * @see .TestPhService
 * @author Hibernate Tools
 */

public class TestPhServiceHome {

	private static final Log log = LogFactory.getLog(TestPhServiceHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TestPhService transientInstance) {
		log.debug("persisting TestPhService instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TestPhService persistentInstance) {
		log.debug("removing TestPhService instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TestPhService merge(TestPhService detachedInstance) {
		log.debug("merging TestPhService instance");
		try {
			TestPhService result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TestPhService findById(TestPhServiceId id) {
		log.debug("getting TestPhService instance with id: " + id);
		try {
			TestPhService instance = entityManager
					.find(TestPhService.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
