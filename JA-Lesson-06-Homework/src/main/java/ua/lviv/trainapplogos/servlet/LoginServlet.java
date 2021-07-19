package ua.lviv.trainapplogos.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.lviv.trainapplogos.domain.UserAccount;
import ua.lviv.trainapplogos.service.UserAccountService;
import ua.lviv.trainapplogos.service.impl.UserAccountServiceImpl;

@WebServlet("/login") //set end-point
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserAccountService userService = UserAccountServiceImpl.getUserService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher redirect;
		
		redirect = request.getRequestDispatcher("login.jsp");
		redirect.forward(request, response); // redirect to login.jsp on get-request
	} 

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("login");
		String password = request.getParameter("password");
		
		UserAccount user = userService.getUserByEmail(email);
		
		RequestDispatcher redirect;
		
		if (user == null) {
			redirect = request.getRequestDispatcher("login.jsp");
			redirect.forward(request, response);
		} else {
			if (user.getPassword().equals(password)) {
				request.setAttribute("userEmail", email);
				request.setAttribute("userFirstName", user.getFirstName());
				redirect = request.getRequestDispatcher("cabinet.jsp");
				redirect.forward(request, response);
			} else {
				redirect = request.getRequestDispatcher("login.jsp");
				redirect.forward(request, response);
			}
		}
	}

}

