package com.project1.base.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * 
 * @author harkamwaljeet.Singh
 *
 */

@Entity
@Table(name="project1_address")
public class Address extends AbstractPersistable<Long>{

	private static final long serialVersionUID = -7895570724794331166L;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonBackReference
	@JoinColumn(name = "user_id", nullable = false)
	private User user;
	
	@Column(name="pincode", length=6)
	private String pincode;

	@Column(name="state", length=50)
	private String state;
	
	@Column(name="city", length=50)
	private String city;
	
	@Column(name="landmark", length=50)
	private String landmark;
	
	@Column(name="street_address", length=255)
	private String streetAddress;
	
	@Column(name="name", length=55)
	private String name;

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}