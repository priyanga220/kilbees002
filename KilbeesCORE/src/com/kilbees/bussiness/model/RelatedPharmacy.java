package com.kilbees.bussiness.model;
// default package
// Generated Sep 21, 2013 7:48:48 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * RelatedPharmacy generated by hbm2java
 */
@Entity
@Table(name = "RELATED_PHARMACY")
public class RelatedPharmacy implements java.io.Serializable {

	private RelatedPharmacyId id;

	public RelatedPharmacy() {
	}

	public RelatedPharmacy(RelatedPharmacyId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "pharmacyUnit1", column = @Column(name = "PHARMACY_UNIT1", nullable = false, length = 20)),
			@AttributeOverride(name = "pharmacyUnit2", column = @Column(name = "PHARMACY_UNIT2", nullable = false, length = 20)) })
	public RelatedPharmacyId getId() {
		return this.id;
	}

	public void setId(RelatedPharmacyId id) {
		this.id = id;
	}

}
