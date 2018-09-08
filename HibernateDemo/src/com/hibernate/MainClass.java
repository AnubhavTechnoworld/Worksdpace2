package com.hibernate;

import java.util.Date;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

public class MainClass {

	public static void main(String[] args) {
	/*	UserDetails user = new UserDetails();*/
		//user.setId(1001);
		/*user.setName("Sam");
		user.setPhone("95323464");
		user.setAge(21);*/
		/*SessionFactory fac=new Configuration().configure().buildSessionFactory();
		Session session = fac.openSession();*/
		/*UserDetails user2=(UserDetails) session.get(UserDetails.class,1004);
		System.out.println(user2);*/
		
		/*session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		fac.close();
		System.out.println("Data Saved");*/
		
		
	/*	
		Query query=session.createQuery("select name from UserDetails");
		List<String> employees = query.list();
		for (String user : employees) {
			System.out.println(user);
		}                
						*/			//OR
		/*TypedQuery<UserDetails> query = (TypedQuery<UserDetails>) session.createQuery("select name from UserDetails");
		//query.setParameter("a", 21);
		List<UserDetails> employees = query.getResultList();
		for (String user : employees ) {
			System.out.println(user);
		}*/
	 /*Query query =session.getNamedQuery("getAll");*/
		
		//query.setParameter("id", 1004);
		/*List<UserDetails> users = query.list();
		for (UserDetails user : users) {
			System.out.println(users);		
			*/
		/*Criteria cr=session.createCriteria(Employee.class);*/
		/*//cr.add(Restrictions.gt("salary", 70000D));
        //cr.add(Restrictions.gt("gender", "M"));
        //cr.add(Restrictions.between("salary", 45000D,80000D));
        //cr.add(Restrictions.like("name", "A%"));
		Employee emp= new Employee();
		emp.setName("Anubhav");
		emp.setAge(22);
		emp.setGender("M");
		emp.setSalary(70000);
		Example ex= Example.create(emp).excludeProperty("salary");
		cr.add(ex);
		*/
		
		//cr.setProjection(Projections.property("name"));
		//cr.setProjection(Projections.max("salary"));
		//cr.setProjection(Projections.rowCount());
		
		//double sal=(double)cr.uniqueResult();
		//long sal=(long)cr.uniqueResult();
		//System.out.println(sal);
		/*UserDetails user = new UserDetails();
		user.setId(2);
		user.setName("Test");
		user.setPhone("95323464");
		user.setAge(22);
		session.beginTransaction();
		session.save(user);
		//session.evict(user);//removes object from persistent state
		
		session.getTransaction().commit();
		session.close();
		session=fac.openSession();
		session.beginTransaction();
		session.update(user);
		user.setName("New Name Again1");
		
		session.getTransaction().commit();*/
		
		
		/*
		List<Employee> employees=cr.list();
		for (Employee employee : employees) {
			System.out.println(employee);
			
		}
		*/
		
		
		
		SessionFactory fac=new Configuration().configure().buildSessionFactory();
		Session session=fac.openSession();
		
		/*UserDetails user = new UserDetails();
		
		user.setName("Anubhav");
		user.setPhone("95748632");
		user.setAge(22);
		
		user.setDob(new Date());
		Address address= new Address();
		address.setStreet("Whitefiled");
		address.setCity("Bangalore");
		address.setState("karnataka");
		address.setPincode("5604555");
		
		Address address1= new Address();
		address1.setStreet("227 Baker Street");
		address1.setCity("Bangalore");
		address1.setState("karnataka");
		address1.setPincode("5604555");
		user.getAddresses().add(address1);
		user.getAddresses().add(address);
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		System.out.println("Data Saved...");
		*/
		UserDetails user=(UserDetails)session.get(UserDetails.class, 1029);
		session.close();
		session=fac.openSession();
		UserDetails user1=(UserDetails)session.get(UserDetails.class, 1029);
		/*System.out.println(user.getName());
		System.out.println(user.getPhone());
		System.out.println(user.getAddresses());
		for (Address add : user.getAddresses()) {
			System.out.println(add);
			}
			
		session.close();
		System.out.println("After Closing the Session");
		System.out.println(user.getName());
		System.out.println(user.getPhone());
		List<Address> add= user.getAddresses();
		
		for (Address address :add ){
			System.out.println(address);
			}*/
		System.out.println(user1.getName());
		
		
		
		
		
		
		}
		/*UserDetails u=(UserDetails) query.uniqueResult();
		System.out.println(u);*/
	}


