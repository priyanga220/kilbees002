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
 * OpdCreditPatients generated by hbm2java
 */
@Entity
@Table(name = "OPD_CREDIT_PATIENTS")
public class OpdCreditPatients implements java.io.Serializable {

	private OpdCreditPatientsId id;
	private String patientName;
	private String creditCompanyId;
	private Date regDate;
	private String regUser;
	private String nid;
	private String status;
	private String policyNo;
	private String sex;
	private String foriegnFlag;
	private Short ageYy;
	private Byte ageMm;
	private String finalBillStatus;

	public OpdCreditPatients() {
	}

	public OpdCreditPatients(OpdCreditPatientsId id) {
		this.id = id;
	}

	public OpdCreditPatients(OpdCreditPatientsId id, String patientName,
			String creditCompanyId, Date regDate, String regUser, String nid,
			String status, String policyNo, String sex, String foriegnFlag,
			Short ageYy, Byte ageMm, String finalBillStatus) {
		this.id = id;
		this.patientName = patientName;
		this.creditCompanyId = creditCompanyId;
		this.regDate = regDate;
		this.regUser = regUser;
		this.nid = nid;
		this.status = status;
		this.policyNo = policyNo;
		this.sex = sex;
		this.foriegnFlag = foriegnFlag;
		this.ageYy = ageYy;
		this.ageMm = ageMm;
		this.finalBillStatus = finalBillStatus;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "phUnitNo", column = @Column(name = "PH_UNIT_NO", nullable = false, length = 20)),
			@AttributeOverride(name = "regNo", column = @Column(name = "REG_NO", nullable = false, length = 25)) })
	public OpdCreditPatientsId getId() {
		return this.id;
	}

	public void setId(OpdCreditPatientsId id) {
		this.id = id;
	}

	@Column(name = "PATIENT_NAME", length = 300)
	public String getPatientName() {
		return this.patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	@Column(name = "CREDIT_COMPANY_ID", length = 20)
	public String getCreditCompanyId() {
		return this.creditCompanyId;
	}

	public void setCreditCompanyId(String creditCompanyId) {
		this.creditCompanyId = creditCompanyId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "REG_DATE", length = 7)
	public Date getRegDate() {
		return this.regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	@Column(name = "REG_USER", length = 50)
	public String getRegUser() {
		return this.regUser;
	}

	public void setRegUser(String regUser) {
		this.regUser = regUser;
	}

	@Column(name = "NID", length = 50)
	public String getNid() {
		return this.nid;
	}

	public void setNid(String nid) {
		this.nid = nid;
	}

	@Column(name = "STATUS", length = 1)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "POLICY_NO", length = 25)
	public String getPolicyNo() {
		return this.policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	@Column(name = "SEX", length = 1)
	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Column(name = "FORIEGN_FLAG", length = 1)
	public String getForiegnFlag() {
		return this.foriegnFlag;
	}

	public void setForiegnFlag(String foriegnFlag) {
		this.foriegnFlag = foriegnFlag;
	}

	@Column(name = "AGE_YY", precision = 3, scale = 0)
	public Short getAgeYy() {
		return this.ageYy;
	}

	public void setAgeYy(Short ageYy) {
		this.ageYy = ageYy;
	}

	@Column(name = "AGE_MM", precision = 2, scale = 0)
	public Byte getAgeMm() {
		return this.ageMm;
	}

	public void setAgeMm(Byte ageMm) {
		this.ageMm = ageMm;
	}

	@Column(name = "FINAL_BILL_STATUS", length = 1)
	public String getFinalBillStatus() {
		return this.finalBillStatus;
	}

	public void setFinalBillStatus(String finalBillStatus) {
		this.finalBillStatus = finalBillStatus;
	}

}
