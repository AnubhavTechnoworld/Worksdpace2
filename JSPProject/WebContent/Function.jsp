<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="str" value="Hello World from mars to sun"/>
<br>
${str}
<br>
<c:set var="len" value="${fn:length(str)}"/>
Length:${len}
<br>
Index of :${fn:indexOf(str,"Wor") }
<br>
Contains :${fn:contains(str,"Wor") }
<br>
ends with :${fn:endsWith(str,"World11")}
<br>
uppercase :${fn:toUpperCase(str) }
<br>
<c:set var="words" value="${fn:split(str,' ') }"></c:set>
<c:forEach var="w" items="${words}">
${w}<br>

</c:forEach>
<br>
<br>
Substring :${fn:substring(str,6,9) }



</body>
</html>