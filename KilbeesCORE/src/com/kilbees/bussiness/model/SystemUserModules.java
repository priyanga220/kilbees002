package com.kilbees.bussiness.model;
// default package
// Generated Sep 21, 2013 7:48:48 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
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
 * SystemUserModules generated by hbm2java
 */
@Entity
@Table(name = "SYSTEM_USER_MODULES")
public class SystemUserModules implements java.io.Serializable {

	private SystemUserModulesId id;
	private String themeId;
	private BigDecimal currStatus;
	private String userId;
	private String userIp;
	private Date txnDate;

	public SystemUserModules() {
	}

	public SystemUserModules(SystemUserModulesId id, String themeId,
			BigDecimal currStatus, String userId, String userIp, Date txnDate) {
		this.id = id;
		this.themeId = themeId;
		this.currStatus = currStatus;
		this.userId = userId;
		this.userIp = userIp;
		this.txnDate = txnDate;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "userName", column = @Column(name = "USER_NAME", nullable = false, length = 50)),
			@AttributeOverride(name = "moduleId", column = @Column(name = "MODULE_ID", nullable = false, length = 5)) })
	public SystemUserModulesId getId() {
		return this.id;
	}

	public void setId(SystemUserModulesId id) {
		this.id = id;
	}

	@Column(name = "THEME_ID", nullable = false, length = 5)
	public String getThemeId() {
		return this.themeId;
	}

	public void setThemeId(String themeId) {
		this.themeId = themeId;
	}

	@Column(name = "CURR_STATUS", nullable = false, precision = 22, scale = 0)
	public BigDecimal getCurrStatus() {
		return this.currStatus;
	}

	public void setCurrStatus(BigDecimal currStatus) {
		this.currStatus = currStatus;
	}

	@Column(name = "USER_ID", nullable = false, length = 50)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "USER_IP", nullable = false, length = 20)
	public String getUserIp() {
		return this.userIp;
	}

	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "TXN_DATE", nullable = false, length = 7)
	public Date getTxnDate() {
		return this.txnDate;
	}

	public void setTxnDate(Date txnDate) {
		this.txnDate = txnDate;
	}

}
