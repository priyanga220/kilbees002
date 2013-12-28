package com.kilbees.bussiness.model;
// default package
// Generated Sep 21, 2013 7:48:48 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * OpdCreditPatientsId generated by hbm2java
 */
@Embeddable
public class OpdCreditPatientsId implements java.io.Serializable {

	private String phUnitNo;
	private String regNo;

	public OpdCreditPatientsId() {
	}

	public OpdCreditPatientsId(String phUnitNo, String regNo) {
		this.phUnitNo = phUnitNo;
		this.regNo = regNo;
	}

	@Column(name = "PH_UNIT_NO", nullable = false, length = 20)
	public String getPhUnitNo() {
		return this.phUnitNo;
	}

	public void setPhUnitNo(String phUnitNo) {
		this.phUnitNo = phUnitNo;
	}

	@Column(name = "REG_NO", nullable = false, length = 25)
	public String getRegNo() {
		return this.regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof OpdCreditPatientsId))
			return false;
		OpdCreditPatientsId castOther = (OpdCreditPatientsId) other;

		return ((this.getPhUnitNo() == castOther.getPhUnitNo()) || (this
				.getPhUnitNo() != null && castOther.getPhUnitNo() != null && this
				.getPhUnitNo().equals(castOther.getPhUnitNo())))
				&& ((this.getRegNo() == castOther.getRegNo()) || (this
						.getRegNo() != null && castOther.getRegNo() != null && this
						.getRegNo().equals(castOther.getRegNo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPhUnitNo() == null ? 0 : this.getPhUnitNo().hashCode());
		result = 37 * result
				+ (getRegNo() == null ? 0 : this.getRegNo().hashCode());
		return result;
	}

}
