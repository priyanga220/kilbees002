package com.kilbees.bussiness.model;
// default package
// Generated Sep 21, 2013 7:48:48 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PurchaseOrderTempItem generated by hbm2java
 */
@Entity
@Table(name = "PURCHASE_ORDER_TEMP_ITEM")
public class PurchaseOrderTempItem implements java.io.Serializable {

	private PurchaseOrderTempItemId id;
	private PharmacyUnit pharmacyUnit;
	private double quantity;
	private Double bonusQuantity;
	private Date orderDate;
	private String userId;
	private String userIp;
	private double consumption;

	public PurchaseOrderTempItem() {
	}

	public PurchaseOrderTempItem(PurchaseOrderTempItemId id,
			PharmacyUnit pharmacyUnit, double quantity, double consumption) {
		this.id = id;
		this.pharmacyUnit = pharmacyUnit;
		this.quantity = quantity;
		this.consumption = consumption;
	}

	public PurchaseOrderTempItem(PurchaseOrderTempItemId id,
			PharmacyUnit pharmacyUnit, double quantity, Double bonusQuantity,
			Date orderDate, String userId, String userIp, double consumption) {
		this.id = id;
		this.pharmacyUnit = pharmacyUnit;
		this.quantity = quantity;
		this.bonusQuantity = bonusQuantity;
		this.orderDate = orderDate;
		this.userId = userId;
		this.userIp = userIp;
		this.consumption = consumption;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "itemNo", column = @Column(name = "ITEM_NO", nullable = false, length = 20)),
			@AttributeOverride(name = "unitCode", column = @Column(name = "UNIT_CODE", nullable = false, length = 20)) })
	public PurchaseOrderTempItemId getId() {
		return this.id;
	}

	public void setId(PurchaseOrderTempItemId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UNIT_CODE", nullable = false, insertable = false, updatable = false)
	public PharmacyUnit getPharmacyUnit() {
		return this.pharmacyUnit;
	}

	public void setPharmacyUnit(PharmacyUnit pharmacyUnit) {
		this.pharmacyUnit = pharmacyUnit;
	}

	@Column(name = "QUANTITY", nullable = false, precision = 126, scale = 0)
	public double getQuantity() {
		return this.quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	@Column(name = "BONUS_QUANTITY", precision = 126, scale = 0)
	public Double getBonusQuantity() {
		return this.bonusQuantity;
	}

	public void setBonusQuantity(Double bonusQuantity) {
		this.bonusQuantity = bonusQuantity;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ORDER_DATE", length = 7)
	public Date getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	@Column(name = "USER_ID", length = 30)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "USER_IP", length = 20)
	public String getUserIp() {
		return this.userIp;
	}

	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}

	@Column(name = "CONSUMPTION", nullable = false, precision = 22, scale = 0)
	public double getConsumption() {
		return this.consumption;
	}

	public void setConsumption(double consumption) {
		this.consumption = consumption;
	}

}
