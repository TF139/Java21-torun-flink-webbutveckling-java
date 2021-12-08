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

<form action="middlepage.jsp">
<input type ="text" name = "fname">
<select name = "stuff">
<option value = "page1.jsp">Go to page 1</option>
<option value = "page2.jsp">Go to page 2</option>
<option value = "page3.jsp">Go to page 3</option>
</select>
<input type = "submit" value = "Submit">
</form>

<jsp:include page="include.jsp"/>

</body>
</html>