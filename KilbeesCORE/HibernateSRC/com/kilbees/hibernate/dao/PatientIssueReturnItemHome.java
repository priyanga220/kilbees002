package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.PatientIssueReturnItem;
import com.kilbees.bussiness.model.PatientIssueReturnItemId;

/**
 * Home object for domain model class PatientIssueReturnItem.
 * @see .PatientIssueReturnItem
 * @author Hibernate Tools
 */

public class PatientIssueReturnItemHome {

	private static final Log log = LogFactory
			.getLog(PatientIssueReturnItemHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PatientIssueReturnItem transientInstance) {
		log.debug("persisting PatientIssueReturnItem instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PatientIssueReturnItem persistentInstance) {
		log.debug("removing PatientIssueReturnItem instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PatientIssueReturnItem merge(PatientIssueReturnItem detachedInstance) {
		log.debug("merging PatientIssueReturnItem instance");
		try {
			PatientIssueReturnItem result = entityManager
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PatientIssueReturnItem findById(PatientIssueReturnItemId id) {
		log.debug("getting PatientIssueReturnItem instance with id: " + id);
		try {
			PatientIssueReturnItem instance = entityManager.find(
					PatientIssueReturnItem.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
