package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.EpharmaInstalments;

/**
 * Home object for domain model class EpharmaInstalments.
 * @see .EpharmaInstalments
 * @author Hibernate Tools
 */

public class EpharmaInstalmentsHome {

	private static final Log log = LogFactory
			.getLog(EpharmaInstalmentsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(EpharmaInstalments transientInstance) {
		log.debug("persisting EpharmaInstalments instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(EpharmaInstalments persistentInstance) {
		log.debug("removing EpharmaInstalments instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public EpharmaInstalments merge(EpharmaInstalments detachedInstance) {
		log.debug("merging EpharmaInstalments instance");
		try {
			EpharmaInstalments result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public EpharmaInstalments findById(BigDecimal id) {
		log.debug("getting EpharmaInstalments instance with id: " + id);
		try {
			EpharmaInstalments instance = entityManager.find(
					EpharmaInstalments.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
