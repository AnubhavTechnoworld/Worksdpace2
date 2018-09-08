package com.jsp;

import java.util.Calendar;



public class CurrentTime {
	private int hours;
	private int minutes;
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	public CurrentTime() {
		Calendar d=Calendar.getInstance();
		this.hours=d.get(Calendar.HOUR_OF_DAY);
		this.minutes=d.get(Calendar.MINUTE);	
	
	}
	

}
