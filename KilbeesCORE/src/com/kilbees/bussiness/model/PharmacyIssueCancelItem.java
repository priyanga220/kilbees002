package com.kilbees.bussiness.model;
// default package
// Generated Sep 21, 2013 7:48:48 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * PharmacyIssueCancelItem generated by hbm2java
 */
@Entity
@Table(name = "PHARMACY_ISSUE_CANCEL_ITEM")
public class PharmacyIssueCancelItem implements java.io.Serializable {

	private PharmacyIssueCancelItemId id;
	private double quantity;

	public PharmacyIssueCancelItem() {
	}

	public PharmacyIssueCancelItem(PharmacyIssueCancelItemId id, double quantity) {
		this.id = id;
		this.quantity = quantity;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "phUnitNo", column = @Column(name = "PH_UNIT_NO", nullable = false, length = 20)),
			@AttributeOverride(name = "pharmacyIssueCancelNo", column = @Column(name = "PHARMACY_ISSUE_CANCEL_NO", nullable = false, length = 20)),
			@AttributeOverride(name = "itemNo", column = @Column(name = "ITEM_NO", nullable = false, length = 20)),
			@AttributeOverride(name = "grnNo", column = @Column(name = "GRN_NO", nullable = false, length = 20)) })
	public PharmacyIssueCancelItemId getId() {
		return this.id;
	}

	public void setId(PharmacyIssueCancelItemId id) {
		this.id = id;
	}

	@Column(name = "QUANTITY", nullable = false, precision = 126, scale = 0)
	public double getQuantity() {
		return this.quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

}