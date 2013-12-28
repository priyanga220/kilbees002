package com.kilbees.bussiness.model;
// default package
// Generated Sep 21, 2013 7:48:48 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * StockUpdate generated by hbm2java
 */
@Entity
@Table(name = "STOCK_UPDATE")
public class StockUpdate implements java.io.Serializable {

	private StockUpdateId id;
	private Double oldQuantity;
	private Double newQuantity;
	private Date stockUpdateDate;
	private String userId;
	private String userIp;

	public StockUpdate() {
	}

	public StockUpdate(StockUpdateId id) {
		this.id = id;
	}

	public StockUpdate(StockUpdateId id, Double oldQuantity,
			Double newQuantity, Date stockUpdateDate, String userId,
			String userIp) {
		this.id = id;
		this.oldQuantity = oldQuantity;
		this.newQuantity = newQuantity;
		this.stockUpdateDate = stockUpdateDate;
		this.userId = userId;
		this.userIp = userIp;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "stockUpdateNo", column = @Column(name = "STOCK_UPDATE_NO", nullable = false, length = 20)),
			@AttributeOverride(name = "beforeVerificationNo", column = @Column(name = "BEFORE_VERIFICATION_NO", nullable = false, length = 20)),
			@AttributeOverride(name = "phUnitNo", column = @Column(name = "PH_UNIT_NO", nullable = false, length = 20)),
			@AttributeOverride(name = "itemNo", column = @Column(name = "ITEM_NO", nullable = false, length = 20)),
			@AttributeOverride(name = "grnNo", column = @Column(name = "GRN_NO", nullable = false, length = 20)) })
	public StockUpdateId getId() {
		return this.id;
	}

	public void setId(StockUpdateId id) {
		this.id = id;
	}

	@Column(name = "OLD_QUANTITY", precision = 126, scale = 0)
	public Double getOldQuantity() {
		return this.oldQuantity;
	}

	public void setOldQuantity(Double oldQuantity) {
		this.oldQuantity = oldQuantity;
	}

	@Column(name = "NEW_QUANTITY", precision = 126, scale = 0)
	public Double getNewQuantity() {
		return this.newQuantity;
	}

	public void setNewQuantity(Double newQuantity) {
		this.newQuantity = newQuantity;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "STOCK_UPDATE_DATE", length = 7)
	public Date getStockUpdateDate() {
		return this.stockUpdateDate;
	}

	public void setStockUpdateDate(Date stockUpdateDate) {
		this.stockUpdateDate = stockUpdateDate;
	}

	@Column(name = "USER_ID", length = 20)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "USER_IP", length = 15)
	public String getUserIp() {
		return this.userIp;
	}

	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}

}
