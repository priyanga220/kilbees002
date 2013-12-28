package com.kilbees.bussiness.model;
// default package
// Generated Sep 21, 2013 7:48:48 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ExceedId generated by hbm2java
 */
@Embeddable
public class ExceedId implements java.io.Serializable {

	private String phUnitNo;
	private String exceedNo;

	public ExceedId() {
	}

	public ExceedId(String phUnitNo, String exceedNo) {
		this.phUnitNo = phUnitNo;
		this.exceedNo = exceedNo;
	}

	@Column(name = "PH_UNIT_NO", nullable = false, length = 20)
	public String getPhUnitNo() {
		return this.phUnitNo;
	}

	public void setPhUnitNo(String phUnitNo) {
		this.phUnitNo = phUnitNo;
	}

	@Column(name = "EXCEED_NO", nullable = false, length = 20)
	public String getExceedNo() {
		return this.exceedNo;
	}

	public void setExceedNo(String exceedNo) {
		this.exceedNo = exceedNo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ExceedId))
			return false;
		ExceedId castOther = (ExceedId) other;

		return ((this.getPhUnitNo() == castOther.getPhUnitNo()) || (this
				.getPhUnitNo() != null && castOther.getPhUnitNo() != null && this
				.getPhUnitNo().equals(castOther.getPhUnitNo())))
				&& ((this.getExceedNo() == castOther.getExceedNo()) || (this
						.getExceedNo() != null
						&& castOther.getExceedNo() != null && this
						.getExceedNo().equals(castOther.getExceedNo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPhUnitNo() == null ? 0 : this.getPhUnitNo().hashCode());
		result = 37 * result
				+ (getExceedNo() == null ? 0 : this.getExceedNo().hashCode());
		return result;
	}

}
