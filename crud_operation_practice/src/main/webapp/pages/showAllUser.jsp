<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Daetail's</title>
</head>
<body>
<h3>All User Detail</h3>
	<div>
		<table border="1px">
			<thead>
				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>Email</th>
					<th>Address</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<f:forEach items="${fetchAllUser}" var="user">
					<tr>
						<td>${user.id}</td>
						<td>${user.fname}</td>
						<td>${user.email}</td>
						<td>${user.address}</td>
						<td>Edit / <a href="/delete/${user.id}">Delete</a></td>
					</tr>
				</f:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>