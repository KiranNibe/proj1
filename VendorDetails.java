package com.ims.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vendor_details")
public class VendorDetails {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="vendorid")
	 private long  vendorId;
	 @Column(name="name")
	 private String  vendorName;
	 @Column(name="mobileno")
	 private String  mobileNo;
	 @Column(name="phone")
	 private String  phoneNo;
	 @Column(name="email")
	 private String  email;
	 @Column(name="website")
	 private String  website;
	 @Column(name="address")
	 private String  address;
	 @Column(name="city")
	 private String  city;
	 @Column(name="state")
	 private String  state;
	 @Column(name="country")
	 private String  country;
	 @Column(name="status")
	 private int  status;
	 @Column(name="zipcode")
	 private String zipCode; 
	 
	 
	 
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public long getVendorId() {
		return vendorId;
	}
	public void setVendorId(long vendorId) {
		this.vendorId = vendorId;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	 
	 
	 
	 
	 
}
