package com.dbo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="warehouse")
public class Warehouse {


	@Id   
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int WarehouseID;
	  
	@Column(name="Warehouse_Name")
	private String WarehouseName;
	
	@Column(name="Employee_Phone")
	private String WarehouseDesc;

	public int getWarehouseID() {
		return WarehouseID;
	}

	public void setWarehouseID(int warehouseID) {
		WarehouseID = warehouseID;
	}

	public String getWarehouseName() {
		return WarehouseName;
	}

	public void setWarehouseName(String warehouseName) {
		WarehouseName = warehouseName;
	}

	public String getWarehouseDesc() {
		return WarehouseDesc;
	}

	public void setWarehouseDesc(String warehouseDesc) {
		WarehouseDesc = warehouseDesc;
	}
	
	
}
