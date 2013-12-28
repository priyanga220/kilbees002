package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.IssueToUnitCancel;
import com.kilbees.bussiness.model.IssueToUnitCancelId;

/**
 * Home object for domain model class IssueToUnitCancel.
 * @see .IssueToUnitCancel
 * @author Hibernate Tools
 */

public class IssueToUnitCancelHome {

	private static final Log log = LogFactory
			.getLog(IssueToUnitCancelHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(IssueToUnitCancel transientInstance) {
		log.debug("persisting IssueToUnitCancel instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(IssueToUnitCancel persistentInstance) {
		log.debug("removing IssueToUnitCancel instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public IssueToUnitCancel merge(IssueToUnitCancel detachedInstance) {
		log.debug("merging IssueToUnitCancel instance");
		try {
			IssueToUnitCancel result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public IssueToUnitCancel findById(IssueToUnitCancelId id) {
		log.debug("getting IssueToUnitCancel instance with id: " + id);
		try {
			IssueToUnitCancel instance = entityManager.find(
					IssueToUnitCancel.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
