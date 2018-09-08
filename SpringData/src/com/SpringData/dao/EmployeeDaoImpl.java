package com.SpringData.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.SpringData.Employee;
import com.SpringData.exception.EmployeeException;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public List<Employee> getAllEmployee() throws EmployeeException {
		try {
			Session session=sessionFactory.openSession();
			Query query = session.createQuery("from Employee");
			List<Employee> employees = query.list();
			System.out.println(employees.size()+"====");
			session.close();
			return employees;		
			
		}
		catch(Exception ex)
		{
			throw new EmployeeException(ex.getMessage());
		}
		
	}
	@Override
	public List<Employee> addEmployee(Employee emp) throws EmployeeException {
		try {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.persist(emp);
		session.getTransaction().commit();
		return getAllEmployee();
	}
		catch(Exception ex)
		{
			throw new EmployeeException(ex.getMessage());
		}
	}

}
