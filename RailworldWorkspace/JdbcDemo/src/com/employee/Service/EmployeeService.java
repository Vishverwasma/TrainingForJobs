package com.employee.Service;

import java.sql.SQLException;
import java.util.List;

import com.employee.Dao.EmployeeDao;
import com.employee.Models.Employee;

public class EmployeeService {
    private EmployeeDao employeeDAO;

    public EmployeeService() {
        employeeDAO = new EmployeeDao();
    }

    public void addEmployee(Employee employee) throws SQLException {
        employeeDAO.addEmployee(employee);
    }

    public List<Employee> getAllEmployees() throws SQLException {
        return employeeDAO.getAllEmployees();
    }
    
    public Employee getEmployeeByRoll(int roll) throws SQLException{
    	return employeeDAO.getEmployeeByRoll(roll);
    }

    public void updateEmployee(Employee employee) throws SQLException {
        employeeDAO.updateEmployee(employee);
    }

    public void deleteEmployee(int id) throws SQLException {
        employeeDAO.deleteEmployee(id);
    }
}
