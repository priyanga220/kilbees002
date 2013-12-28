package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.PatientIssueCancel;
import com.kilbees.bussiness.model.PatientIssueCancelId;

/**
 * Home object for domain model class PatientIssueCancel.
 * @see .PatientIssueCancel
 * @author Hibernate Tools
 */

public class PatientIssueCancelHome {

	private static final Log log = LogFactory
			.getLog(PatientIssueCancelHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PatientIssueCancel transientInstance) {
		log.debug("persisting PatientIssueCancel instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PatientIssueCancel persistentInstance) {
		log.debug("removing PatientIssueCancel instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PatientIssueCancel merge(PatientIssueCancel detachedInstance) {
		log.debug("merging PatientIssueCancel instance");
		try {
			PatientIssueCancel result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PatientIssueCancel findById(PatientIssueCancelId id) {
		log.debug("getting PatientIssueCancel instance with id: " + id);
		try {
			PatientIssueCancel instance = entityManager.find(
					PatientIssueCancel.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
