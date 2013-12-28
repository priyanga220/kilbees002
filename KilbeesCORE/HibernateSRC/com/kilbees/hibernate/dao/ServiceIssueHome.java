package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.ServiceIssue;

/**
 * Home object for domain model class ServiceIssue.
 * @see .ServiceIssue
 * @author Hibernate Tools
 */

public class ServiceIssueHome {

	private static final Log log = LogFactory.getLog(ServiceIssueHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ServiceIssue transientInstance) {
		log.debug("persisting ServiceIssue instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ServiceIssue persistentInstance) {
		log.debug("removing ServiceIssue instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ServiceIssue merge(ServiceIssue detachedInstance) {
		log.debug("merging ServiceIssue instance");
		try {
			ServiceIssue result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ServiceIssue findById(String id) {
		log.debug("getting ServiceIssue instance with id: " + id);
		try {
			ServiceIssue instance = entityManager.find(ServiceIssue.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
