package com.kilbees.bussiness.model;
// default package
// Generated Sep 21, 2013 7:48:48 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PatientIssueReturnItemId generated by hbm2java
 */
@Embeddable
public class PatientIssueReturnItemId implements java.io.Serializable {

	private String phUnitNo;
	private String patientIssueReturnNo;
	private String itemNo;

	public PatientIssueReturnItemId() {
	}

	public PatientIssueReturnItemId(String phUnitNo,
			String patientIssueReturnNo, String itemNo) {
		this.phUnitNo = phUnitNo;
		this.patientIssueReturnNo = patientIssueReturnNo;
		this.itemNo = itemNo;
	}

	@Column(name = "PH_UNIT_NO", nullable = false, length = 20)
	public String getPhUnitNo() {
		return this.phUnitNo;
	}

	public void setPhUnitNo(String phUnitNo) {
		this.phUnitNo = phUnitNo;
	}

	@Column(name = "PATIENT_ISSUE_RETURN_NO", nullable = false, length = 20)
	public String getPatientIssueReturnNo() {
		return this.patientIssueReturnNo;
	}

	public void setPatientIssueReturnNo(String patientIssueReturnNo) {
		this.patientIssueReturnNo = patientIssueReturnNo;
	}

	@Column(name = "ITEM_NO", nullable = false, length = 20)
	public String getItemNo() {
		return this.itemNo;
	}

	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PatientIssueReturnItemId))
			return false;
		PatientIssueReturnItemId castOther = (PatientIssueReturnItemId) other;

		return ((this.getPhUnitNo() == castOther.getPhUnitNo()) || (this
				.getPhUnitNo() != null && castOther.getPhUnitNo() != null && this
				.getPhUnitNo().equals(castOther.getPhUnitNo())))
				&& ((this.getPatientIssueReturnNo() == castOther
						.getPatientIssueReturnNo()) || (this
						.getPatientIssueReturnNo() != null
						&& castOther.getPatientIssueReturnNo() != null && this
						.getPatientIssueReturnNo().equals(
								castOther.getPatientIssueReturnNo())))
				&& ((this.getItemNo() == castOther.getItemNo()) || (this
						.getItemNo() != null && castOther.getItemNo() != null && this
						.getItemNo().equals(castOther.getItemNo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPhUnitNo() == null ? 0 : this.getPhUnitNo().hashCode());
		result = 37
				* result
				+ (getPatientIssueReturnNo() == null ? 0 : this
						.getPatientIssueReturnNo().hashCode());
		result = 37 * result
				+ (getItemNo() == null ? 0 : this.getItemNo().hashCode());
		return result;
	}

}
