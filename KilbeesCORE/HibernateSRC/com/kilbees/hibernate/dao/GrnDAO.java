package com.kilbees.hibernate.dao;
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;

import com.kilbees.bussiness.model.DomainDefault;
import com.kilbees.bussiness.model.Grn;
import com.kilbees.bussiness.model.GrnId;

/**
 * Home object for domain model class Grn.
 * @see .Grn
 * @author Hibernate Tools
 */
public class GrnDAO
{

	private static final Log log = LogFactory.getLog(GrnDAO.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Grn transientInstance) {
		log.debug("persisting Grn instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Grn persistentInstance) {
		log.debug("removing Grn instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Grn merge(Grn detachedInstance) {
		log.debug("merging Grn instance");
		try {
			Grn result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Grn findById(GrnId id) {
		log.debug("getting Grn instance with id: " + id);
		try {
			Grn instance = entityManager.find(Grn.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}



}
