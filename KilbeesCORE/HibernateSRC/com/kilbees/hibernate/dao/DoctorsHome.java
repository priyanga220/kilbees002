package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.Doctors;

/**
 * Home object for domain model class Doctors.
 * @see .Doctors
 * @author Hibernate Tools
 */

public class DoctorsHome {

	private static final Log log = LogFactory.getLog(DoctorsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Doctors transientInstance) {
		log.debug("persisting Doctors instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Doctors persistentInstance) {
		log.debug("removing Doctors instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Doctors merge(Doctors detachedInstance) {
		log.debug("merging Doctors instance");
		try {
			Doctors result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Doctors findById(String id) {
		log.debug("getting Doctors instance with id: " + id);
		try {
			Doctors instance = entityManager.find(Doctors.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
