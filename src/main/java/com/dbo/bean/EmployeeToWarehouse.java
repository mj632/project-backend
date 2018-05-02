package com.dbo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="employee_warehouse")
public class EmployeeToWarehouse {
	
	
	@Column(name="Employee_ID")
	private int EmployeeID;
	  
	@Column(name="WareHouse_ID")
	private int WareHouseID;

	public EmployeeToWarehouse(int employeeID, int wareHouseID) {
		super();
		EmployeeID = employeeID;
		WareHouseID = wareHouseID;
	}

	public int getEmployeeID() {
		return EmployeeID;
	}

	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}

	public int getWareHouseID() {
		return WareHouseID;
	}

	public void setWareHouseID(int wareHouseID) {
		WareHouseID = wareHouseID;
	}
	
	
}
