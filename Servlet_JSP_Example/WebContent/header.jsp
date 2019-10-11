<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Random"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Witchcraft</title>
</head>
<body>
	<%! Random randNo = new Random(); %>
	Today's lucky number is <% out.print(1 + randNo.nextInt(10)); %>!
	<br><br>
</body>
</html>