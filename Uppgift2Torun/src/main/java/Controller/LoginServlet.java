package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.LoginBean;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getSession().getAttribute("user") != null) {

			RequestDispatcher rd = request.getRequestDispatcher("LoginSuccess.jsp");
			rd.forward(request, response);

		} else

		{
			response.sendRedirect("index.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userName = request.getParameter("username");
		String passWord = request.getParameter("password");

		LoginBean lb = new LoginBean();
		lb.setUserName(userName);
		lb.setPassword(passWord);

		if (lb.LoginCheck()) {
			HttpSession session = request.getSession();
			session.setAttribute("user", "Welcome!");
			session.setMaxInactiveInterval(3600);
			RequestDispatcher rd = request.getRequestDispatcher("LoginSuccess.jsp");
			rd.forward(request, response);

		} else {

			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);

		}
	}

}