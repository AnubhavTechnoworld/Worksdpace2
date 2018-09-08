<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Add Employee</h1>
<form method="post" action="saveEmployee">
<table>
	<tr>
		<td>Employee ID</td>
		<td><input type= "text" name="id"/></td>
		</tr>
		<tr>
		<td>Employee Name</td>
			<td><input type= "text" name="name"/></td></tr>
		<tr>
		<td>Gender</td>
		<td><input type="radio" name="gender" value="Male"/>Male
			<input type="radio" name="gender" value="Female"/>Female
			
		</td>
		</tr>
		<tr>
		<td>Age</td>
		<td><input type= "text" name="age"/></td></tr>
		<tr>
		<td>Salary</td>
		<td><input type= "text" name="salary"/></td>	
	</tr>
</table>

<input type="submit" value="Save"/>



</form>
 
</body>
</html>