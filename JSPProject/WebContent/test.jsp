<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html >
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <h3>Welcome ${requestScope.company}</h3>
<h3>Welcome ${sessionScope.company}</h3>
<h3>Welcome ${applicationScope.company}</h3> --%>
<%-- <h3>${param.fname  } ${param.lname }</h3>
 --%>
 <c:set value="Microsoft" var="company"/>
 <c:out value="${company}"></c:out><br>
 ${company}
 <c:remove var="company"/>
 After removing <br>
 Company Name ${company}
 
 <%-- <c:forEach var="i" begin="1" end="10" step="1">
 ${i}<br>
 </c:forEach> --%>
 
<%--  <table border="3">
 	<tr>
 		<th>UserName</th>
 		<th>Address</th>
 		<th>Gender</th>
 		<th>Age</th> 
 	</tr>
 	<c:forEach var="user" items="${users}">
 	
 		<tr>
 			<td>${user.name}</td>
 			<td>${user.address}</td>
 			<td>${user.gender}</td>
 			<td>${user.age}</td> 		
 		</tr>
 	
 	
 	</c:forEach>
 </table> --%>
 <hr>
 <c:set var="day" value="2"/>
 <c:choose>
 <c:when test="${day==1}">
 Monday
 </c:when>
 <c:when test="${day==2}">
 Tuesday</c:when>
 <c:otherwise>Invalid Day</c:otherwise>
 </c:choose>
 <hr>
 <c:if test="${day eq 1 }">
 Monday</c:if>
  <c:if test="${day eq 2 }">
 Tuesday</c:if>
 
 <c:forTokens items="Bangalore-Chennai-Mumbai-Hyderabad" delims="-" var="data"> 
 ${data}<br>
 
 </c:forTokens>
 <%-- <c:import url="Form.jsp">
 
 </c:import> --%>
 <c:redirect url="http://www.jaguar.com">
 <
 
 </c:redirect>
 
 
 </body>
</html>