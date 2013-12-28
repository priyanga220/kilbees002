package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.ServiceRefundCredit;
import com.kilbees.bussiness.model.ServiceRefundCreditId;

/**
 * Home object for domain model class ServiceRefundCredit.
 * @see .ServiceRefundCredit
 * @author Hibernate Tools
 */

public class ServiceRefundCreditHome {

	private static final Log log = LogFactory
			.getLog(ServiceRefundCreditHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ServiceRefundCredit transientInstance) {
		log.debug("persisting ServiceRefundCredit instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ServiceRefundCredit persistentInstance) {
		log.debug("removing ServiceRefundCredit instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ServiceRefundCredit merge(ServiceRefundCredit detachedInstance) {
		log.debug("merging ServiceRefundCredit instance");
		try {
			ServiceRefundCredit result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ServiceRefundCredit findById(ServiceRefundCreditId id) {
		log.debug("getting ServiceRefundCredit instance with id: " + id);
		try {
			ServiceRefundCredit instance = entityManager.find(
					ServiceRefundCredit.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
