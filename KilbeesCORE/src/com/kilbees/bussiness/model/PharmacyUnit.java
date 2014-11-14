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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PharmacyUnit generated by hbm2java
 */
@Entity
@Table(name = "PHARMACY_UNIT")
public class PharmacyUnit implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6963445273590482471L;
	
	private String unitNo;
	private String unitName;
	private String shortName;
	private double margin;
	private Date unitRegisteredDate;
	private String userId;
	private String userIp;
	private BigDecimal currentStatus;
	private long phaIssueType;
	private BigDecimal detailBilling;
	private String accId;
	private long withCashier;
	private String address1;
	private String address2;
	private String address3;
	private String telephone;
	private Set<DrugItemPharmacyUnit> drugItemPharmacyUnits = new HashSet<DrugItemPharmacyUnit>(
			0);
	private Set<SystemLogin> systemLogins = new HashSet<SystemLogin>(0);
	private Set<TestPhService> testPhServices = new HashSet<TestPhService>(0);
	private Set<ItemPrice> itemPrices = new HashSet<ItemPrice>(0);
	private Set<RelatedPharmacyForRequests> relatedPharmacyForRequestsesForPharmacyUnit2 = new HashSet<RelatedPharmacyForRequests>(
			0);
	private Set<SystemUserUnit> systemUserUnits = new HashSet<SystemUserUnit>(0);
	private Set<ItemMovement> itemMovements = new HashSet<ItemMovement>(0);
	private Set<BeforeVerificationItem> beforeVerificationItems = new HashSet<BeforeVerificationItem>(
			0);
	private Set<Exceed> exceeds = new HashSet<Exceed>(0);
	private Set<Supplier> suppliers = new HashSet<Supplier>(0);
	private Set<OutdoorPatientIssue> outdoorPatientIssues = new HashSet<OutdoorPatientIssue>(
			0);
	private Set<Grn> grns = new HashSet<Grn>(0);
	private Set<PharmacyOrder> pharmacyOrdersForToUnitNo = new HashSet<PharmacyOrder>(
			0);
	private Set<PurchaseOrder> purchaseOrders = new HashSet<PurchaseOrder>(0);
	private Set<BeforeVerification> beforeVerifications = new HashSet<BeforeVerification>(
			0);
	private Set<PurchaseOrderTempItem> purchaseOrderTempItems = new HashSet<PurchaseOrderTempItem>(
			0);
	private Set<ItemConsumption> itemConsumptions = new HashSet<ItemConsumption>(
			0);
	private Set<PaymentType> paymentTypes = new HashSet<PaymentType>(0);
	private Set<ReorderTempItem> reorderTempItems = new HashSet<ReorderTempItem>(
			0);
	private Set<PharmacyUnitLog> pharmacyUnitLogs = new HashSet<PharmacyUnitLog>(
			0);
	private Set<RelatedPharmacyForRequests> relatedPharmacyForRequestsesForPharmacyUnit1 = new HashSet<RelatedPharmacyForRequests>(
			0);
	private Set<PharmacyOrder> pharmacyOrdersForFromUnitNo = new HashSet<PharmacyOrder>(
			0);
	private Set<DirrectIssueToUnit> dirrectIssueToUnitsForToUnitNo = new HashSet<DirrectIssueToUnit>(
			0);
	private Set<DirrectIssueToUnit> dirrectIssueToUnitsForFromUnitNo = new HashSet<DirrectIssueToUnit>(
			0);
	private Set<TempQuantity> tempQuantities = new HashSet<TempQuantity>(0);

	public PharmacyUnit() {
	}

	public PharmacyUnit(String unitNo, String unitName, String shortName,
			double margin, Date unitRegisteredDate, String userId,
			String userIp, BigDecimal currentStatus, long phaIssueType,
			String accId, long withCashier, String address1) {
		this.unitNo = unitNo;
		this.unitName = unitName;
		this.shortName = shortName;
		this.margin = margin;
		this.unitRegisteredDate = unitRegisteredDate;
		this.userId = userId;
		this.userIp = userIp;
		this.currentStatus = currentStatus;
		this.phaIssueType = phaIssueType;
		this.accId = accId;
		this.withCashier = withCashier;
		this.address1 = address1;
	}

	public PharmacyUnit(
			String unitNo,
			String unitName,
			String shortName,
			double margin,
			Date unitRegisteredDate,
			String userId,
			String userIp,
			BigDecimal currentStatus,
			long phaIssueType,
			BigDecimal detailBilling,
			String accId,
			long withCashier,
			String address1,
			String address2,
			String address3,
			String telephone,
			Set<DrugItemPharmacyUnit> drugItemPharmacyUnits,
			Set<SystemLogin> systemLogins,
			Set<TestPhService> testPhServices,
			Set<ItemPrice> itemPrices,
			Set<RelatedPharmacyForRequests> relatedPharmacyForRequestsesForPharmacyUnit2,
			Set<SystemUserUnit> systemUserUnits,
			Set<ItemMovement> itemMovements,
			Set<BeforeVerificationItem> beforeVerificationItems,
			Set<Exceed> exceeds,
			Set<Supplier> suppliers,
			Set<OutdoorPatientIssue> outdoorPatientIssues,
			Set<Grn> grns,
			Set<PharmacyOrder> pharmacyOrdersForToUnitNo,
			Set<PurchaseOrder> purchaseOrders,
			Set<BeforeVerification> beforeVerifications,
			Set<PurchaseOrderTempItem> purchaseOrderTempItems,
			Set<ItemConsumption> itemConsumptions,
			Set<PaymentType> paymentTypes,
			Set<ReorderTempItem> reorderTempItems,
			Set<PharmacyUnitLog> pharmacyUnitLogs,
			Set<RelatedPharmacyForRequests> relatedPharmacyForRequestsesForPharmacyUnit1,
			Set<PharmacyOrder> pharmacyOrdersForFromUnitNo,
			Set<DirrectIssueToUnit> dirrectIssueToUnitsForToUnitNo,
			Set<DirrectIssueToUnit> dirrectIssueToUnitsForFromUnitNo,
			Set<TempQuantity> tempQuantities) {
		this.unitNo = unitNo;
		this.unitName = unitName;
		this.shortName = shortName;
		this.margin = margin;
		this.unitRegisteredDate = unitRegisteredDate;
		this.userId = userId;
		this.userIp = userIp;
		this.currentStatus = currentStatus;
		this.phaIssueType = phaIssueType;
		this.detailBilling = detailBilling;
		this.accId = accId;
		this.withCashier = withCashier;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.telephone = telephone;
		this.drugItemPharmacyUnits = drugItemPharmacyUnits;
		this.systemLogins = systemLogins;
		this.testPhServices = testPhServices;
		this.itemPrices = itemPrices;
		this.relatedPharmacyForRequestsesForPharmacyUnit2 = relatedPharmacyForRequestsesForPharmacyUnit2;
		this.systemUserUnits = systemUserUnits;
		this.itemMovements = itemMovements;
		this.beforeVerificationItems = beforeVerificationItems;
		this.exceeds = exceeds;
		this.suppliers = suppliers;
		this.outdoorPatientIssues = outdoorPatientIssues;
		this.grns = grns;
		this.pharmacyOrdersForToUnitNo = pharmacyOrdersForToUnitNo;
		this.purchaseOrders = purchaseOrders;
		this.beforeVerifications = beforeVerifications;
		this.purchaseOrderTempItems = purchaseOrderTempItems;
		this.itemConsumptions = itemConsumptions;
		this.paymentTypes = paymentTypes;
		this.reorderTempItems = reorderTempItems;
		this.pharmacyUnitLogs = pharmacyUnitLogs;
		this.relatedPharmacyForRequestsesForPharmacyUnit1 = relatedPharmacyForRequestsesForPharmacyUnit1;
		this.pharmacyOrdersForFromUnitNo = pharmacyOrdersForFromUnitNo;
		this.dirrectIssueToUnitsForToUnitNo = dirrectIssueToUnitsForToUnitNo;
		this.dirrectIssueToUnitsForFromUnitNo = dirrectIssueToUnitsForFromUnitNo;
		this.tempQuantities = tempQuantities;
	}

	@Id
	@Column(name = "UNIT_NO", unique = true, nullable = false, length = 20)
	public String getUnitNo() {
		return this.unitNo;
	}

	public void setUnitNo(String unitNo) {
		this.unitNo = unitNo;
	}

	@Column(name = "UNIT_NAME", nullable = false, length = 100)
	public String getUnitName() {
		return this.unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	@Column(name = "SHORT_NAME", nullable = false, length = 20)
	public String getShortName() {
		return this.shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	@Column(name = "MARGIN", nullable = false, precision = 126, scale = 0)
	public double getMargin() {
		return this.margin;
	}

	public void setMargin(double margin) {
		this.margin = margin;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "UNIT_REGISTERED_DATE", nullable = false, length = 7)
	public Date getUnitRegisteredDate() {
		return this.unitRegisteredDate;
	}

	public void setUnitRegisteredDate(Date unitRegisteredDate) {
		this.unitRegisteredDate = unitRegisteredDate;
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

	@Column(name = "CURRENT_STATUS", nullable = false, precision = 38, scale = 0)
	public BigDecimal getCurrentStatus() {
		return this.currentStatus;
	}

	public void setCurrentStatus(BigDecimal currentStatus) {
		this.currentStatus = currentStatus;
	}

	@Column(name = "PHA_ISSUE_TYPE", nullable = false, precision = 10, scale = 0)
	public long getPhaIssueType() {
		return this.phaIssueType;
	}

	public void setPhaIssueType(long phaIssueType) {
		this.phaIssueType = phaIssueType;
	}

	@Column(name = "DETAIL_BILLING", precision = 22, scale = 0)
	public BigDecimal getDetailBilling() {
		return this.detailBilling;
	}

	public void setDetailBilling(BigDecimal detailBilling) {
		this.detailBilling = detailBilling;
	}

	@Column(name = "ACC_ID", nullable = false, length = 10)
	public String getAccId() {
		return this.accId;
	}

	public void setAccId(String accId) {
		this.accId = accId;
	}

	@Column(name = "WITH_CASHIER", nullable = false, precision = 10, scale = 0)
	public long getWithCashier() {
		return this.withCashier;
	}

	public void setWithCashier(long withCashier) {
		this.withCashier = withCashier;
	}

	@Column(name = "ADDRESS_1", nullable = false, length = 100)
	public String getAddress1() {
		return this.address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	@Column(name = "ADDRESS_2", length = 100)
	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	@Column(name = "ADDRESS_3", length = 100)
	public String getAddress3() {
		return this.address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	@Column(name = "TELEPHONE", length = 100)
	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pharmacyUnit")
	public Set<DrugItemPharmacyUnit> getDrugItemPharmacyUnits() {
		return this.drugItemPharmacyUnits;
	}

	public void setDrugItemPharmacyUnits(
			Set<DrugItemPharmacyUnit> drugItemPharmacyUnits) {
		this.drugItemPharmacyUnits = drugItemPharmacyUnits;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pharmacyUnit")
	public Set<SystemLogin> getSystemLogins() {
		return this.systemLogins;
	}

	public void setSystemLogins(Set<SystemLogin> systemLogins) {
		this.systemLogins = systemLogins;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pharmacyUnit")
	public Set<TestPhService> getTestPhServices() {
		return this.testPhServices;
	}

	public void setTestPhServices(Set<TestPhService> testPhServices) {
		this.testPhServices = testPhServices;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pharmacyUnit")
	public Set<ItemPrice> getItemPrices() {
		return this.itemPrices;
	}

	public void setItemPrices(Set<ItemPrice> itemPrices) {
		this.itemPrices = itemPrices;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pharmacyUnitByPharmacyUnit2")
	public Set<RelatedPharmacyForRequests> getRelatedPharmacyForRequestsesForPharmacyUnit2() {
		return this.relatedPharmacyForRequestsesForPharmacyUnit2;
	}

	public void setRelatedPharmacyForRequestsesForPharmacyUnit2(
			Set<RelatedPharmacyForRequests> relatedPharmacyForRequestsesForPharmacyUnit2) {
		this.relatedPharmacyForRequestsesForPharmacyUnit2 = relatedPharmacyForRequestsesForPharmacyUnit2;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pharmacyUnit")
	public Set<SystemUserUnit> getSystemUserUnits() {
		return this.systemUserUnits;
	}

	public void setSystemUserUnits(Set<SystemUserUnit> systemUserUnits) {
		this.systemUserUnits = systemUserUnits;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pharmacyUnit")
	public Set<ItemMovement> getItemMovements() {
		return this.itemMovements;
	}

	public void setItemMovements(Set<ItemMovement> itemMovements) {
		this.itemMovements = itemMovements;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pharmacyUnit")
	public Set<BeforeVerificationItem> getBeforeVerificationItems() {
		return this.beforeVerificationItems;
	}

	public void setBeforeVerificationItems(
			Set<BeforeVerificationItem> beforeVerificationItems) {
		this.beforeVerificationItems = beforeVerificationItems;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pharmacyUnit")
	public Set<Exceed> getExceeds() {
		return this.exceeds;
	}

	public void setExceeds(Set<Exceed> exceeds) {
		this.exceeds = exceeds;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pharmacyUnit")
	public Set<Supplier> getSuppliers() {
		return this.suppliers;
	}

	public void setSuppliers(Set<Supplier> suppliers) {
		this.suppliers = suppliers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pharmacyUnit")
	public Set<OutdoorPatientIssue> getOutdoorPatientIssues() {
		return this.outdoorPatientIssues;
	}

	public void setOutdoorPatientIssues(
			Set<OutdoorPatientIssue> outdoorPatientIssues) {
		this.outdoorPatientIssues = outdoorPatientIssues;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pharmacyUnit")
	public Set<Grn> getGrns() {
		return this.grns;
	}

	public void setGrns(Set<Grn> grns) {
		this.grns = grns;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pharmacyUnitByToUnitNo")
	public Set<PharmacyOrder> getPharmacyOrdersForToUnitNo() {
		return this.pharmacyOrdersForToUnitNo;
	}

	public void setPharmacyOrdersForToUnitNo(
			Set<PharmacyOrder> pharmacyOrdersForToUnitNo) {
		this.pharmacyOrdersForToUnitNo = pharmacyOrdersForToUnitNo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pharmacyUnit")
	public Set<PurchaseOrder> getPurchaseOrders() {
		return this.purchaseOrders;
	}

	public void setPurchaseOrders(Set<PurchaseOrder> purchaseOrders) {
		this.purchaseOrders = purchaseOrders;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pharmacyUnit")
	public Set<BeforeVerification> getBeforeVerifications() {
		return this.beforeVerifications;
	}

	public void setBeforeVerifications(
			Set<BeforeVerification> beforeVerifications) {
		this.beforeVerifications = beforeVerifications;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pharmacyUnit")
	public Set<PurchaseOrderTempItem> getPurchaseOrderTempItems() {
		return this.purchaseOrderTempItems;
	}

	public void setPurchaseOrderTempItems(
			Set<PurchaseOrderTempItem> purchaseOrderTempItems) {
		this.purchaseOrderTempItems = purchaseOrderTempItems;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pharmacyUnit")
	public Set<ItemConsumption> getItemConsumptions() {
		return this.itemConsumptions;
	}

	public void setItemConsumptions(Set<ItemConsumption> itemConsumptions) {
		this.itemConsumptions = itemConsumptions;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pharmacyUnit")
	public Set<PaymentType> getPaymentTypes() {
		return this.paymentTypes;
	}

	public void setPaymentTypes(Set<PaymentType> paymentTypes) {
		this.paymentTypes = paymentTypes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pharmacyUnit")
	public Set<ReorderTempItem> getReorderTempItems() {
		return this.reorderTempItems;
	}

	public void setReorderTempItems(Set<ReorderTempItem> reorderTempItems) {
		this.reorderTempItems = reorderTempItems;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pharmacyUnit")
	public Set<PharmacyUnitLog> getPharmacyUnitLogs() {
		return this.pharmacyUnitLogs;
	}

	public void setPharmacyUnitLogs(Set<PharmacyUnitLog> pharmacyUnitLogs) {
		this.pharmacyUnitLogs = pharmacyUnitLogs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pharmacyUnitByPharmacyUnit1")
	public Set<RelatedPharmacyForRequests> getRelatedPharmacyForRequestsesForPharmacyUnit1() {
		return this.relatedPharmacyForRequestsesForPharmacyUnit1;
	}

	public void setRelatedPharmacyForRequestsesForPharmacyUnit1(
			Set<RelatedPharmacyForRequests> relatedPharmacyForRequestsesForPharmacyUnit1) {
		this.relatedPharmacyForRequestsesForPharmacyUnit1 = relatedPharmacyForRequestsesForPharmacyUnit1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pharmacyUnitByFromUnitNo")
	public Set<PharmacyOrder> getPharmacyOrdersForFromUnitNo() {
		return this.pharmacyOrdersForFromUnitNo;
	}

	public void setPharmacyOrdersForFromUnitNo(
			Set<PharmacyOrder> pharmacyOrdersForFromUnitNo) {
		this.pharmacyOrdersForFromUnitNo = pharmacyOrdersForFromUnitNo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pharmacyUnitByToUnitNo")
	public Set<DirrectIssueToUnit> getDirrectIssueToUnitsForToUnitNo() {
		return this.dirrectIssueToUnitsForToUnitNo;
	}

	public void setDirrectIssueToUnitsForToUnitNo(
			Set<DirrectIssueToUnit> dirrectIssueToUnitsForToUnitNo) {
		this.dirrectIssueToUnitsForToUnitNo = dirrectIssueToUnitsForToUnitNo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pharmacyUnitByFromUnitNo")
	public Set<DirrectIssueToUnit> getDirrectIssueToUnitsForFromUnitNo() {
		return this.dirrectIssueToUnitsForFromUnitNo;
	}

	public void setDirrectIssueToUnitsForFromUnitNo(
			Set<DirrectIssueToUnit> dirrectIssueToUnitsForFromUnitNo) {
		this.dirrectIssueToUnitsForFromUnitNo = dirrectIssueToUnitsForFromUnitNo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pharmacyUnit")
	public Set<TempQuantity> getTempQuantities() {
		return this.tempQuantities;
	}

	public void setTempQuantities(Set<TempQuantity> tempQuantities) {
		this.tempQuantities = tempQuantities;
	}

}
