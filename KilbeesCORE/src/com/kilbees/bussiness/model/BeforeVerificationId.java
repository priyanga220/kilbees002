package com.kilbees.bussiness.model;
// default package
// Generated Sep 21, 2013 7:48:48 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BeforeVerificationId generated by hbm2java
 */
@Embeddable
public class BeforeVerificationId implements java.io.Serializable {

	private String phUnitNo;
	private String beforeVerificationNo;

	public BeforeVerificationId() {
	}

	public BeforeVerificationId(String phUnitNo, String beforeVerificationNo) {
		this.phUnitNo = phUnitNo;
		this.beforeVerificationNo = beforeVerificationNo;
	}

	@Column(name = "PH_UNIT_NO", nullable = false, length = 20)
	public String getPhUnitNo() {
		return this.phUnitNo;
	}

	public void setPhUnitNo(String phUnitNo) {
		this.phUnitNo = phUnitNo;
	}

	@Column(name = "BEFORE_VERIFICATION_NO", nullable = false, length = 20)
	public String getBeforeVerificationNo() {
		return this.beforeVerificationNo;
	}

	public void setBeforeVerificationNo(String beforeVerificationNo) {
		this.beforeVerificationNo = beforeVerificationNo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BeforeVerificationId))
			return false;
		BeforeVerificationId castOther = (BeforeVerificationId) other;

		return ((this.getPhUnitNo() == castOther.getPhUnitNo()) || (this
				.getPhUnitNo() != null && castOther.getPhUnitNo() != null && this
				.getPhUnitNo().equals(castOther.getPhUnitNo())))
				&& ((this.getBeforeVerificationNo() == castOther
						.getBeforeVerificationNo()) || (this
						.getBeforeVerificationNo() != null
						&& castOther.getBeforeVerificationNo() != null && this
						.getBeforeVerificationNo().equals(
								castOther.getBeforeVerificationNo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPhUnitNo() == null ? 0 : this.getPhUnitNo().hashCode());
		result = 37
				* result
				+ (getBeforeVerificationNo() == null ? 0 : this
						.getBeforeVerificationNo().hashCode());
		return result;
	}

}
