<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="include.jsp"/>

<%
String fname = request.getParameter("username");
out.print("Welcome to page 3 " + fname + "!");
%>

<jsp:include page="include.jsp"/>

</body>
</html>