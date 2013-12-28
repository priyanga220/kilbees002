package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.PharmacyIssueCancel;
import com.kilbees.bussiness.model.PharmacyIssueCancelId;

/**
 * Home object for domain model class PharmacyIssueCancel.
 * @see .PharmacyIssueCancel
 * @author Hibernate Tools
 */

public class PharmacyIssueCancelHome {

	private static final Log log = LogFactory
			.getLog(PharmacyIssueCancelHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PharmacyIssueCancel transientInstance) {
		log.debug("persisting PharmacyIssueCancel instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PharmacyIssueCancel persistentInstance) {
		log.debug("removing PharmacyIssueCancel instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PharmacyIssueCancel merge(PharmacyIssueCancel detachedInstance) {
		log.debug("merging PharmacyIssueCancel instance");
		try {
			PharmacyIssueCancel result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PharmacyIssueCancel findById(PharmacyIssueCancelId id) {
		log.debug("getting PharmacyIssueCancel instance with id: " + id);
		try {
			PharmacyIssueCancel instance = entityManager.find(
					PharmacyIssueCancel.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
