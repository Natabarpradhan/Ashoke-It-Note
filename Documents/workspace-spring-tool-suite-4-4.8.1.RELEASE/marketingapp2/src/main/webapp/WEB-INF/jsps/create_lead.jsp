<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Create Lead Registration</h2>
	<form action="registration" method="post">
		<pre>
      Name<input type="text" name="name"/>
    Mobile<input type="text" name="mobile"/>
     Email<input type="text" name="email"/>
     <input type="submit" value="save"/>

</pre>
	</form>
${msg}
</body>
</html>
