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
 * DrugItem generated by hbm2java
 */
@Entity
@Table(name = "DRUG_ITEM")
public class DrugItem extends DomainDefault implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String itemNo;
	private DrugCategory drugCategory;
	private String genericName;
	private String tradeName;
	private String weight;
	private BigDecimal grnMeasQuantity;
	private String issueMeasUnit;
	private BigDecimal assetType;
	private BigDecimal drugType;
	private Double margin;
	private Date itemRegisteredDate;
	private BigDecimal currentStatus;
	private String userId;
	private String userIp;
	private String oldCode;
	private Double retailMargine;
	private BigDecimal useType;
	private Set<PatientIssueReturnItem> patientIssueReturnItems = new HashSet<PatientIssueReturnItem>(
			0);
	private Set<TempQuantity> tempQuantities = new HashSet<TempQuantity>(0);

	public DrugItem() {
	}

	public DrugItem(String itemNo, DrugCategory drugCategory,
			String genericName, String tradeName, BigDecimal grnMeasQuantity,
			String issueMeasUnit, BigDecimal assetType, BigDecimal drugType,
			Date itemRegisteredDate, BigDecimal currentStatus, String userId,
			String userIp, BigDecimal useType) {
		this.itemNo = itemNo;
		this.drugCategory = drugCategory;
		this.genericName = genericName;
		this.tradeName = tradeName;
		this.grnMeasQuantity = grnMeasQuantity;
		this.issueMeasUnit = issueMeasUnit;
		this.assetType = assetType;
		this.drugType = drugType;
		this.itemRegisteredDate = itemRegisteredDate;
		this.currentStatus = currentStatus;
		this.userId = userId;
		this.userIp = userIp;
		this.useType = useType;
	}

	public DrugItem(String itemNo, DrugCategory drugCategory,
			String genericName, String tradeName, String weight,
			BigDecimal grnMeasQuantity, String issueMeasUnit,
			BigDecimal assetType, BigDecimal drugType, Double margin,
			Date itemRegisteredDate, BigDecimal currentStatus, String userId,
			String userIp, String oldCode, Double retailMargine,
			BigDecimal useType,
			Set<PatientIssueReturnItem> patientIssueReturnItems,
			Set<TempQuantity> tempQuantities) {
		this.itemNo = itemNo;
		this.drugCategory = drugCategory;
		this.genericName = genericName;
		this.tradeName = tradeName;
		this.weight = weight;
		this.grnMeasQuantity = grnMeasQuantity;
		this.issueMeasUnit = issueMeasUnit;
		this.assetType = assetType;
		this.drugType = drugType;
		this.margin = margin;
		this.itemRegisteredDate = itemRegisteredDate;
		this.currentStatus = currentStatus;
		this.userId = userId;
		this.userIp = userIp;
		this.oldCode = oldCode;
		this.retailMargine = retailMargine;
		this.useType = useType;
		this.patientIssueReturnItems = patientIssueReturnItems;
		this.tempQuantities = tempQuantities;
	}

	@Id
	@Column(name = "ITEM_NO", unique = true, nullable = false, length = 20)
	public String getItemNo() {
		return this.itemNo;
	}

	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CATEGORY_NO", nullable = false)
	public DrugCategory getDrugCategory() {
		return this.drugCategory;
	}

	public void setDrugCategory(DrugCategory drugCategory) {
		this.drugCategory = drugCategory;
	}

	@Column(name = "GENERIC_NAME", nullable = false, length = 100)
	public String getGenericName() {
		return this.genericName;
	}

	public void setGenericName(String genericName) {
		this.genericName = genericName;
	}

	@Column(name = "TRADE_NAME", nullable = false, length = 100)
	public String getTradeName() {
		return this.tradeName;
	}

	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}

	@Column(name = "WEIGHT", length = 20)
	public String getWeight() {
		return this.weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	@Column(name = "GRN_MEAS_QUANTITY", nullable = false, precision = 38, scale = 0)
	public BigDecimal getGrnMeasQuantity() {
		return this.grnMeasQuantity;
	}

	public void setGrnMeasQuantity(BigDecimal grnMeasQuantity) {
		this.grnMeasQuantity = grnMeasQuantity;
	}

	@Column(name = "ISSUE_MEAS_UNIT", nullable = false, length = 20)
	public String getIssueMeasUnit() {
		return this.issueMeasUnit;
	}

	public void setIssueMeasUnit(String issueMeasUnit) {
		this.issueMeasUnit = issueMeasUnit;
	}

	@Column(name = "ASSET_TYPE", nullable = false, precision = 38, scale = 0)
	public BigDecimal getAssetType() {
		return this.assetType;
	}

	public void setAssetType(BigDecimal assetType) {
		this.assetType = assetType;
	}

	@Column(name = "DRUG_TYPE", nullable = false, precision = 38, scale = 0)
	public BigDecimal getDrugType() {
		return this.drugType;
	}

	public void setDrugType(BigDecimal drugType) {
		this.drugType = drugType;
	}

	@Column(name = "MARGIN", precision = 126, scale = 0)
	public Double getMargin() {
		return this.margin;
	}

	public void setMargin(Double margin) {
		this.margin = margin;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ITEM_REGISTERED_DATE", nullable = false, length = 7)
	public Date getItemRegisteredDate() {
		return this.itemRegisteredDate;
	}

	public void setItemRegisteredDate(Date itemRegisteredDate) {
		this.itemRegisteredDate = itemRegisteredDate;
	}

	@Column(name = "CURRENT_STATUS", nullable = false, precision = 38, scale = 0)
	public BigDecimal getCurrentStatus() {
		return this.currentStatus;
	}

	public void setCurrentStatus(BigDecimal currentStatus) {
		this.currentStatus = currentStatus;
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

	@Column(name = "OLD_CODE", length = 20)
	public String getOldCode() {
		return this.oldCode;
	}

	public void setOldCode(String oldCode) {
		this.oldCode = oldCode;
	}

	@Column(name = "RETAIL_MARGINE", precision = 126, scale = 0)
	public Double getRetailMargine() {
		return this.retailMargine;
	}

	public void setRetailMargine(Double retailMargine) {
		this.retailMargine = retailMargine;
	}

	@Column(name = "USE_TYPE", nullable = false, precision = 22, scale = 0)
	public BigDecimal getUseType() {
		return this.useType;
	}

	public void setUseType(BigDecimal useType) {
		this.useType = useType;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "drugItem")
	public Set<PatientIssueReturnItem> getPatientIssueReturnItems() {
		return this.patientIssueReturnItems;
	}

	public void setPatientIssueReturnItems(
			Set<PatientIssueReturnItem> patientIssueReturnItems) {
		this.patientIssueReturnItems = patientIssueReturnItems;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "drugItem")
	public Set<TempQuantity> getTempQuantities() {
		return this.tempQuantities;
	}

	public void setTempQuantities(Set<TempQuantity> tempQuantities) {
		this.tempQuantities = tempQuantities;
	}

}
