package com.kilbees.bussiness.model;
// default package
// Generated Sep 21, 2013 7:48:48 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SupplierId generated by hbm2java
 */
@Embeddable
public class SupplierId implements java.io.Serializable {

	private String supNo;
	private String phUnitNo;

	public SupplierId() {
	}

	public SupplierId(String supNo, String phUnitNo) {
		this.supNo = supNo;
		this.phUnitNo = phUnitNo;
	}

	@Column(name = "SUP_NO", nullable = false, length = 20)
	public String getSupNo() {
		return this.supNo;
	}

	public void setSupNo(String supNo) {
		this.supNo = supNo;
	}

	@Column(name = "PH_UNIT_NO", nullable = false, length = 20)
	public String getPhUnitNo() {
		return this.phUnitNo;
	}

	public void setPhUnitNo(String phUnitNo) {
		this.phUnitNo = phUnitNo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SupplierId))
			return false;
		SupplierId castOther = (SupplierId) other;

		return ((this.getSupNo() == castOther.getSupNo()) || (this.getSupNo() != null
				&& castOther.getSupNo() != null && this.getSupNo().equals(
				castOther.getSupNo())))
				&& ((this.getPhUnitNo() == castOther.getPhUnitNo()) || (this
						.getPhUnitNo() != null
						&& castOther.getPhUnitNo() != null && this
						.getPhUnitNo().equals(castOther.getPhUnitNo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSupNo() == null ? 0 : this.getSupNo().hashCode());
		result = 37 * result
				+ (getPhUnitNo() == null ? 0 : this.getPhUnitNo().hashCode());
		return result;
	}

}
