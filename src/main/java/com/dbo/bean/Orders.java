package com.dbo.bean;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")

public class Orders {

	@Id   
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int OrderID;
	  
	@Column(name="Order_Status")
	private int OrderStatus;
	
	@Column(name="Order_Place_Date")
	private Date OrderPlaceDate;
	
	@Column(name="Order_Last_Modified")
	private Date OrderLastModified;
	
	@Column(name="Shipping_Cost")
	private float ShippingCost;
	
	@Column(name="Customer_ID")
	private String CustomerID;

	public int getOrderID() {
		return OrderID;
	}

	public void setOrderID(int orderID) {
		OrderID = orderID;
	}

	public int getOrderStatus() {
		return OrderStatus;
	}

	public void setOrderStatus(int orderStatus) {
		OrderStatus = orderStatus;
	}

	public Date getOrderPlaceDate() {
		return OrderPlaceDate;
	}

	public void setOrderPlaceDate(Date orderPlaceDate) {
		OrderPlaceDate = orderPlaceDate;
	}

	public Date getOrderLastModified() {
		return OrderLastModified;
	}

	public void setOrderLastModified(Date orderLastModified) {
		OrderLastModified = orderLastModified;
	}

	public float getShippingCost() {
		return ShippingCost;
	}

	public void setShippingCost(float shippingCost) {
		ShippingCost = shippingCost;
	}

	public String getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(String customerID) {
		CustomerID = customerID;
	}
	
	
	
	
	
	
}
