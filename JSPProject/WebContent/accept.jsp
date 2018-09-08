<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="user" class="com.jsp.UserBean" scope="session"></jsp:useBean>


<%-- <jsp:setProperty property="name" name="user" param="name"/>
<jsp:setProperty property="address" name="user" param="address"/>
<jsp:setProperty property="gender" name="user" param="gender"/>
<jsp:setProperty property="age" name="user" param="age"/> --%>
<jsp:setProperty property="*" name="user"/>
<!-- Since all the property name and field name are same -->
<jsp:forward page="dispaly.jsp"></jsp:forward>

</body>
</html>