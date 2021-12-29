package controller;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.GettheWeather;
import model.weatherBean;

/**
 * Servlet implementation class OWservlet
 */
@WebServlet("/OWservlet")
public class OWservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public OWservlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		// hämtar parametrar från index-form och lagrar i strängar
		String cityStr = request.getParameter("city");
		String countryStr = request.getParameter("country");

		// instanserar klassen weatherBean och matar in värden i constructor
		weatherBean wBean = new weatherBean(cityStr, countryStr);
		GettheWeather.getWeather(wBean);

		// skapar cookies med namn, value och sätter en livslängd. Slutligen lägger jag
		// till cookien
		Cookie cookieCity = new Cookie("city", cityStr);
		cookieCity.setMaxAge(60 * 60 * 24 * 365);
		response.addCookie(cookieCity);

		Cookie cookieCountry = new Cookie("country", countryStr);
		cookieCountry.setMaxAge(60 * 60 * 24 * 365);
		response.addCookie(cookieCountry);

		Cookie cookieTemp = new Cookie("temp", String.valueOf(wBean.getCelsius()));
		cookieTemp.setMaxAge(60 * 60 * 24 * 365);
		response.addCookie(cookieTemp);

		Cookie cookieCloud = new Cookie("clouds", URLEncoder.encode(wBean.getCloudsStr(), "UTF-8"));
		cookieCloud.setMaxAge(60 * 60 * 24 * 365);
		response.addCookie(cookieCloud);

		Cookie cookieDate = new Cookie("date", wBean.getDateStr());
		cookieDate.setMaxAge(60 * 60 * 24 * 365);
		response.addCookie(cookieDate);

		// skapar ett attribut med namnet och värdet wBean
		request.setAttribute("wBean", wBean);

		// redirektar till showWeather
		RequestDispatcher rd = request.getRequestDispatcher("showWeather.jsp");
		rd.forward(request, response);

	}

}