<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>update lead</h2>
	<form action="editReg" method="post">
		<pre>
		<input type="hidden" name="id" value="${lead.id}"/>
      Name<input type="text" name="name" value="${lead.name}"/>
    Mobile<input type="text" name="mobile" value="${lead.mobile}"/>
     Email<input type="text" name="email" value="${lead.email}"/>
     <input type="submit" value="update"/>

</pre>
	</form>
${msg}
</body>
</html>