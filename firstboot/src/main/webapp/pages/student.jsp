<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Student Login Form</h1>
<form action="stuSave" method="post" modelAttribute="s1">
<table border="1">
<tr>
<td>Name : <input type="text" name="name"/></td>
</tr>
<tr>
<td>Email : <input type="email" name="email"/></td>
</tr>
<tr>
<td>
Gender : <input type="radio" name="gender" value="male">Male
		 <input type="radio" name="gender" value="female">Female
</td>
</tr>
<tr>
<td>
Language : <input type="checkbox" name="language" value="marathi">Marathi
		   <input type="checkbox" name="language" value="hindi">Hindi
		   <input type="checkbox" name="language" value="english">English
</td>
</tr>
<tr>
<td>Date of Birth : <input type="date" name="dob"><br><br></td>
</tr>
<tr>
<td align="center"><input type="submit" value="Login"> <input type="reset" value="Reset"></td>
</tr>
</table>
 
</form>
</body>
</html>