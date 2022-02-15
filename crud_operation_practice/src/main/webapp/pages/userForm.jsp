<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>User Registration Form</h3>
	<div style="border: 1px solid black; border-radius: 10px; width: 300px; padding: 10px">
		<f:form action="/insertUser" method="get" modelAttribute="user">
			Enter Name : <f:input type="text" path="fname" placeholder="Enter Name"/><br><br>
			Enter Email : <f:input type="email" path="email" placeholder="Enter Email"/><br><br>
			Enter Address : <f:input type="text" path="address" placeholder="Enter Address"/><br><br>
			<button type="submit">Submit</button> <button type="reset">Reset</button>
		</f:form>
	</div>
</body>
</html>