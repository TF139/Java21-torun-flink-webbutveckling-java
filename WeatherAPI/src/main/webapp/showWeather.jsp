<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="model.weatherBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>the weather</title>
<link rel="stylesheet" href="Style.css">
</head>
<body>
	<%
	//hämtar attributen 
	weatherBean wBean = (weatherBean) request.getAttribute("wBean");
	//skriver ut info med mina getters
	out.print(wBean.getCityStr() + ", " + wBean.getCountryStr() + "<br>");
	out.print("Date: " + wBean.getDateStr() + "<br>");
	out.print("Clouds: " + wBean.getCloudsStr() + "<br>");
	out.print("Temperature: " + wBean.getCelsius() + " C");
	%>
</body>
</html>