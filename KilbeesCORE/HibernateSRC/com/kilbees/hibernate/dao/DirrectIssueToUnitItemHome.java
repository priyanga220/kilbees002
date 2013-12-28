package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.DirrectIssueToUnitItem;
import com.kilbees.bussiness.model.DirrectIssueToUnitItemId;

/**
 * Home object for domain model class DirrectIssueToUnitItem.
 * @see .DirrectIssueToUnitItem
 * @author Hibernate Tools
 */

public class DirrectIssueToUnitItemHome {

	private static final Log log = LogFactory
			.getLog(DirrectIssueToUnitItemHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(DirrectIssueToUnitItem transientInstance) {
		log.debug("persisting DirrectIssueToUnitItem instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(DirrectIssueToUnitItem persistentInstance) {
		log.debug("removing DirrectIssueToUnitItem instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public DirrectIssueToUnitItem merge(DirrectIssueToUnitItem detachedInstance) {
		log.debug("merging DirrectIssueToUnitItem instance");
		try {
			DirrectIssueToUnitItem result = entityManager
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public DirrectIssueToUnitItem findById(DirrectIssueToUnitItemId id) {
		log.debug("getting DirrectIssueToUnitItem instance with id: " + id);
		try {
			DirrectIssueToUnitItem instance = entityManager.find(
					DirrectIssueToUnitItem.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
