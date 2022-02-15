<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Book Form</title>
</head>
<body>
<h3>Add Book Form</h3>
	<div style="border: 1px solid black; padding: 10px; border-radius: 10px; width: 400px">
		<f:form action="/bookForm" method="get" modelAttribute="book">
Enter Book Name : <f:input type="text" path="book_name" placeholder="enter name"/>
			<br>
			<br>
Enter Author Name : <f:input type="text" path="author" placeholder="enter author"/>
			<br>
			<br>
Enter Price : <f:input type="String" path="price" placeholder="enter price"/>
			<br>
			<br>
			<button>Submit</button> <button>Reset</button>
		</f:form>
	</div>
</body>
</html>