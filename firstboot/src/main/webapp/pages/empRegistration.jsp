<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Registration Form</title>
</head>
<body>

<f:form action="empSave" method="post" modelAttribute="er">
Name : <f:input type="text" path="name"/><br><br>
Surname : <f:input type="text" path="surname"/><br><br>
Father's Name : <f:input type="text" path="father"/><br><br>
Mother's Name : <f:input type="text" path="mother"/><br><br>
Date of Birth : <f:input type="date" path="dob"/><br><br>
Married Status : <f:input type="text" path="status"/><br><br>
Nationality : <f:input type="text" path="nationality"/><br><br>
Blood Group : <f:input type="text" path="blood"/><br><br>
Address : <f:textarea rows="5" cols="10" path="address"/><br><br>
Phone Number : <f:input type="number" maxlength="10" path="mobile"/>
<input type="submit" value="Login"> <input type="reset" value="reset">
</f:form>

</body>
</html>