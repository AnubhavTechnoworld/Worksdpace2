<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to home</h1>
	<sf:form action="process" method="post" modelAttribute="employee">
		<table>
			<tr>
					<td>
					<sf:label path="id">Employee ID</sf:label>
					</td>
					<td>
					<sf:input path="id"/>
					</td>
					<td>
					<sf:errors path="id" cssStyle="color:red"/>
					</td>			
			
			</tr>
				<tr>
					<td>
					<sf:label path="name">Employee Name</sf:label>
					</td>
					<td>
					<sf:input path="name"/>
					</td>
					<td>
					<sf:errors path="name" cssStyle="color:red"/>
					</td>			
			
			</tr>
				<tr>
					<td>
					<sf:label path="phone">Phone</sf:label>
					</td>
					<td>
					<sf:input path="phone"/>
					</td>
					<td>
					<sf:errors path="phone" cssStyle="color:red"/>
					</td>		
			
			</tr>
				<tr>
					<td>
					<sf:label path="age">Age</sf:label>
					</td>
					<td>
					<sf:input path="age"/>
					</td>
					<td>
					<sf:errors path="age" cssStyle="color:red"/>
					</td>			
			
			</tr>
				<tr>
					<td>
					<sf:label path="email">Email ID</sf:label>
					</td>
					<td>
					<sf:input path="email"/>
					</td>
					<td>
					<sf:errors path="email" cssStyle="color:red"/>
					</td>			
			
			</tr>		
		</table>
		<input type="submit" value="Validate"/>
	</sf:form>
	
</body>
</html>