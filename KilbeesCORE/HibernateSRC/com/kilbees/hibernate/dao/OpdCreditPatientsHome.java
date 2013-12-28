package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.OpdCreditPatients;
import com.kilbees.bussiness.model.OpdCreditPatientsId;

/**
 * Home object for domain model class OpdCreditPatients.
 * @see .OpdCreditPatients
 * @author Hibernate Tools
 */

public class OpdCreditPatientsHome {

	private static final Log log = LogFactory
			.getLog(OpdCreditPatientsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(OpdCreditPatients transientInstance) {
		log.debug("persisting OpdCreditPatients instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(OpdCreditPatients persistentInstance) {
		log.debug("removing OpdCreditPatients instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public OpdCreditPatients merge(OpdCreditPatients detachedInstance) {
		log.debug("merging OpdCreditPatients instance");
		try {
			OpdCreditPatients result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public OpdCreditPatients findById(OpdCreditPatientsId id) {
		log.debug("getting OpdCreditPatients instance with id: " + id);
		try {
			OpdCreditPatients instance = entityManager.find(
					OpdCreditPatients.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
