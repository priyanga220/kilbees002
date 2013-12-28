package com.kilbees.bussiness.model;
// default package
// Generated Sep 21, 2013 7:48:48 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * GrnTempItemId generated by hbm2java
 */
@Embeddable
public class GrnTempItemId implements java.io.Serializable {

	private String phUnitNo;
	private String poNumber;
	private String itemNo;

	public GrnTempItemId() {
	}

	public GrnTempItemId(String phUnitNo, String poNumber, String itemNo) {
		this.phUnitNo = phUnitNo;
		this.poNumber = poNumber;
		this.itemNo = itemNo;
	}

	@Column(name = "PH_UNIT_NO", nullable = false, length = 20)
	public String getPhUnitNo() {
		return this.phUnitNo;
	}

	public void setPhUnitNo(String phUnitNo) {
		this.phUnitNo = phUnitNo;
	}

	@Column(name = "PO_NUMBER", nullable = false, length = 20)
	public String getPoNumber() {
		return this.poNumber;
	}

	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
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
		if (!(other instanceof GrnTempItemId))
			return false;
		GrnTempItemId castOther = (GrnTempItemId) other;

		return ((this.getPhUnitNo() == castOther.getPhUnitNo()) || (this
				.getPhUnitNo() != null && castOther.getPhUnitNo() != null && this
				.getPhUnitNo().equals(castOther.getPhUnitNo())))
				&& ((this.getPoNumber() == castOther.getPoNumber()) || (this
						.getPoNumber() != null
						&& castOther.getPoNumber() != null && this
						.getPoNumber().equals(castOther.getPoNumber())))
				&& ((this.getItemNo() == castOther.getItemNo()) || (this
						.getItemNo() != null && castOther.getItemNo() != null && this
						.getItemNo().equals(castOther.getItemNo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPhUnitNo() == null ? 0 : this.getPhUnitNo().hashCode());
		result = 37 * result
				+ (getPoNumber() == null ? 0 : this.getPoNumber().hashCode());
		result = 37 * result
				+ (getItemNo() == null ? 0 : this.getItemNo().hashCode());
		return result;
	}

}