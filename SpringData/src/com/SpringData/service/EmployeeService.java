package com.SpringData.service;

import java.util.List;

import com.SpringData.Employee;
import com.SpringData.exception.EmployeeException;

public interface EmployeeService {
	public List<Employee> getAllEmployee() throws EmployeeException;
	public List<Employee> addEmployee(Employee emp) throws EmployeeException;
}
