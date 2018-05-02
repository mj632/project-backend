package com.dbo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="order_product")

public class OrderToProduct {
	
	
	@Column(name="Number_Of_Items")
	private int NumberOfItems;
	  
	@Column(name="OrderProductID")
	private int OrderProductID;
	
	@Column(name="Order_ID")
	private int OrderID;
	
	@Column(name="Product_ID")
	private int ProductID;

	public int getNumberOfItems() {
		return NumberOfItems;
	}

	public void setNumberOfItems(int numberOfItems) {
		NumberOfItems = numberOfItems;
	}

	public int getOrderProductID() {
		return OrderProductID;
	}

	public void setOrderProductID(int orderProductID) {
		OrderProductID = orderProductID;
	}

	public int getOrderID() {
		return OrderID;
	}

	public void setOrderID(int orderID) {
		OrderID = orderID;
	}

	public int getProductID() {
		return ProductID;
	}

	public void setProductID(int productID) {
		ProductID = productID;
	}
	
	
}
