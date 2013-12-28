package com.kilbees.hibernate.dao;
// default package
// Generated Sep 21, 2013 8:18:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.kilbees.bussiness.model.TableExport;

/**
 * Home object for domain model class TableExport.
 * @see .TableExport
 * @author Hibernate Tools
 */

public class TableExportHome {

	private static final Log log = LogFactory.getLog(TableExportHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TableExport transientInstance) {
		log.debug("persisting TableExport instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TableExport persistentInstance) {
		log.debug("removing TableExport instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TableExport merge(TableExport detachedInstance) {
		log.debug("merging TableExport instance");
		try {
			TableExport result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TableExport findById(String id) {
		log.debug("getting TableExport instance with id: " + id);
		try {
			TableExport instance = entityManager.find(TableExport.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
