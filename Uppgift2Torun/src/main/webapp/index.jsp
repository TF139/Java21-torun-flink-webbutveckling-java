<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%
if (session.getAttribute("user") != null) {
	RequestDispatcher rd = request.getRequestDispatcher("LoginServlet");
	rd.forward(request, response);
}
%>     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="<%=request.getContextPath()%>/LoginServlet" method=post>

Username:<input type="text" name="username">
<br>
Password:<input type="password" name="password">
<br>
<input type="submit" value="submit">

</form>

</body>
</html>