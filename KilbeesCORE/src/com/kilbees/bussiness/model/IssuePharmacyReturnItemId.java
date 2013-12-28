package com.kilbees.bussiness.model;
// default package
// Generated Sep 21, 2013 7:48:48 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * IssuePharmacyReturnItemId generated by hbm2java
 */
@Embeddable
public class IssuePharmacyReturnItemId implements java.io.Serializable {

	private String phUnitNo;
	private String returnNo;
	private String itemNo;

	public IssuePharmacyReturnItemId() {
	}

	public IssuePharmacyReturnItemId(String phUnitNo, String returnNo,
			String itemNo) {
		this.phUnitNo = phUnitNo;
		this.returnNo = returnNo;
		this.itemNo = itemNo;
	}

	@Column(name = "PH_UNIT_NO", nullable = false, length = 20)
	public String getPhUnitNo() {
		return this.phUnitNo;
	}

	public void setPhUnitNo(String phUnitNo) {
		this.phUnitNo = phUnitNo;
	}

	@Column(name = "RETURN_NO", nullable = false, length = 20)
	public String getReturnNo() {
		return this.returnNo;
	}

	public void setReturnNo(String returnNo) {
		this.returnNo = returnNo;
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
		if (!(other instanceof IssuePharmacyReturnItemId))
			return false;
		IssuePharmacyReturnItemId castOther = (IssuePharmacyReturnItemId) other;

		return ((this.getPhUnitNo() == castOther.getPhUnitNo()) || (this
				.getPhUnitNo() != null && castOther.getPhUnitNo() != null && this
				.getPhUnitNo().equals(castOther.getPhUnitNo())))
				&& ((this.getReturnNo() == castOther.getReturnNo()) || (this
						.getReturnNo() != null
						&& castOther.getReturnNo() != null && this
						.getReturnNo().equals(castOther.getReturnNo())))
				&& ((this.getItemNo() == castOther.getItemNo()) || (this
						.getItemNo() != null && castOther.getItemNo() != null && this
						.getItemNo().equals(castOther.getItemNo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPhUnitNo() == null ? 0 : this.getPhUnitNo().hashCode());
		result = 37 * result
				+ (getReturnNo() == null ? 0 : this.getReturnNo().hashCode());
		result = 37 * result
				+ (getItemNo() == null ? 0 : this.getItemNo().hashCode());
		return result;
	}

}
