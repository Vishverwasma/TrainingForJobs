package com.project02.Models;


//mysql> create table Medicine_Quantity(
//	    -> quantity_id int primary key,
//	    -> medicine_id int ,
//	    -> medicine_quantity int);
//	Query OK, 0 rows affected (0.02 sec)
	
//mysql> ALTER TABLE Medicine_Quantity ADD FOREIGN KEY(medicine_id) REFERENCES
//MEDICINE(Medicine_id);
//Query OK, 0 rows affected (0.04 sec)
//Records: 0  Duplicates: 0  Warnings: 0

public class Medicine_Quantity {
	private int quantity_id;
	private int medicine_id;
	private double medicine_quantity;
	
	public Medicine_Quantity() {
		super();
	}
	public Medicine_Quantity(int quantity_id, int medicine_id, double medicine_quantity) {
		super();
		this.quantity_id = quantity_id;
		this.medicine_id = medicine_id;
		this.medicine_quantity = medicine_quantity;
	}
	public int getQuantity_id() {
		return quantity_id;
	}
	public void setQuantity_id(int quantity_id) {
		this.quantity_id = quantity_id;
	}
	public double getMedicine_quantity() {
		return medicine_quantity;
	}
	public void setMedicine_quantity(double medicine_quantity) {
		this.medicine_quantity = medicine_quantity;
	}
	public int getMedicine_id() {
		return medicine_id;
	}
	public void setMedicine_id(int medicine_id) {
		this.medicine_id = medicine_id;
	}
}
