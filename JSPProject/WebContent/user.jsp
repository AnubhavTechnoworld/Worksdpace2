<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.jsp.UserBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <%
UserBean user=(UserBean)session.getAttribute("user");
%> --%>
<jsp:useBean id="user" class="com.jsp.UserBean" scope="session">
<jsp:setProperty property="name" name="user" value="Anubhav"/>
<jsp:setProperty property="address" name="user" value="Mumbai"/>
<jsp:setProperty property="gender" name="user" value="Male"/>
<jsp:setProperty property="age" name="user" value="22"/>
</jsp:useBean>
<%-- UserName :<%=user.getName()%><br>
Address :<%=user.getAddress() %><br>
Gender :<%=user.getGender() %><br>
Age :<%=user.getAge() %><br> --%>

UserName=<jsp:getProperty property="name" name="user"/>
Address=<jsp:getProperty property="address" name="user"/>
Gender=<jsp:getProperty property="gender" name="user"/>
Age=<jsp:getProperty property="age" name="user"/>
</body>
</html>