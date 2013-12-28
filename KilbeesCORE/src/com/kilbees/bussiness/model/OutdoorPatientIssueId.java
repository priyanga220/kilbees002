package com.kilbees.bussiness.model;
// default package
// Generated Sep 21, 2013 7:48:48 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * OutdoorPatientIssueId generated by hbm2java
 */
@Embeddable
public class OutdoorPatientIssueId implements java.io.Serializable {

	private String outdoorInvoiceNo;
	private String phUnitNo;

	public OutdoorPatientIssueId() {
	}

	public OutdoorPatientIssueId(String outdoorInvoiceNo, String phUnitNo) {
		this.outdoorInvoiceNo = outdoorInvoiceNo;
		this.phUnitNo = phUnitNo;
	}

	@Column(name = "OUTDOOR_INVOICE_NO", nullable = false, length = 20)
	public String getOutdoorInvoiceNo() {
		return this.outdoorInvoiceNo;
	}

	public void setOutdoorInvoiceNo(String outdoorInvoiceNo) {
		this.outdoorInvoiceNo = outdoorInvoiceNo;
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
		if (!(other instanceof OutdoorPatientIssueId))
			return false;
		OutdoorPatientIssueId castOther = (OutdoorPatientIssueId) other;

		return ((this.getOutdoorInvoiceNo() == castOther.getOutdoorInvoiceNo()) || (this
				.getOutdoorInvoiceNo() != null
				&& castOther.getOutdoorInvoiceNo() != null && this
				.getOutdoorInvoiceNo().equals(castOther.getOutdoorInvoiceNo())))
				&& ((this.getPhUnitNo() == castOther.getPhUnitNo()) || (this
						.getPhUnitNo() != null
						&& castOther.getPhUnitNo() != null && this
						.getPhUnitNo().equals(castOther.getPhUnitNo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getOutdoorInvoiceNo() == null ? 0 : this
						.getOutdoorInvoiceNo().hashCode());
		result = 37 * result
				+ (getPhUnitNo() == null ? 0 : this.getPhUnitNo().hashCode());
		return result;
	}

}
