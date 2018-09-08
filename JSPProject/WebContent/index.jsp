<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="Error.jsp" import="java.util.Date" 
     
    %>
    <%@ page import="java.util.List,java.util.ArrayList" %>
   <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome To Java Server pages</h1>
<!-- This is how comment is created(Output Comment) -->
<%--This is JSP Comment (Hidden Comment) --%>
<%!
//This is JSP Declaration
String company="Mphasis";
int add(int n1,int n2)
{
	return n1+n2;
}
%>
<%
//Scriplet Tag
int a = 20;
int b=20;
//int result=a/0;
int result=a+b;
//int// result=add(a,b);
//out.println("this is the resuslt "+result);

%>
This is the result <%=result%><!-- This is called Expression since using '=' sign .Can use any expression-->
<hr>
<jsp:useBean id="time" class="com.jsp.CurrentTime" scope="session"></jsp:useBean>
<jsp:getProperty property="hours" name="time"/>:
<jsp:getProperty property="minutes" name="time"/><!-- component centric tags -->
<hr>
<%
//response.sendRedirect("http://www.jaguar.com");
/* for(int i=1;i<=10;i++)
{ */
	//out.println("the values are"+i+"<br>");
	
%>
The Value of i is <%%><br>
<%%>
<hr>
<%@ include file="include.jsp" %>
<hr>
<%@ include file="incl.html" %>
<%
String name=(String) session.getAttribute("myname");
%>
Welcome <%=name%>
<hr>
<%
String company=(String) application.getAttribute("company");
%>
You are in <%=company %>
<hr>

Date : <%=new Date() %>



<hr>
<!-- Dynamic Include -->
<jsp:forward page="TestServlet">
<jsp:param value="Anubhav" name="name"/>
<jsp:param value="Bangalore" name="city"/>
</jsp:forward>
<hr>
<jsp:include page="incl.html">
<jsp:param value="Anubhav" name="user"/>
</jsp:include>
<hr>




</body>
</html>