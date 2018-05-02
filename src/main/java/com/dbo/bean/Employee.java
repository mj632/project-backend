package com.dbo.bean;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

	@Id   
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int EmployeeID;
	  
	@Column(name="Employee_Role")
	private String EmployeeRole;
	
	@Column(name="Employee_Phone")
	private int EmployeePhone;
	
	@Column(name="Employee_Email")
	private String EmployeeEmail;
    
	@Column(name="Employee_Address")
	private String EmployeeAddress;
	
	@Column(name="Employee_Join_Date")
	private String EmployeeJoinDate;
	
	@Column(name="Employee_Grade")
	private float EmployeeGrade;

	public Employee(int employeeID, String employeeRole, int employeePhone, String employeeEmail,
			String employeeAddress, String employeeJoinDate, float employeeGrade) {
		super();
		EmployeeID = employeeID;
		EmployeeRole = employeeRole;
		EmployeePhone = employeePhone;
		EmployeeEmail = employeeEmail;
		EmployeeAddress = employeeAddress;
		EmployeeJoinDate = employeeJoinDate;
		EmployeeGrade = employeeGrade;
	}

	public int getEmployeeID() {
		return EmployeeID;
	}

	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}

	public String getEmployeeRole() {
		return EmployeeRole;
	}

	public void setEmployeeRole(String employeeRole) {
		EmployeeRole = employeeRole;
	}

	public int getEmployeePhone() {
		return EmployeePhone;
	}

	public void setEmployeePhone(int employeePhone) {
		EmployeePhone = employeePhone;
	}

	public String getEmployeeEmail() {
		return EmployeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		EmployeeEmail = employeeEmail;
	}

	public String getEmployeeAddress() {
		return EmployeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		EmployeeAddress = employeeAddress;
	}

	public String getEmployeeJoinDate() {
		return EmployeeJoinDate;
	}

	public void setEmployeeJoinDate(String employeeJoinDate) {
		EmployeeJoinDate = employeeJoinDate;
	}

	public float getEmployeeGrade() {
		return EmployeeGrade;
	}

	public void setEmployeeGrade(float employeeGrade) {
		EmployeeGrade = employeeGrade;
	}
	
	
	
}
