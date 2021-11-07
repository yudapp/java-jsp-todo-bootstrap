package com.example.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/login")
public class LoginServlet extends HttpServlet{
	
	LoginService loginService = new LoginService();
	
	  protected void doGet( HttpServletRequest request,  HttpServletResponse response)
			  throws  ServletException, IOException{
		  request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		  
	  }

	  protected void doPost( HttpServletRequest request,  HttpServletResponse response)
			  throws  ServletException, IOException{
 
		  System.out.println(request.getParameter("username")+"<"+request.getParameter("password"));
		 if(loginService.isUserValid(request.getParameter("username"), request.getParameter("password"))) {
			 request.getSession().setAttribute("username", "username");
			 response.sendRedirect("/list-todos");
		 } else {
			 request.setAttribute("errorMessage", "Invalid Credentials");
			 request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
			 System.out.println("B");
		 }
		 
	  }
	

}
