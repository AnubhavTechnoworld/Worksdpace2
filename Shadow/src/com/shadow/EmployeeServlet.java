package com.shadow;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class EmployeeServlet extends HttpServlet {

@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
resp.setContentType("text/html");
PrintWriter out=resp.getWriter();
String btnValue=req.getParameter("btn");
if(btnValue.equals("Register")) {
	resp.sendRedirect("index.html");//client side redirect
}
else if(btnValue.equals("Display")){
	try {
		List<Employee> employees=getAllEmployees();
		out.println("<html><head></head><body>");
		out.println("<table border='1'>");
		out.println("<tr>");
		out.println("<th>Employee ID</th>");
		out.println("<th>First Name</th>");
		out.println("<th>Last Name</th>");
		out.println("<th>Username</th>");
		out.println("<th>Password</th>");
		out.println("<th>Gender</th>");
		out.println("<th>Skills</th>");
		out.println("<th>City</th>");
		out.println("<th>Age</th>");
		out.println("</tr>");
		for (Employee employee : employees) {
			out.println("<tr>");
			out.println("<td>"+employee.getId());
			out.println("<td>"+employee.getFirstname()+"</td>");
			out.println("<td>"+employee.getLastName()+"</td>");
			out.println("<td>"+employee.getUsername()+"</td>");
			out.println("<td>"+employee.getPassword()+"</td>");
			out.println("<td>"+employee.getGender()+"</td>");
			out.println("<td>"+employee.getSkills()+"</td>");
			out.println("<td>"+employee.getCity()+"</td>");
			out.println("<td>"+employee.getAge()+"</td>");
			out.println("</tr>");			
		}
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
	} catch (EmployeeException e) {
		req.setAttribute("exception", e);
		RequestDispatcher rd=req.getRequestDispatcher("error");
		rd.forward(req, resp);
	}
	
}
else if(btnValue.equals("Add")) {
Employee emp=new Employee();
String fn=req.getParameter("fname");
String ln=req.getParameter("lname");
String un=req.getParameter("uname");
String pass=req.getParameter("pwd");
String gen=req.getParameter("gender");
String[] skillval=req.getParameterValues("skills");
StringBuilder skills=new StringBuilder();
for(String skill : skillval) {
skills.append(skill+", ");
}
String skill=skills.toString();
String city=req.getParameter("city");
int age=Integer.parseInt(req.getParameter("age"));
emp.setFirstname(fn);
emp.setLastName(ln);
emp.setUsername(un);
emp.setPassword(pass);
emp.setGender(gen);
emp.setSkills(skill);
emp.setCity(city);
emp.setAge(age);
try {
	int result=addEmployee(emp);
	ServletContext ctx=getServletContext();
	String path=ctx.getRealPath("/WEB-INF/log4j.properties");
	PropertyConfigurator.configure(path);
	Logger logger=Logger.getLogger(EmployeeServlet.class);
	//Logger log=Logger.getLogger("MyLogger");
	logger.debug("this is a debug message.Employee Saved");
	logger.info("This is info message");
	logger.warn("This is warning message");
	logger.error("This is error message");
	logger.fatal("This is fatal message");
	
	req.setAttribute("empId", result);//adds and stores attribute to existing request
	//RequestDispatcher dispatcher=req.getRequestDispatcher("success");
	RequestDispatcher dispatcher=ctx.getRequestDispatcher("/success");
	dispatcher.forward(req, resp);
} catch (EmployeeException e) {
	req.setAttribute("exception", e);//adds and stores attribute to existing request
	RequestDispatcher dispatcher=req.getRequestDispatcher("error");//Server side redirect
	dispatcher.forward(req, resp);
}
}
}

@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
doGet(req, resp);
}

private int addEmployee(Employee emp) throws EmployeeException {
String url="jdbc:oracle:thin:@localhost:1521:XE";
int ret;
try {
Class.forName("oracle.jdbc.driver.OracleDriver");
} catch (ClassNotFoundException e) {
throw new EmployeeException(e.getMessage());
}
try(Connection con=DriverManager.getConnection(url,"hr","hr");
PreparedStatement stat=
con.prepareStatement
("insert into employee1 values(empseq.nextval,?,?,?,?,?,?,?,?)")) {
stat.setString(1, emp.getFirstname());
stat.setString(2, emp.getLastName());
stat.setString(3, emp.getUsername());
stat.setString(4, emp.getPassword());
stat.setString(5, emp.getGender());
stat.setString(6, emp.getSkills());
stat.setString(7, emp.getCity());
stat.setInt(8, emp.getAge());
ret=stat.executeUpdate();
if(ret==1) {
	Statement s1=con.createStatement();
	ResultSet rs=s1.executeQuery("select empseq.currval from dual");
	rs.next();
	ret=rs.getInt(1);
}
} catch (SQLException e) {
throw new EmployeeException(e.getMessage());
}
return ret;
}
private List<Employee>getAllEmployees() throws EmployeeException{
	List<Employee> employees=new ArrayList<Employee>();
	
	String url="jdbc:oracle:thin:@localhost:1521:XE";
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
	} catch (ClassNotFoundException e) {
		throw new EmployeeException(e.getMessage());
	}
	try(Connection con=DriverManager.getConnection(url, "hr", "hr");
			
			Statement stat=con.createStatement();){
		ResultSet rs=stat.executeQuery("select * from employee1");
		while(rs.next())
		{
			Employee emp=new Employee();
			emp.setId(rs.getInt(1));
			emp.setFirstname(rs.getString(2));
			emp.setLastName(rs.getString(3));
			emp.setUsername(rs.getString(4));
			emp.setPassword(rs.getString(5));
			emp.setGender(rs.getString(6));
			emp.setSkills(rs.getString(7));
			emp.setCity(rs.getString(8));
			emp.setAge(rs.getInt(9));
			employees.add(emp);
		}
	}catch(SQLException e)
	{
		throw new EmployeeException(e.getMessage());
	}
	
	return employees;
}

}

