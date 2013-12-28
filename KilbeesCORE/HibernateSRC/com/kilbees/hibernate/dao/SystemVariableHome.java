package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.SystemVariable;

/**
 * Home object for domain model class SystemVariable.
 * @see .SystemVariable
 * @author Hibernate Tools
 */

public class SystemVariableHome {

	private static final Log log = LogFactory.getLog(SystemVariableHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SystemVariable transientInstance) {
		log.debug("persisting SystemVariable instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SystemVariable persistentInstance) {
		log.debug("removing SystemVariable instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SystemVariable merge(SystemVariable detachedInstance) {
		log.debug("merging SystemVariable instance");
		try {
			SystemVariable result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SystemVariable findById(BigDecimal id) {
		log.debug("getting SystemVariable instance with id: " + id);
		try {
			SystemVariable instance = entityManager.find(SystemVariable.class,
					id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
