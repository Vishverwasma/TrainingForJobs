package com.project02.Models;


//mysql> create table Medicine(Medicine_id int primary key,
//	    -> Medicine_Name varchar(50),
//	    -> Medicine_category_id int,
//	    -> medicine_Rating int);
//	Query OK, 0 rows affected (0.05 sec)
	
//mysql> ALTER TABLE MEDICINE ADD FOREIGN KEY(Medicine_category_id) REFERENCES
//MEDICINE_CATEGORY(CATEGORY_ID);
//Query OK, 0 rows affected (0.05 sec)
//Records: 0  Duplicates: 0  Warnings: 0
	
public class Medicine {
	private int Medicine_id;
	private String Medicine_Name;
	private int Medicine_category_id;
	private int medicine_Rating;
	
	public Medicine() {
		super();
	}
	public Medicine(int medicine_id, String medicine_Name, int medicine_category_id, int medicine_Rating) {
		super();
		Medicine_id = medicine_id;
		Medicine_Name = medicine_Name;
		Medicine_category_id = medicine_category_id;
		this.medicine_Rating = medicine_Rating;
	}
	public int getMedicine_id() {
		return Medicine_id;
	}
	public void setMedicine_id(int medicine_id) {
		Medicine_id = medicine_id;
	}
	public String getMedicine_Name() {
		return Medicine_Name;
	}
	public void setMedicine_Name(String medicine_Name) {
		Medicine_Name = medicine_Name;
	}
	public int getMedicine_category_id() {
		return Medicine_category_id;
	}
	public void setMedicine_category_id(int medicine_category_id) {
		Medicine_category_id = medicine_category_id;
	}
	public int getMedicine_Rating() {
		return medicine_Rating;
	}
	public void setMedicine_Rating(int medicine_Rating) {
		this.medicine_Rating = medicine_Rating;
	}
	
}
