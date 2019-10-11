<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.util.Random" %>
    <%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Witchcraft</title>
</head>
<body>
<%
	pageContext.setAttribute("name", "Omran", PageContext.SESSION_SCOPE);

	try
	{
		int error = 1/0;
	}
	catch(Exception e)
	{
		out.println("Error " + e.getMessage());
	}
%>
</body>
</html>