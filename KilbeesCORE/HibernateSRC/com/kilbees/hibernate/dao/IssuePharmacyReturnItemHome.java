package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.IssuePharmacyReturnItem;
import com.kilbees.bussiness.model.IssuePharmacyReturnItemId;

/**
 * Home object for domain model class IssuePharmacyReturnItem.
 * @see .IssuePharmacyReturnItem
 * @author Hibernate Tools
 */

public class IssuePharmacyReturnItemHome {

	private static final Log log = LogFactory
			.getLog(IssuePharmacyReturnItemHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(IssuePharmacyReturnItem transientInstance) {
		log.debug("persisting IssuePharmacyReturnItem instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(IssuePharmacyReturnItem persistentInstance) {
		log.debug("removing IssuePharmacyReturnItem instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public IssuePharmacyReturnItem merge(
			IssuePharmacyReturnItem detachedInstance) {
		log.debug("merging IssuePharmacyReturnItem instance");
		try {
			IssuePharmacyReturnItem result = entityManager
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public IssuePharmacyReturnItem findById(IssuePharmacyReturnItemId id) {
		log.debug("getting IssuePharmacyReturnItem instance with id: " + id);
		try {
			IssuePharmacyReturnItem instance = entityManager.find(
					IssuePharmacyReturnItem.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
