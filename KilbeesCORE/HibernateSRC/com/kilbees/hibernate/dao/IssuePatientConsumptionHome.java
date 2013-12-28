package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.IssuePatientConsumption;
import com.kilbees.bussiness.model.IssuePatientConsumptionId;

/**
 * Home object for domain model class IssuePatientConsumption.
 * @see .IssuePatientConsumption
 * @author Hibernate Tools
 */

public class IssuePatientConsumptionHome {

	private static final Log log = LogFactory
			.getLog(IssuePatientConsumptionHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(IssuePatientConsumption transientInstance) {
		log.debug("persisting IssuePatientConsumption instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(IssuePatientConsumption persistentInstance) {
		log.debug("removing IssuePatientConsumption instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public IssuePatientConsumption merge(
			IssuePatientConsumption detachedInstance) {
		log.debug("merging IssuePatientConsumption instance");
		try {
			IssuePatientConsumption result = entityManager
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public IssuePatientConsumption findById(IssuePatientConsumptionId id) {
		log.debug("getting IssuePatientConsumption instance with id: " + id);
		try {
			IssuePatientConsumption instance = entityManager.find(
					IssuePatientConsumption.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
