package com.kilbees.bussiness.model;
// default package
// Generated Sep 21, 2013 7:48:48 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ItemMovementId generated by hbm2java
 */
@Embeddable
public class ItemMovementId implements java.io.Serializable {

	private String phUnitNo;
	private String itemMovementNo;

	public ItemMovementId() {
	}

	public ItemMovementId(String phUnitNo, String itemMovementNo) {
		this.phUnitNo = phUnitNo;
		this.itemMovementNo = itemMovementNo;
	}

	@Column(name = "PH_UNIT_NO", nullable = false, length = 20)
	public String getPhUnitNo() {
		return this.phUnitNo;
	}

	public void setPhUnitNo(String phUnitNo) {
		this.phUnitNo = phUnitNo;
	}

	@Column(name = "ITEM_MOVEMENT_NO", nullable = false, length = 35)
	public String getItemMovementNo() {
		return this.itemMovementNo;
	}

	public void setItemMovementNo(String itemMovementNo) {
		this.itemMovementNo = itemMovementNo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ItemMovementId))
			return false;
		ItemMovementId castOther = (ItemMovementId) other;

		return ((this.getPhUnitNo() == castOther.getPhUnitNo()) || (this
				.getPhUnitNo() != null && castOther.getPhUnitNo() != null && this
				.getPhUnitNo().equals(castOther.getPhUnitNo())))
				&& ((this.getItemMovementNo() == castOther.getItemMovementNo()) || (this
						.getItemMovementNo() != null
						&& castOther.getItemMovementNo() != null && this
						.getItemMovementNo().equals(
								castOther.getItemMovementNo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPhUnitNo() == null ? 0 : this.getPhUnitNo().hashCode());
		result = 37
				* result
				+ (getItemMovementNo() == null ? 0 : this.getItemMovementNo()
						.hashCode());
		return result;
	}

}
