package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.OutdoorPatientIssue;
import com.kilbees.bussiness.model.OutdoorPatientIssueId;

/**
 * Home object for domain model class OutdoorPatientIssue.
 * @see .OutdoorPatientIssue
 * @author Hibernate Tools
 */

public class OutdoorPatientIssueHome {

	private static final Log log = LogFactory
			.getLog(OutdoorPatientIssueHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(OutdoorPatientIssue transientInstance) {
		log.debug("persisting OutdoorPatientIssue instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(OutdoorPatientIssue persistentInstance) {
		log.debug("removing OutdoorPatientIssue instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public OutdoorPatientIssue merge(OutdoorPatientIssue detachedInstance) {
		log.debug("merging OutdoorPatientIssue instance");
		try {
			OutdoorPatientIssue result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public OutdoorPatientIssue findById(OutdoorPatientIssueId id) {
		log.debug("getting OutdoorPatientIssue instance with id: " + id);
		try {
			OutdoorPatientIssue instance = entityManager.find(
					OutdoorPatientIssue.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
