package com.kilbees.bussiness.model;
// default package
// Generated Sep 21, 2013 7:48:48 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * DrugItemPharmacyUnitId generated by hbm2java
 */
@Embeddable
public class DrugItemPharmacyUnitId implements java.io.Serializable {

	private String unitNo;
	private String itemNo;

	public DrugItemPharmacyUnitId() {
	}

	public DrugItemPharmacyUnitId(String unitNo, String itemNo) {
		this.unitNo = unitNo;
		this.itemNo = itemNo;
	}

	@Column(name = "UNIT_NO", nullable = false, length = 20)
	public String getUnitNo() {
		return this.unitNo;
	}

	public void setUnitNo(String unitNo) {
		this.unitNo = unitNo;
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
		if (!(other instanceof DrugItemPharmacyUnitId))
			return false;
		DrugItemPharmacyUnitId castOther = (DrugItemPharmacyUnitId) other;

		return ((this.getUnitNo() == castOther.getUnitNo()) || (this
				.getUnitNo() != null && castOther.getUnitNo() != null && this
				.getUnitNo().equals(castOther.getUnitNo())))
				&& ((this.getItemNo() == castOther.getItemNo()) || (this
						.getItemNo() != null && castOther.getItemNo() != null && this
						.getItemNo().equals(castOther.getItemNo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getUnitNo() == null ? 0 : this.getUnitNo().hashCode());
		result = 37 * result
				+ (getItemNo() == null ? 0 : this.getItemNo().hashCode());
		return result;
	}

}
