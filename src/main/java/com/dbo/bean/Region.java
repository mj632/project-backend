package com.dbo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="region")
public class Region {
 
	@Id   
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int RegionID;
	  
	@Column(name="Region_Name")
	private String RegionName;
	
	@Column(name="Region_Description")
	private String RegionDescription;
	
	@Column(name="WareHouse_ID")
	private int WareHouseID;

	public int getRegionID() {
		return RegionID;
	}

	public void setRegionID(int regionID) {
		RegionID = regionID;
	}

	public String getRegionName() {
		return RegionName;
	}

	public void setRegionName(String regionName) {
		RegionName = regionName;
	}

	public String getRegionDescription() {
		return RegionDescription;
	}

	public void setRegionDescription(String regionDescription) {
		RegionDescription = regionDescription;
	}

	public int getWareHouseID() {
		return WareHouseID;
	}

	public void setWareHouseID(int wareHouseID) {
		WareHouseID = wareHouseID;
	}
	
	
}
