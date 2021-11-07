package com.example.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.users.User;
import com.example.users.UserService;

@WebServlet(urlPatterns = "/register-user")
public class RegisterUserServlet extends HttpServlet {
	
	UserService userService = new UserService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/register-user.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String username= request.getParameter("username");
		String password = request.getParameter("password");
		userService.addUser(new User(username, password));
		 response.sendRedirect("/login");
	}
}
