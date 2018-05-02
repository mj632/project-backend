package com.dbo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="logintype")
public class LoginType {

	@Column(name="LoginType")
	private int logintype;
	
	@Column(name="UserID")
	private int UserID;
	
	@Column(name="Manager_ID")
	private int ManagerID;
    
	@Column(name="Customer_ID")
	private String CustomerID;

	public int getLogintype() {
		return logintype;
	}

	public void setLogintype(int logintype) {
		this.logintype = logintype;
	}

	public int getUserID() {
		return UserID;
	}

	public void setUserID(int userID) {
		UserID = userID;
	}

	public int getManagerID() {
		return ManagerID;
	}

	public void setManagerID(int managerID) {
		ManagerID = managerID;
	}

	public String getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(String customerID) {
		CustomerID = customerID;
	}
	
	
}
