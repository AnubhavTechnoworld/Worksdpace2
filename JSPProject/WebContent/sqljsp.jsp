<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri ="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
    <%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="db" driver="oracle.jdbc.driver.OracleDriver" 
url="jdbc:oracle:thin:@localhost:1521:XE" user="hr" password="hr"/>
<sql:query var="rs" dataSource="${db}">select * from employee1</sql:query>
<%-- <table border="3">
<tr>
	<th>EmployeeId</th>
	<th>First Name</th>
	<th>Last Name</th>
	<th>User Name</th>
	<th>Password</th>
	<th>Gender</th>
</tr>

<c:forEach items="${rs.rows}"  var="emp">
<tr>
	<td>${emp.empid}</td>
	<td>${emp.firstname}</td>
	<td>${emp.lastname}</td>
	<td>${emp.username}</td>
	<td>${emp.password}</td>
	<td>${emp.gender}</td>
</tr>


</c:forEach>
</table> --%>

<sql:update var="result" dataSource="${db}">insert into emp values(${param.id},'${param.name }')</sql:update>
Done
</body>
</html>