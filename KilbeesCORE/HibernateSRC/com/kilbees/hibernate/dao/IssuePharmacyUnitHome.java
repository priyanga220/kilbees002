package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.IssuePharmacyUnit;
import com.kilbees.bussiness.model.IssuePharmacyUnitId;

/**
 * Home object for domain model class IssuePharmacyUnit.
 * @see .IssuePharmacyUnit
 * @author Hibernate Tools
 */

public class IssuePharmacyUnitHome {

	private static final Log log = LogFactory
			.getLog(IssuePharmacyUnitHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(IssuePharmacyUnit transientInstance) {
		log.debug("persisting IssuePharmacyUnit instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(IssuePharmacyUnit persistentInstance) {
		log.debug("removing IssuePharmacyUnit instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public IssuePharmacyUnit merge(IssuePharmacyUnit detachedInstance) {
		log.debug("merging IssuePharmacyUnit instance");
		try {
			IssuePharmacyUnit result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public IssuePharmacyUnit findById(IssuePharmacyUnitId id) {
		log.debug("getting IssuePharmacyUnit instance with id: " + id);
		try {
			IssuePharmacyUnit instance = entityManager.find(
					IssuePharmacyUnit.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
