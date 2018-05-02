package com.dbo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="employee_warehouse")
public class ProductToCategory {

	@Column(name="Product_ID")
	private int ProductID;
	  
	@Column(name="Category_ID")
	private int CategoryID;

	public int getProductID() {
		return ProductID;
	}

	public void setProductID(int productID) {
		ProductID = productID;
	}

	public int getCategoryID() {
		return CategoryID;
	}

	public void setCategoryID(int categoryID) {
		CategoryID = categoryID;
	}
	
	
	
}
