package com.project02.Models;


//mysql> create table Medicine_Category(
//	    -> category_Id int primary key,
//	    -> Category_Name varchar(50)
//	    -> );
//	Query OK, 0 rows affected (0.02 sec)

public class Medicine_Category {
	private int category_Id;
	private String Category_Name;
	public Medicine_Category() {
		super();
	}
	public Medicine_Category(int category_Id, String category_Name) {
		super();
		this.category_Id = category_Id;
		Category_Name = category_Name;
	}
	public int getCategory_Id() {
		return category_Id;
	}
	public void setCategory_Id(int category_Id) {
		this.category_Id = category_Id;
	}
	public String getCategory_Name() {
		return Category_Name;
	}
	public void setCategory_Name(String category_Name) {
		Category_Name = category_Name;
	}
	
}
