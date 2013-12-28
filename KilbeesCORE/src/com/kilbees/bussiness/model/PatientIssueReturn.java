package com.kilbees.bussiness.model;
// default package
// Generated Sep 21, 2013 7:48:48 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PatientIssueReturn generated by hbm2java
 */
@Entity
@Table(name = "PATIENT_ISSUE_RETURN")
public class PatientIssueReturn implements java.io.Serializable {

	private PatientIssueReturnId id;
	private String issueNo;
	private BigDecimal totalAmount;
	private Date patientIssueReturnDate;
	private BigDecimal printingStatus;
	private BigDecimal patientIssueReturnType;
	private String userId;
	private String userIp;
	private Set<PatientIssueReturnItem> patientIssueReturnItems = new HashSet<PatientIssueReturnItem>(
			0);

	public PatientIssueReturn() {
	}

	public PatientIssueReturn(PatientIssueReturnId id, String issueNo,
			BigDecimal totalAmount, Date patientIssueReturnDate,
			BigDecimal printingStatus, BigDecimal patientIssueReturnType,
			String userId, String userIp) {
		this.id = id;
		this.issueNo = issueNo;
		this.totalAmount = totalAmount;
		this.patientIssueReturnDate = patientIssueReturnDate;
		this.printingStatus = printingStatus;
		this.patientIssueReturnType = patientIssueReturnType;
		this.userId = userId;
		this.userIp = userIp;
	}

	public PatientIssueReturn(PatientIssueReturnId id, String issueNo,
			BigDecimal totalAmount, Date patientIssueReturnDate,
			BigDecimal printingStatus, BigDecimal patientIssueReturnType,
			String userId, String userIp,
			Set<PatientIssueReturnItem> patientIssueReturnItems) {
		this.id = id;
		this.issueNo = issueNo;
		this.totalAmount = totalAmount;
		this.patientIssueReturnDate = patientIssueReturnDate;
		this.printingStatus = printingStatus;
		this.patientIssueReturnType = patientIssueReturnType;
		this.userId = userId;
		this.userIp = userIp;
		this.patientIssueReturnItems = patientIssueReturnItems;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "phUnitNo", column = @Column(name = "PH_UNIT_NO", nullable = false, length = 20)),
			@AttributeOverride(name = "patientIssueReturnNo", column = @Column(name = "PATIENT_ISSUE_RETURN_NO", nullable = false, length = 20)) })
	public PatientIssueReturnId getId() {
		return this.id;
	}

	public void setId(PatientIssueReturnId id) {
		this.id = id;
	}

	@Column(name = "ISSUE_NO", nullable = false, length = 20)
	public String getIssueNo() {
		return this.issueNo;
	}

	public void setIssueNo(String issueNo) {
		this.issueNo = issueNo;
	}

	@Column(name = "TOTAL_AMOUNT", nullable = false, precision = 10)
	public BigDecimal getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "PATIENT_ISSUE_RETURN_DATE", nullable = false, length = 7)
	public Date getPatientIssueReturnDate() {
		return this.patientIssueReturnDate;
	}

	public void setPatientIssueReturnDate(Date patientIssueReturnDate) {
		this.patientIssueReturnDate = patientIssueReturnDate;
	}

	@Column(name = "PRINTING_STATUS", nullable = false, precision = 38, scale = 0)
	public BigDecimal getPrintingStatus() {
		return this.printingStatus;
	}

	public void setPrintingStatus(BigDecimal printingStatus) {
		this.printingStatus = printingStatus;
	}

	@Column(name = "PATIENT_ISSUE_RETURN_TYPE", nullable = false, precision = 38, scale = 0)
	public BigDecimal getPatientIssueReturnType() {
		return this.patientIssueReturnType;
	}

	public void setPatientIssueReturnType(BigDecimal patientIssueReturnType) {
		this.patientIssueReturnType = patientIssueReturnType;
	}

	@Column(name = "USER_ID", nullable = false, length = 20)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "USER_IP", nullable = false, length = 15)
	public String getUserIp() {
		return this.userIp;
	}

	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "patientIssueReturn")
	public Set<PatientIssueReturnItem> getPatientIssueReturnItems() {
		return this.patientIssueReturnItems;
	}

	public void setPatientIssueReturnItems(
			Set<PatientIssueReturnItem> patientIssueReturnItems) {
		this.patientIssueReturnItems = patientIssueReturnItems;
	}

}
