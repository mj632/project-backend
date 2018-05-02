package com.dbo.bean;

import javax.persistence.*;
//import javax.persistence.FetchType;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="address")
@SequenceGenerator(name="address_seq", initialValue=1, allocationSize=100000)
public class Address {
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="address_seq")
	private Long addressId;
	
	@Column(name="line_1") private String line1;
	@Column(name="line_2") private String line2;
	@Column(name="city") private String city;
	@Column(name="state") private String state;
	@Column(name="country") private String country;
	@Column(name="zip_code") private Long zipCode;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="c_id", nullable=false)
	@JsonIgnore private CustomerDetails customer;


	public Long getAddressId() {
		return addressId;
	}


	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}


	public String getLine1() {
		return line1;
	}


	public void setLine1(String line1) {
		this.line1 = line1;
	}


	public String getLine2() {
		return line2;
	}


	public void setLine2(String line2) {
		this.line2 = line2;
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


	public Long getZipCode() {
		return zipCode;
	}


	public void setZipCode(Long zipCode) {
		this.zipCode = zipCode;
	}


	public CustomerDetails getCustomer() {
		return customer;
	}


	public void setCustomer(CustomerDetails customer) {
		this.customer = customer;
	}
	
//	 @Override
//	    public String toString() {
//	        String result = String.format(
//	        		"Address[address_id=%d, line_1='%s', line_2='%s', city='%s', state='%s', country='%s',zip_code='%s']"
//	        		);
//	        if (customer != null) {
//	            result += String.format(
//		                "CustomerDetails[uid=%d, fname='%s', lname='%s', dob='%s', email='%s']%n",
//		                customer.getId(),customer.getFname(),customer.getLname(),customer.getDob(),customer.getEmail());
//	        }
//
//	        return result;
//	    }
	
	
}
