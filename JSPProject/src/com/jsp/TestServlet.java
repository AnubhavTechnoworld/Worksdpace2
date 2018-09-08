package com.jsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	/*HttpSession s=request.getSession();
	s.setAttribute("myname", "Anubhav");
	response.getWriter().write("Done");;
	ServletContext ctx=getServletContext();
	ctx.setAttribute("company", "Mphasis");*/
	
	/*out.println("Name = "+request.getParameter("name"));
	out.println("<br>");
	out.println("City="+request.getParameter("city"));*/
	
	/*String company1="Mphasis";
	String company2="Microsoft";
	String company3="Apple";
	request.setAttribute("company", company1);
	HttpSession  session=request.getSession();
	session.setAttribute("company", company2);
	ServletContext ctx=request.getServletContext();
	ctx.setAttribute("company", company3);
	
	*/
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		List<UserBean> users=new ArrayList<UserBean>();
		users.add(new UserBean("Manu","Cochin","Male",22));
		users.add(new UserBean("Anubhav","Bangalore","Female",23));
		users.add(new UserBean("Garvita","Bangalore","Female",22));
		users.add(new UserBean("Sushrut","Mumbai","Male",23));
		request.setAttribute("users", users);
		
	RequestDispatcher rd=request.getRequestDispatcher("test.jsp");
	rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
