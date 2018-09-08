package com.jee;

import javax.annotation.ManagedBean;

@ManagedBean
public class GreetBean implements IGreet {
	public String greet()
	{
		return "W E L C O M E";
	}

}
