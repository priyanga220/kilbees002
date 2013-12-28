package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.CreditCompanies;
import com.kilbees.bussiness.model.CreditCompaniesId;

/**
 * Home object for domain model class CreditCompanies.
 * @see .CreditCompanies
 * @author Hibernate Tools
 */

public class CreditCompaniesHome {

	private static final Log log = LogFactory.getLog(CreditCompaniesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(CreditCompanies transientInstance) {
		log.debug("persisting CreditCompanies instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(CreditCompanies persistentInstance) {
		log.debug("removing CreditCompanies instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public CreditCompanies merge(CreditCompanies detachedInstance) {
		log.debug("merging CreditCompanies instance");
		try {
			CreditCompanies result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CreditCompanies findById(CreditCompaniesId id) {
		log.debug("getting CreditCompanies instance with id: " + id);
		try {
			CreditCompanies instance = entityManager.find(
					CreditCompanies.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
