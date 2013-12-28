package com.kilbees.bussiness.model;
// default package
// Generated Sep 21, 2013 7:48:48 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Status generated by hbm2java
 */
@Entity
@Table(name = "STATUS")
public class Status implements java.io.Serializable {

	private BigDecimal statusNo;
	private String statusName;
	private BigDecimal statusValue;
	private String statusDescription;
	private BigDecimal lastValue;

	public Status() {
	}

	public Status(BigDecimal statusNo, String statusName,
			BigDecimal statusValue, String statusDescription) {
		this.statusNo = statusNo;
		this.statusName = statusName;
		this.statusValue = statusValue;
		this.statusDescription = statusDescription;
	}

	public Status(BigDecimal statusNo, String statusName,
			BigDecimal statusValue, String statusDescription,
			BigDecimal lastValue) {
		this.statusNo = statusNo;
		this.statusName = statusName;
		this.statusValue = statusValue;
		this.statusDescription = statusDescription;
		this.lastValue = lastValue;
	}

	@Id
	@Column(name = "STATUS_NO", unique = true, nullable = false, precision = 38, scale = 0)
	public BigDecimal getStatusNo() {
		return this.statusNo;
	}

	public void setStatusNo(BigDecimal statusNo) {
		this.statusNo = statusNo;
	}

	@Column(name = "STATUS_NAME", nullable = false, length = 50)
	public String getStatusName() {
		return this.statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	@Column(name = "STATUS_VALUE", nullable = false, precision = 38, scale = 0)
	public BigDecimal getStatusValue() {
		return this.statusValue;
	}

	public void setStatusValue(BigDecimal statusValue) {
		this.statusValue = statusValue;
	}

	@Column(name = "STATUS_DESCRIPTION", nullable = false, length = 50)
	public String getStatusDescription() {
		return this.statusDescription;
	}

	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}

	@Column(name = "LAST_VALUE", precision = 38, scale = 0)
	public BigDecimal getLastValue() {
		return this.lastValue;
	}

	public void setLastValue(BigDecimal lastValue) {
		this.lastValue = lastValue;
	}

}