package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.ServiceIsseCancel;
import com.kilbees.bussiness.model.ServiceIsseCancelId;

/**
 * Home object for domain model class ServiceIsseCancel.
 * @see .ServiceIsseCancel
 * @author Hibernate Tools
 */

public class ServiceIsseCancelHome {

	private static final Log log = LogFactory
			.getLog(ServiceIsseCancelHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ServiceIsseCancel transientInstance) {
		log.debug("persisting ServiceIsseCancel instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ServiceIsseCancel persistentInstance) {
		log.debug("removing ServiceIsseCancel instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ServiceIsseCancel merge(ServiceIsseCancel detachedInstance) {
		log.debug("merging ServiceIsseCancel instance");
		try {
			ServiceIsseCancel result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ServiceIsseCancel findById(ServiceIsseCancelId id) {
		log.debug("getting ServiceIsseCancel instance with id: " + id);
		try {
			ServiceIsseCancel instance = entityManager.find(
					ServiceIsseCancel.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
