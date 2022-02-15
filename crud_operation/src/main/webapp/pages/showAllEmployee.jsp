<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="j"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Employee's</title>
</head>
<body>
	<h3>All Employee Detail's</h3>
	<table border="1">
		<thead>
			<tr>
				<th>Sr. No</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email</th>
				<th>Date of Birth</th>
				<th>Address</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<j:forEach items="${allEmp}" var="emp">
				<tr>
					<td>${emp.id}</td>
					<td>${emp.fname}</td>
					<td>${emp.lname}</td>
					<td>${emp.email}</td>
					<td>${emp.dob}</td>
					<td>${emp.address}</td>
					<td>Edit / <a href="/delete/${emp.id}">Delete</a></td>
				</tr>
			</j:forEach>
		</tbody>
	</table>
</body>
</html>