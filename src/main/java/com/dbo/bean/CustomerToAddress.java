package com.dbo.bean;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_address")
public class CustomerToAddress {

	    @Column(name="Customer_Default_Address")
		private long CustomerDefaultAddress;
		  
		@Column(name="Address_ID")
		private int AddressID;
		
		@Column(name="customer_ID")
		private int customerID;

		public CustomerToAddress(long customerDefaultAddress, int addressID, int customerID) {
			super();
			CustomerDefaultAddress = customerDefaultAddress;
			AddressID = addressID;
			this.customerID = customerID;
		}

		public long getCustomerDefaultAddress() {
			return CustomerDefaultAddress;
		}

		public void setCustomerDefaultAddress(long customerDefaultAddress) {
			CustomerDefaultAddress = customerDefaultAddress;
		}

		public int getAddressID() {
			return AddressID;
		}

		public void setAddressID(int addressID) {
			AddressID = addressID;
		}

		public int getCustomerID() {
			return customerID;
		}

		public void setCustomerID(int customerID) {
			this.customerID = customerID;
		}

		
}
