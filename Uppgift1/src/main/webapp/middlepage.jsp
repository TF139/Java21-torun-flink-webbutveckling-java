<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

String stuff=request.getParameter("stuff");
String fname = request.getParameter("fname");
if(stuff.equals("page1.jsp")){
	response.sendRedirect("page1.jsp" + "?username=" + fname);
}else if(stuff.equals("page2.jsp")){
	response.sendRedirect("page2.jsp" + "?username=" + fname);
}else if(stuff.equals("page3.jsp")){
	response.sendRedirect("page3.jsp" + "?username=" + fname);
}

%>

</body>
</html>