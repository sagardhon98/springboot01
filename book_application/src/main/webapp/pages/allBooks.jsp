<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="j"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Books</title>
</head>
<body>
<h3>All Book's Detail</h3>
<p><b><a href="/addBook">Add Book</a></b></p>
	<table border="1">
		<thead>
			<tr>
				<th>Id.</th>
				<th>Book Name</th>
				<th>Author</th>
				<th>Price</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<j:forEach items="${fetchAllBook}" var="allBook">
				<tr>
					<td>${allBook.id}</td>
					<td>${allBook.book_name}</td>
					<td>${allBook.author}</td>
					<td>${allBook.price}</td>
					<td> <a href="/update/${allBook.id}"> Edit </a> | <a href="/delete/${allBook.id}"> Delete </a></td>
				</tr>
			</j:forEach>
		</tbody>
	</table>
</body>
</html>