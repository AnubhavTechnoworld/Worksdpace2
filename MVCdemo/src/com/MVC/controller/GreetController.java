package com.MVC.controller;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("greet") //default is class name with first letter small
public class GreetController {
	@RequestMapping("/welcome")
	public ModelAndView sayHello() {
		ModelAndView mv = new ModelAndView("hello");
		mv.addObject("greeting","Welcome to Spring MVC Anotations");
		return mv;
	}
	
	@RequestMapping("/hi")
	public ModelAndView sayHi() {
		ModelAndView mv = new ModelAndView("hello");
		mv.addObject("greeting","Hey there,What's up?");
		return mv;
	}
	@RequestMapping
	public String showHome(Model model)
{	model.addAttribute("employee", new Employee());
	return "home";
}
	@RequestMapping("/process")
	public String validate(@Valid @ModelAttribute("employee")Employee emp,BindingResult result) {
		if(result.hasErrors()) {
			return "home";
		}
		else 
		return "success";
	}
}
