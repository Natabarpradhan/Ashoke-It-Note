<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Lead</title>
</head>
<body>
<h2>Lead all find</h2>
<table>
<tr>
<th>Name</th>
<th>Email</th>
<th>Mobile</th>

</tr>
 <c:forEach var="lead" items="${leads}">
 <tr>
 <td>${lead.name}</td>
 <td>${lead.email}</td>
 <td>${lead.mobile}</td>

  </tr>
 </c:forEach>
</table>
</body>
</html>