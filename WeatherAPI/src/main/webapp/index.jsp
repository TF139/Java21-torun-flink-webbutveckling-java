<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>OpenWeather</title>
<link rel="stylesheet" href="Style.css">
</head>
<body>





	<!-- skapar ett formulär för att ta emot input -->
	<form action="OWservlet" method="get">
		City:<input type="text" name="city" /><br /> Country (Language code):<input
			type="text" name="country" /><br /> <input type="submit" value="go" />
	</form>

	<!-- omringar javakoden med en div-tag för att styla den senare -->
	<div class="earlySearch">
		<%
		//hämtar cookiesen och lagrar dem i en lista
		Cookie[] cookies = request.getCookies();

		//skapar ett if-statment som kollar om det finns ett värde i listan
		if (cookies != null) {
			out.print("Earlier searches:");
			//loopar igenom listan och skriver ut cookiename och cookievalue
			for (int i = 0; i < cookies.length; i++) {
				out.print("<br>" + cookies[i].getName().toUpperCase() + ": " + cookies[i].getValue());
			}

		}
		%>

	</div>




</body>
</html>