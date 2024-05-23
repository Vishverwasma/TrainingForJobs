package com.employee.Dao;

import java.sql.*;
import java.util.*;

import com.employee.Models.Employee;
import com.employee.Utility.DBUtil;

public class EmployeeDao {
	
	public void addEmployee(Employee employee)throws SQLException {
		String sql = "INSERT INTO EMPLOYEE_DB (ROLL , NAME , DEPARTMENT , SALARY) VALUES (? , ? , ? , ?)";
		try(Connection conn = DBUtil.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql)){
			stmt.setInt(1, employee.getRoll());			
			stmt.setString(2, employee.getName());
            stmt.setString(3, employee.getDepartment());
            stmt.setDouble(4, employee.getSalary());
            stmt.executeUpdate();
		}
	}
	
	public List<Employee> getAllEmployees() throws SQLException{
		List<Employee> employees = new ArrayList<>();
        String sql = "SELECT * FROM employee_db";

        try (Connection conn = DBUtil.getConnection();
        	Statement stmt = conn.createStatement();
        	ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Employee employee = new Employee();
                employee.setRoll(rs.getInt("roll"));
                employee.setName(rs.getString("name"));
                employee.setDepartment(rs.getString("department"));
                employee.setSalary(rs.getDouble("salary"));
                employees.add(employee);
            }
	      }
        return employees;
    }

	public Employee getEmployeeByRoll(int roll)  throws SQLException{
		Employee employee = null;
        String sql = "SELECT * FROM employee_db where roll=?";

        try (Connection conn = DBUtil.getConnection();
        	PreparedStatement stmt = conn.prepareStatement(sql)) {
        	stmt.setInt(1, roll);
        	ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                employee = new Employee();
                employee.setRoll(rs.getInt("roll"));
                employee.setName(rs.getString("name"));
                employee.setDepartment(rs.getString("department"));
                employee.setSalary(rs.getDouble("salary"));
            }
	      }
        return employee;
	}
	
	public void updateEmployee(Employee employee) throws SQLException {
        String sql = "UPDATE employee_db SET name = ?, department = ?, salary = ? WHERE roll = ?";

        try (Connection conn = DBUtil.getConnection(); 
        	PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, employee.getName());
            stmt.setString(2, employee.getDepartment());
            stmt.setDouble(3, employee.getSalary());
            stmt.setInt(4, employee.getRoll());
            stmt.executeUpdate();
        }
    }
	
	
    public void deleteEmployee(int roll) throws SQLException {
        String sql = "DELETE FROM employee_db WHERE roll = ?";

        try (Connection conn = DBUtil.getConnection(); 
        	PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, roll);
            stmt.executeUpdate();
        }
    }
}
