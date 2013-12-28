package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.DirrectIssueToUnit;

/**
 * Home object for domain model class DirrectIssueToUnit.
 * @see .DirrectIssueToUnit
 * @author Hibernate Tools
 */

public class DirrectIssueToUnitHome {

	private static final Log log = LogFactory
			.getLog(DirrectIssueToUnitHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(DirrectIssueToUnit transientInstance) {
		log.debug("persisting DirrectIssueToUnit instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(DirrectIssueToUnit persistentInstance) {
		log.debug("removing DirrectIssueToUnit instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public DirrectIssueToUnit merge(DirrectIssueToUnit detachedInstance) {
		log.debug("merging DirrectIssueToUnit instance");
		try {
			DirrectIssueToUnit result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public DirrectIssueToUnit findById(String id) {
		log.debug("getting DirrectIssueToUnit instance with id: " + id);
		try {
			DirrectIssueToUnit instance = entityManager.find(
					DirrectIssueToUnit.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
