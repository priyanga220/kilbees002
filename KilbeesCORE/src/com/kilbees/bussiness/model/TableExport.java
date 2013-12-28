package com.kilbees.bussiness.model;
// default package
// Generated Sep 21, 2013 7:48:48 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TableExport generated by hbm2java
 */
@Entity
@Table(name = "TABLE_EXPORT")
public class TableExport implements java.io.Serializable {

	private String oldCode;

	public TableExport() {
	}

	public TableExport(String oldCode) {
		this.oldCode = oldCode;
	}

	@Id
	@Column(name = "OLD_CODE", length = 20)
	public String getOldCode() {
		return this.oldCode;
	}

	public void setOldCode(String oldCode) {
		this.oldCode = oldCode;
	}

}