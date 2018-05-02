package com.dbo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class Category {
		@Id   
		@GeneratedValue(strategy= GenerationType.AUTO)
		private long CategoryId;
		
		@Column(name="Category_Name")
		private String CategoryName;
		
		@Column(name="Category_Description")
		private String CategoryDesc;

		public long getCategoryId() {
			return CategoryId;
		}

		public void setCategoryId(long categoryId) {
			CategoryId = categoryId;
		}

		public String getCategoryName() {
			return CategoryName;
		}

		public void setCategoryName(String categoryName) {
			CategoryName = categoryName;
		}

		public String getCategoryDesc() {
			return CategoryDesc;
		}

		public void setCategoryDesc(String categoryDesc) {
			CategoryDesc = categoryDesc;
		}
		
		
		

}