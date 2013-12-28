package com.kilbees.bussiness.model;
// default package
// Generated Sep 21, 2013 7:48:48 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * DrugCategory generated by hbm2java
 */
@Entity
@Table(name = "DRUG_CATEGORY")
public class DrugCategory implements java.io.Serializable {

	private String categoryNo;
	private String categoryName;
	private String billingCategory;
	private Set<DrugItem> drugItems = new HashSet<DrugItem>(0);

	public DrugCategory() {
	}

	public DrugCategory(String categoryNo, String categoryName,
			String billingCategory) {
		this.categoryNo = categoryNo;
		this.categoryName = categoryName;
		this.billingCategory = billingCategory;
	}

	public DrugCategory(String categoryNo, String categoryName,
			String billingCategory, Set<DrugItem> drugItems) {
		this.categoryNo = categoryNo;
		this.categoryName = categoryName;
		this.billingCategory = billingCategory;
		this.drugItems = drugItems;
	}

	@Id
	@Column(name = "CATEGORY_NO", unique = true, nullable = false, length = 20)
	public String getCategoryNo() {
		return this.categoryNo;
	}

	public void setCategoryNo(String categoryNo) {
		this.categoryNo = categoryNo;
	}

	@Column(name = "CATEGORY_NAME", nullable = false, length = 50)
	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Column(name = "BILLING_CATEGORY", nullable = false, length = 50)
	public String getBillingCategory() {
		return this.billingCategory;
	}

	public void setBillingCategory(String billingCategory) {
		this.billingCategory = billingCategory;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "drugCategory")
	public Set<DrugItem> getDrugItems() {
		return this.drugItems;
	}

	public void setDrugItems(Set<DrugItem> drugItems) {
		this.drugItems = drugItems;
	}

}
