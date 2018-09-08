<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="user" class="com.jsp.UserBean" scope="session" ></jsp:useBean>
<table border="3">
<tr>
<td>UserName</td>
<td>
	<%-- <jsp:getProperty property="name" name="user"/> --%>
	${user.name}
</td>
</tr>
<tr>
<td>Address</td>
<td>
	<%-- <jsp:getProperty property="address" name="user"/> --%>
	${user.address}

</td>
</tr>
<tr>
<td>Gender</td>
<td>
	<%-- <jsp:getProperty property="gender" name="user"/> --%>
	${user.gender}
</td>
</tr>
<tr>
<td>Age</td>
<td>
	<%-- <jsp:getProperty property="age" name="user"/> --%>
	${user.age}
</td>
</tr>

</table>
</body>
</html>