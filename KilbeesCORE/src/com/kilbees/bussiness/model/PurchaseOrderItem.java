package com.kilbees.bussiness.model;
// default package
// Generated Sep 21, 2013 7:48:48 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * PurchaseOrderItem generated by hbm2java
 */
@Entity
@Table(name = "PURCHASE_ORDER_ITEM")
public class PurchaseOrderItem implements java.io.Serializable {

	private PurchaseOrderItemId id;
	private PurchaseOrder purchaseOrder;
	private double quantity;
	private Double bonusQuantity;
	private double consumption;
	private BigDecimal costPrice;

	public PurchaseOrderItem() {
	}

	public PurchaseOrderItem(PurchaseOrderItemId id,
			PurchaseOrder purchaseOrder, double quantity, double consumption,
			BigDecimal costPrice) {
		this.id = id;
		this.purchaseOrder = purchaseOrder;
		this.quantity = quantity;
		this.consumption = consumption;
		this.costPrice = costPrice;
	}

	public PurchaseOrderItem(PurchaseOrderItemId id,
			PurchaseOrder purchaseOrder, double quantity, Double bonusQuantity,
			double consumption, BigDecimal costPrice) {
		this.id = id;
		this.purchaseOrder = purchaseOrder;
		this.quantity = quantity;
		this.bonusQuantity = bonusQuantity;
		this.consumption = consumption;
		this.costPrice = costPrice;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "phUnitNo", column = @Column(name = "PH_UNIT_NO", nullable = false, length = 20)),
			@AttributeOverride(name = "purchaseOrderNo", column = @Column(name = "PURCHASE_ORDER_NO", nullable = false, length = 20)),
			@AttributeOverride(name = "itemNo", column = @Column(name = "ITEM_NO", nullable = false, length = 20)) })
	public PurchaseOrderItemId getId() {
		return this.id;
	}

	public void setId(PurchaseOrderItemId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "PURCHASE_ORDER_NO", referencedColumnName = "PURCHASE_ORDER_NO", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "PH_UNIT_NO", referencedColumnName = "PH_UNIT_NO", nullable = false, insertable = false, updatable = false) })
	public PurchaseOrder getPurchaseOrder() {
		return this.purchaseOrder;
	}

	public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
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

	@Column(name = "CONSUMPTION", nullable = false, precision = 122, scale = 0)
	public double getConsumption() {
		return this.consumption;
	}

	public void setConsumption(double consumption) {
		this.consumption = consumption;
	}

	@Column(name = "COST_PRICE", nullable = false, precision = 10)
	public BigDecimal getCostPrice() {
		return this.costPrice;
	}

	public void setCostPrice(BigDecimal costPrice) {
		this.costPrice = costPrice;
	}

}