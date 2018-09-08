package com.SpringData.dao;

import java.util.List;

import com.SpringData.Employee;
import com.SpringData.exception.EmployeeException;

public interface EmployeeDao {
	
	public List<Employee> getAllEmployee() throws EmployeeException;
	public List<Employee> addEmployee(Employee emp) throws EmployeeException;

}
