package com.dbo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {

	@Id   
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int ManagerID;
	  
	@Column(name="Manager_Name")
	private String ManagerName;
	
	@Column(name="Manager_Phone")
	private int ManagerPhone;
	
	@Column(name="Manager_address")
	private String ManagerAddress;
	
	@Column(name="Warehouse_ID")
	private int WarehouseID;

	public int getManagerID() {
		return ManagerID;
	}

	public void setManagerID(int managerID) {
		ManagerID = managerID;
	}

	public String getManagerName() {
		return ManagerName;
	}

	public void setManagerName(String managerName) {
		ManagerName = managerName;
	}

	public int getManagerPhone() {
		return ManagerPhone;
	}

	public void setManagerPhone(int managerPhone) {
		ManagerPhone = managerPhone;
	}

	public String getManagerAddress() {
		return ManagerAddress;
	}

	public void setManagerAddress(String managerAddress) {
		ManagerAddress = managerAddress;
	}

	public int getWarehouseID() {
		return WarehouseID;
	}

	public void setWarehouseID(int warehouseID) {
		WarehouseID = warehouseID;
	}


	
}
