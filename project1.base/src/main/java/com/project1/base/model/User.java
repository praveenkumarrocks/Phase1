package com.project1.base.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * 
 * @author harkamwaljeet.Singh
 *
 */

@Entity
@Table(name = "project1_user")
public class User extends AbstractPersistable<Long> {
	
	private static final long serialVersionUID = 4775472554921457266L;
	
	@Column(name = "email_id", nullable = false, length = 255)
	private String emailId;

	@HashedField
	@Column(name = "password", nullable = false, length = 255)
	private String password;
	
	@Column(length = 15)
	private String phoneNumber;

	@Column(name = "first_name", length = 45)
	private String firstName;
	
	@Column(name = "last_name", length = 45)
	private String lastName;
	
	@Column(name = "verified")
	private boolean verified;
	
	@JsonManagedReference
	@OneToMany(targetEntity = Address.class, mappedBy = "user", fetch = FetchType.LAZY)
	@Column(name="billing_address")
	private List<Address> billingAddress;
	
	@JsonManagedReference
	@OneToMany(targetEntity = Address.class, mappedBy = "user", fetch = FetchType.LAZY)
	@Column(name="shipping_address")
	private List<Address> shippingAddress;

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean isVerified() {
		return verified;
	}

	public void setVerified(boolean verified) {
		this.verified = verified;
	}

	public List<Address> getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(List<Address> billingAddress) {
		this.billingAddress = billingAddress;
	}

	public List<Address> getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(List<Address> shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	
}