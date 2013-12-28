package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.IssuePharmacyUnitItem;
import com.kilbees.bussiness.model.IssuePharmacyUnitItemId;

/**
 * Home object for domain model class IssuePharmacyUnitItem.
 * @see .IssuePharmacyUnitItem
 * @author Hibernate Tools
 */

public class IssuePharmacyUnitItemHome {

	private static final Log log = LogFactory
			.getLog(IssuePharmacyUnitItemHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(IssuePharmacyUnitItem transientInstance) {
		log.debug("persisting IssuePharmacyUnitItem instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(IssuePharmacyUnitItem persistentInstance) {
		log.debug("removing IssuePharmacyUnitItem instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public IssuePharmacyUnitItem merge(IssuePharmacyUnitItem detachedInstance) {
		log.debug("merging IssuePharmacyUnitItem instance");
		try {
			IssuePharmacyUnitItem result = entityManager
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public IssuePharmacyUnitItem findById(IssuePharmacyUnitItemId id) {
		log.debug("getting IssuePharmacyUnitItem instance with id: " + id);
		try {
			IssuePharmacyUnitItem instance = entityManager.find(
					IssuePharmacyUnitItem.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
