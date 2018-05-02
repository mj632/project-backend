package com.dbo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="warehouse_product")
public class WarehouseToProduct {

	 @Column(name="Inventory")
		private int Inventory;
		  
		@Column(name="Max_Quantity")
		private int MaxQuantity;
		
		@Column(name="Product_ID")
		private int ProductID;
		
		@Column(name="WareHouse_ID")
		private int WareHouseID;

		public int getInventory() {
			return Inventory;
		}

		public void setInventory(int inventory) {
			Inventory = inventory;
		}

		public int getMaxQuantity() {
			return MaxQuantity;
		}

		public void setMaxQuantity(int maxQuantity) {
			MaxQuantity = maxQuantity;
		}

		public int getProductID() {
			return ProductID;
		}

		public void setProductID(int productID) {
			ProductID = productID;
		}

		public int getWareHouseID() {
			return WareHouseID;
		}

		public void setWareHouseID(int wareHouseID) {
			WareHouseID = wareHouseID;
		}

		
}
