package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.EpharmaSystemInfo;
import com.kilbees.bussiness.model.EpharmaSystemInfoId;

/**
 * Home object for domain model class EpharmaSystemInfo.
 * @see .EpharmaSystemInfo
 * @author Hibernate Tools
 */

public class EpharmaSystemInfoHome {

	private static final Log log = LogFactory
			.getLog(EpharmaSystemInfoHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(EpharmaSystemInfo transientInstance) {
		log.debug("persisting EpharmaSystemInfo instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(EpharmaSystemInfo persistentInstance) {
		log.debug("removing EpharmaSystemInfo instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public EpharmaSystemInfo merge(EpharmaSystemInfo detachedInstance) {
		log.debug("merging EpharmaSystemInfo instance");
		try {
			EpharmaSystemInfo result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public EpharmaSystemInfo findById(EpharmaSystemInfoId id) {
		log.debug("getting EpharmaSystemInfo instance with id: " + id);
		try {
			EpharmaSystemInfo instance = entityManager.find(
					EpharmaSystemInfo.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
