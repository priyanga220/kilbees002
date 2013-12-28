package com.kilbees.bussiness.model;
// default package
// Generated Sep 21, 2013 7:48:48 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Directions generated by hbm2java
 */
@Entity
@Table(name = "DIRECTIONS")
public class Directions implements java.io.Serializable {

	private String directionNo;
	private String directionName;
	private String directionDescription;
	private BigDecimal noOfItems;
	private String sinhala;
	private Set<OutdoorIssueItem> outdoorIssueItems = new HashSet<OutdoorIssueItem>(
			0);

	public Directions() {
	}

	public Directions(String directionNo, String directionName,
			String directionDescription, BigDecimal noOfItems) {
		this.directionNo = directionNo;
		this.directionName = directionName;
		this.directionDescription = directionDescription;
		this.noOfItems = noOfItems;
	}

	public Directions(String directionNo, String directionName,
			String directionDescription, BigDecimal noOfItems, String sinhala,
			Set<OutdoorIssueItem> outdoorIssueItems) {
		this.directionNo = directionNo;
		this.directionName = directionName;
		this.directionDescription = directionDescription;
		this.noOfItems = noOfItems;
		this.sinhala = sinhala;
		this.outdoorIssueItems = outdoorIssueItems;
	}

	@Id
	@Column(name = "DIRECTION_NO", unique = true, nullable = false, length = 20)
	public String getDirectionNo() {
		return this.directionNo;
	}

	public void setDirectionNo(String directionNo) {
		this.directionNo = directionNo;
	}

	@Column(name = "DIRECTION_NAME", nullable = false, length = 100)
	public String getDirectionName() {
		return this.directionName;
	}

	public void setDirectionName(String directionName) {
		this.directionName = directionName;
	}

	@Column(name = "DIRECTION_DESCRIPTION", nullable = false, length = 100)
	public String getDirectionDescription() {
		return this.directionDescription;
	}

	public void setDirectionDescription(String directionDescription) {
		this.directionDescription = directionDescription;
	}

	@Column(name = "NO_OF_ITEMS", nullable = false, precision = 22, scale = 0)
	public BigDecimal getNoOfItems() {
		return this.noOfItems;
	}

	public void setNoOfItems(BigDecimal noOfItems) {
		this.noOfItems = noOfItems;
	}

	@Column(name = "SINHALA", length = 200)
	public String getSinhala() {
		return this.sinhala;
	}

	public void setSinhala(String sinhala) {
		this.sinhala = sinhala;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "directions")
	public Set<OutdoorIssueItem> getOutdoorIssueItems() {
		return this.outdoorIssueItems;
	}

	public void setOutdoorIssueItems(Set<OutdoorIssueItem> outdoorIssueItems) {
		this.outdoorIssueItems = outdoorIssueItems;
	}

}