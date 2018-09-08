package com.SpringData.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringData.Employee;
import com.SpringData.dao.EmployeeDao;
import com.SpringData.exception.EmployeeException;
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeDao employeeDao;
	@Override
	public List<Employee> getAllEmployee() throws EmployeeException {
		// TODO Auto-generated method stub
		return employeeDao.getAllEmployee();
	}
	@Override
	public List<Employee> addEmployee(Employee emp) throws EmployeeException {
		
		return employeeDao.addEmployee(emp);
	}

}
