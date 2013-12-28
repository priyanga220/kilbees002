package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.IssuePharmacyConsumption;
import com.kilbees.bussiness.model.IssuePharmacyConsumptionId;

/**
 * Home object for domain model class IssuePharmacyConsumption.
 * @see .IssuePharmacyConsumption
 * @author Hibernate Tools
 */

public class IssuePharmacyConsumptionHome {

	private static final Log log = LogFactory
			.getLog(IssuePharmacyConsumptionHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(IssuePharmacyConsumption transientInstance) {
		log.debug("persisting IssuePharmacyConsumption instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(IssuePharmacyConsumption persistentInstance) {
		log.debug("removing IssuePharmacyConsumption instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public IssuePharmacyConsumption merge(
			IssuePharmacyConsumption detachedInstance) {
		log.debug("merging IssuePharmacyConsumption instance");
		try {
			IssuePharmacyConsumption result = entityManager
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public IssuePharmacyConsumption findById(IssuePharmacyConsumptionId id) {
		log.debug("getting IssuePharmacyConsumption instance with id: " + id);
		try {
			IssuePharmacyConsumption instance = entityManager.find(
					IssuePharmacyConsumption.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
