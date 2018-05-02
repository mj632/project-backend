package com.dbo.bean;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;	
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="customers")
public class Customers implements Serializable {

	@Id   
		@GeneratedValue(strategy= GenerationType.AUTO)
		private long customer_id;
		  
		@Column(name="customer_name")
		private String customer_name;
		
		@Column(name="customer_DOB")
		private Date cutomer_DOB;
		
		@Column(name="customer_email")
		private String customer_email;

		public Customers(long customer_id, String customer_name, Date cutomer_DOB, String customer_email) {
			super();
			this.customer_id = customer_id;
			this.customer_name = customer_name;
			this.cutomer_DOB = cutomer_DOB;
			this.customer_email = customer_email;
		}

		public long getCustomer_id() {
			return customer_id;
		}

		public void setCustomer_id(long customer_id) {
			this.customer_id = customer_id;
		}

		public String getCustomer_name() {
			return customer_name;
		}

		public void setCustomer_name(String customer_name) {
			this.customer_name = customer_name;
		}

		public Date getCutomer_DOB() {
			return cutomer_DOB;
		}

		public void setCutomer_DOB(Date cutomer_DOB) {
			this.cutomer_DOB = cutomer_DOB;
		}

		public String getCustomer_email() {
			return customer_email;
		}

		public void setCustomer_email(String customer_email) {
			this.customer_email = customer_email;
		}

        
}
