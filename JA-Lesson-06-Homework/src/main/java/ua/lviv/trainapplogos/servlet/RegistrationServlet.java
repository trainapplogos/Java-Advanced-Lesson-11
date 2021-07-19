package ua.lviv.trainapplogos.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.lviv.trainapplogos.domain.UserAccount;
import ua.lviv.trainapplogos.domain.UserRole;
import ua.lviv.trainapplogos.service.UserAccountService;
import ua.lviv.trainapplogos.service.impl.UserAccountServiceImpl;

public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
//	UserService userService = UserService.getUserService();
	private UserAccountService userService = UserAccountServiceImpl.getUserService();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String password = request.getParameter("password");  
		
		if (!email.isEmpty() && !firstName.isEmpty() && !lastName.isEmpty() && !password.isEmpty()) {
			userService.create(new UserAccount(email, firstName, lastName, password, UserRole.USER.toString()));
		}
		
//		request.setAttribute("userEmail", email); //set email as attribute of session
//		request.setAttribute("userFirstName", firstName);
		request.getRequestDispatcher("cabinet.jsp").forward(request, response); //redirect to cabinet page
	}
}
