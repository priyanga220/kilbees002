package com.kilbees.bussiness.model;
// default package
// Generated Sep 21, 2013 7:48:48 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * UnitTokenId generated by hbm2java
 */
@Embeddable
public class UnitTokenId implements java.io.Serializable {

	private String unitNo;
	private BigDecimal tokenNo;

	public UnitTokenId() {
	}

	public UnitTokenId(String unitNo, BigDecimal tokenNo) {
		this.unitNo = unitNo;
		this.tokenNo = tokenNo;
	}

	@Column(name = "UNIT_NO", nullable = false, length = 20)
	public String getUnitNo() {
		return this.unitNo;
	}

	public void setUnitNo(String unitNo) {
		this.unitNo = unitNo;
	}

	@Column(name = "TOKEN_NO", nullable = false, precision = 38, scale = 0)
	public BigDecimal getTokenNo() {
		return this.tokenNo;
	}

	public void setTokenNo(BigDecimal tokenNo) {
		this.tokenNo = tokenNo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof UnitTokenId))
			return false;
		UnitTokenId castOther = (UnitTokenId) other;

		return ((this.getUnitNo() == castOther.getUnitNo()) || (this
				.getUnitNo() != null && castOther.getUnitNo() != null && this
				.getUnitNo().equals(castOther.getUnitNo())))
				&& ((this.getTokenNo() == castOther.getTokenNo()) || (this
						.getTokenNo() != null && castOther.getTokenNo() != null && this
						.getTokenNo().equals(castOther.getTokenNo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getUnitNo() == null ? 0 : this.getUnitNo().hashCode());
		result = 37 * result
				+ (getTokenNo() == null ? 0 : this.getTokenNo().hashCode());
		return result;
	}

}