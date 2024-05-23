package com.employee.Models;

public class Employee {
	private int roll;
    private String name;
    private String department;
    private double salary;
        
	public Employee() {}
	
	public Employee(int roll, String name, String department, double salary) {
		this.roll = roll;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
