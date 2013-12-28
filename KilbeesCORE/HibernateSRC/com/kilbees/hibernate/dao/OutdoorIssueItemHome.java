package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.OutdoorIssueItem;
import com.kilbees.bussiness.model.OutdoorIssueItemId;

/**
 * Home object for domain model class OutdoorIssueItem.
 * @see .OutdoorIssueItem
 * @author Hibernate Tools
 */

public class OutdoorIssueItemHome {

	private static final Log log = LogFactory
			.getLog(OutdoorIssueItemHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(OutdoorIssueItem transientInstance) {
		log.debug("persisting OutdoorIssueItem instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(OutdoorIssueItem persistentInstance) {
		log.debug("removing OutdoorIssueItem instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public OutdoorIssueItem merge(OutdoorIssueItem detachedInstance) {
		log.debug("merging OutdoorIssueItem instance");
		try {
			OutdoorIssueItem result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public OutdoorIssueItem findById(OutdoorIssueItemId id) {
		log.debug("getting OutdoorIssueItem instance with id: " + id);
		try {
			OutdoorIssueItem instance = entityManager.find(
					OutdoorIssueItem.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
