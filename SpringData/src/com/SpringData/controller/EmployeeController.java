package com.SpringData.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.SpringData.Employee;
import com.SpringData.exception.EmployeeException;
import com.SpringData.service.EmployeeService;



@Controller
public class EmployeeController {
		@Autowired
	EmployeeService employeeService;
	@RequestMapping("/")
		public ModelAndView showEmployees() {
		try {
			List<Employee> employees= employeeService.getAllEmployee();
			ModelAndView mv = new ModelAndView("index","employees",employees);
			return mv;
		} catch (EmployeeException e) {
			ModelAndView mv = new ModelAndView("error");
			mv.addObject("error",e);
			return mv;
		}
			
		}
	@RequestMapping(value="/addEmployee",method=RequestMethod.POST)
	public String addEmployee() {
		return "add";
	}
		@RequestMapping(value="/saveEmployee",method=RequestMethod.POST)
		public ModelAndView saveEmployee(@ModelAttribute("employee")Employee emp) {
			try {
				List<Employee> employees= employeeService.addEmployee(emp);
				ModelAndView mv = new ModelAndView("index","employees",employees);
				return mv;
			} catch (EmployeeException e) {
				ModelAndView mv = new ModelAndView("error");
				mv.addObject("error",e);
				return mv;
			}
			
		
	}
	}


