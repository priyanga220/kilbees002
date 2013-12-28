package com.kilbees.bussiness.model;
// default package
// Generated Sep 21, 2013 7:48:48 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ServiceIssue generated by hbm2java
 */
@Entity
@Table(name = "SERVICE_ISSUE")
public class ServiceIssue implements java.io.Serializable {

	private String unitServiceIssueNo;
	private String cash;
	private String credit;
	private String paymentType;
	private String amount;
	private String amountTendered;
	private String discount;
	private String otherCharge;
	private Date isdate;
	private String userIp;
	private String userId;
	private String status;
	private String phUnit;
	private String patientName;
	private String cashierSumPrintStatus;
	private Date cashierSumPrintDate;

	public ServiceIssue() {
	}

	public ServiceIssue(String unitServiceIssueNo) {
		this.unitServiceIssueNo = unitServiceIssueNo;
	}

	public ServiceIssue(String unitServiceIssueNo, String cash, String credit,
			String paymentType, String amount, String amountTendered,
			String discount, String otherCharge, Date isdate, String userIp,
			String userId, String status, String phUnit, String patientName,
			String cashierSumPrintStatus, Date cashierSumPrintDate) {
		this.unitServiceIssueNo = unitServiceIssueNo;
		this.cash = cash;
		this.credit = credit;
		this.paymentType = paymentType;
		this.amount = amount;
		this.amountTendered = amountTendered;
		this.discount = discount;
		this.otherCharge = otherCharge;
		this.isdate = isdate;
		this.userIp = userIp;
		this.userId = userId;
		this.status = status;
		this.phUnit = phUnit;
		this.patientName = patientName;
		this.cashierSumPrintStatus = cashierSumPrintStatus;
		this.cashierSumPrintDate = cashierSumPrintDate;
	}

	@Id
	@Column(name = "UNIT_SERVICE_ISSUE_NO", unique = true, nullable = false, length = 20)
	public String getUnitServiceIssueNo() {
		return this.unitServiceIssueNo;
	}

	public void setUnitServiceIssueNo(String unitServiceIssueNo) {
		this.unitServiceIssueNo = unitServiceIssueNo;
	}

	@Column(name = "CASH", length = 20)
	public String getCash() {
		return this.cash;
	}

	public void setCash(String cash) {
		this.cash = cash;
	}

	@Column(name = "CREDIT", length = 20)
	public String getCredit() {
		return this.credit;
	}

	public void setCredit(String credit) {
		this.credit = credit;
	}

	@Column(name = "PAYMENT_TYPE", length = 20)
	public String getPaymentType() {
		return this.paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	@Column(name = "AMOUNT", length = 20)
	public String getAmount() {
		return this.amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	@Column(name = "AMOUNT_TENDERED", length = 20)
	public String getAmountTendered() {
		return this.amountTendered;
	}

	public void setAmountTendered(String amountTendered) {
		this.amountTendered = amountTendered;
	}

	@Column(name = "DISCOUNT", length = 20)
	public String getDiscount() {
		return this.discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	@Column(name = "OTHER_CHARGE", length = 20)
	public String getOtherCharge() {
		return this.otherCharge;
	}

	public void setOtherCharge(String otherCharge) {
		this.otherCharge = otherCharge;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ISDATE", length = 7)
	public Date getIsdate() {
		return this.isdate;
	}

	public void setIsdate(Date isdate) {
		this.isdate = isdate;
	}

	@Column(name = "USER_IP", length = 20)
	public String getUserIp() {
		return this.userIp;
	}

	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}

	@Column(name = "USER_ID", length = 20)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "STATUS", length = 20)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "PH_UNIT", length = 20)
	public String getPhUnit() {
		return this.phUnit;
	}

	public void setPhUnit(String phUnit) {
		this.phUnit = phUnit;
	}

	@Column(name = "PATIENT_NAME", length = 20)
	public String getPatientName() {
		return this.patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	@Column(name = "CASHIER_SUM_PRINT_STATUS", length = 20)
	public String getCashierSumPrintStatus() {
		return this.cashierSumPrintStatus;
	}

	public void setCashierSumPrintStatus(String cashierSumPrintStatus) {
		this.cashierSumPrintStatus = cashierSumPrintStatus;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CASHIER_SUM_PRINT_DATE", length = 7)
	public Date getCashierSumPrintDate() {
		return this.cashierSumPrintDate;
	}

	public void setCashierSumPrintDate(Date cashierSumPrintDate) {
		this.cashierSumPrintDate = cashierSumPrintDate;
	}

}