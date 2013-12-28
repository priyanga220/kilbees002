package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.IssuePharmacyUnitAccept;
import com.kilbees.bussiness.model.IssuePharmacyUnitAcceptId;

/**
 * Home object for domain model class IssuePharmacyUnitAccept.
 * @see .IssuePharmacyUnitAccept
 * @author Hibernate Tools
 */

public class IssuePharmacyUnitAcceptHome {

	private static final Log log = LogFactory
			.getLog(IssuePharmacyUnitAcceptHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(IssuePharmacyUnitAccept transientInstance) {
		log.debug("persisting IssuePharmacyUnitAccept instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(IssuePharmacyUnitAccept persistentInstance) {
		log.debug("removing IssuePharmacyUnitAccept instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public IssuePharmacyUnitAccept merge(
			IssuePharmacyUnitAccept detachedInstance) {
		log.debug("merging IssuePharmacyUnitAccept instance");
		try {
			IssuePharmacyUnitAccept result = entityManager
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public IssuePharmacyUnitAccept findById(IssuePharmacyUnitAcceptId id) {
		log.debug("getting IssuePharmacyUnitAccept instance with id: " + id);
		try {
			IssuePharmacyUnitAccept instance = entityManager.find(
					IssuePharmacyUnitAccept.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
