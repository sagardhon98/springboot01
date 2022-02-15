<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Registration</title>
</head>
<body>
	<h2>Employee Registration Form :</h2>
	<div style="border: 1px solid black; padding: 20px; width: 300px; border-radius: 10px">
		<f:form action="/savedEmp" method="get" modelAttribute="employee">
		First Name : <f:input type="text" path="fname" />
			<br>
			<br>
		Last Name : <f:input type="text" path="lname" />
			<br>
			<br>
		Email : <f:input type="email" path="email" />
			<br>
			<br>
		Date of birth : <f:input type="date" path="dob" />
			<br>
			<br> 
		Address : <f:textarea path="address" />
			<br>
			<br>
			<input type="submit">
			<input type="reset">
		</f:form>
	</div>
</body>
</html>