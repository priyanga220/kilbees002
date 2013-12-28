package com.kilbees.bussiness.model;
// default package
// Generated Sep 21, 2013 7:48:48 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DirrectIssueToUnit generated by hbm2java
 */
@Entity
@Table(name = "DIRRECT_ISSUE_TO_UNIT")
public class DirrectIssueToUnit implements java.io.Serializable {

	private String dirrectIssueNo;
	private PharmacyUnit pharmacyUnitByFromUnitNo;
	private PharmacyUnit pharmacyUnitByToUnitNo;
	private Date dirrectIssueDate;
	private BigDecimal issueStatus;
	private BigDecimal printingStatus;
	private String userId;
	private String userIp;
	private String packageNo;
	private Set<DirrectIssueToUnitItem> dirrectIssueToUnitItems = new HashSet<DirrectIssueToUnitItem>(
			0);

	public DirrectIssueToUnit() {
	}

	public DirrectIssueToUnit(String dirrectIssueNo,
			PharmacyUnit pharmacyUnitByFromUnitNo,
			PharmacyUnit pharmacyUnitByToUnitNo, Date dirrectIssueDate,
			BigDecimal issueStatus, BigDecimal printingStatus, String userId,
			String userIp) {
		this.dirrectIssueNo = dirrectIssueNo;
		this.pharmacyUnitByFromUnitNo = pharmacyUnitByFromUnitNo;
		this.pharmacyUnitByToUnitNo = pharmacyUnitByToUnitNo;
		this.dirrectIssueDate = dirrectIssueDate;
		this.issueStatus = issueStatus;
		this.printingStatus = printingStatus;
		this.userId = userId;
		this.userIp = userIp;
	}

	public DirrectIssueToUnit(String dirrectIssueNo,
			PharmacyUnit pharmacyUnitByFromUnitNo,
			PharmacyUnit pharmacyUnitByToUnitNo, Date dirrectIssueDate,
			BigDecimal issueStatus, BigDecimal printingStatus, String userId,
			String userIp, String packageNo,
			Set<DirrectIssueToUnitItem> dirrectIssueToUnitItems) {
		this.dirrectIssueNo = dirrectIssueNo;
		this.pharmacyUnitByFromUnitNo = pharmacyUnitByFromUnitNo;
		this.pharmacyUnitByToUnitNo = pharmacyUnitByToUnitNo;
		this.dirrectIssueDate = dirrectIssueDate;
		this.issueStatus = issueStatus;
		this.printingStatus = printingStatus;
		this.userId = userId;
		this.userIp = userIp;
		this.packageNo = packageNo;
		this.dirrectIssueToUnitItems = dirrectIssueToUnitItems;
	}

	@Id
	@Column(name = "DIRRECT_ISSUE_NO", unique = true, nullable = false, length = 20)
	public String getDirrectIssueNo() {
		return this.dirrectIssueNo;
	}

	public void setDirrectIssueNo(String dirrectIssueNo) {
		this.dirrectIssueNo = dirrectIssueNo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FROM_UNIT_NO", nullable = false)
	public PharmacyUnit getPharmacyUnitByFromUnitNo() {
		return this.pharmacyUnitByFromUnitNo;
	}

	public void setPharmacyUnitByFromUnitNo(
			PharmacyUnit pharmacyUnitByFromUnitNo) {
		this.pharmacyUnitByFromUnitNo = pharmacyUnitByFromUnitNo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TO_UNIT_NO", nullable = false)
	public PharmacyUnit getPharmacyUnitByToUnitNo() {
		return this.pharmacyUnitByToUnitNo;
	}

	public void setPharmacyUnitByToUnitNo(PharmacyUnit pharmacyUnitByToUnitNo) {
		this.pharmacyUnitByToUnitNo = pharmacyUnitByToUnitNo;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DIRRECT_ISSUE_DATE", nullable = false, length = 7)
	public Date getDirrectIssueDate() {
		return this.dirrectIssueDate;
	}

	public void setDirrectIssueDate(Date dirrectIssueDate) {
		this.dirrectIssueDate = dirrectIssueDate;
	}

	@Column(name = "ISSUE_STATUS", nullable = false, precision = 38, scale = 0)
	public BigDecimal getIssueStatus() {
		return this.issueStatus;
	}

	public void setIssueStatus(BigDecimal issueStatus) {
		this.issueStatus = issueStatus;
	}

	@Column(name = "PRINTING_STATUS", nullable = false, precision = 38, scale = 0)
	public BigDecimal getPrintingStatus() {
		return this.printingStatus;
	}

	public void setPrintingStatus(BigDecimal printingStatus) {
		this.printingStatus = printingStatus;
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

	@Column(name = "PACKAGE_NO", length = 20)
	public String getPackageNo() {
		return this.packageNo;
	}

	public void setPackageNo(String packageNo) {
		this.packageNo = packageNo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "dirrectIssueToUnit")
	public Set<DirrectIssueToUnitItem> getDirrectIssueToUnitItems() {
		return this.dirrectIssueToUnitItems;
	}

	public void setDirrectIssueToUnitItems(
			Set<DirrectIssueToUnitItem> dirrectIssueToUnitItems) {
		this.dirrectIssueToUnitItems = dirrectIssueToUnitItems;
	}

}