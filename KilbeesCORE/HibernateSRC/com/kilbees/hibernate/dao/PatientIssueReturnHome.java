package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.PatientIssueReturn;
import com.kilbees.bussiness.model.PatientIssueReturnId;

/**
 * Home object for domain model class PatientIssueReturn.
 * @see .PatientIssueReturn
 * @author Hibernate Tools
 */

public class PatientIssueReturnHome {

	private static final Log log = LogFactory
			.getLog(PatientIssueReturnHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PatientIssueReturn transientInstance) {
		log.debug("persisting PatientIssueReturn instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PatientIssueReturn persistentInstance) {
		log.debug("removing PatientIssueReturn instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PatientIssueReturn merge(PatientIssueReturn detachedInstance) {
		log.debug("merging PatientIssueReturn instance");
		try {
			PatientIssueReturn result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PatientIssueReturn findById(PatientIssueReturnId id) {
		log.debug("getting PatientIssueReturn instance with id: " + id);
		try {
			PatientIssueReturn instance = entityManager.find(
					PatientIssueReturn.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
