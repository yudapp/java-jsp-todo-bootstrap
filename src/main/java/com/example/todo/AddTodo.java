package com.example.todo;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/add-todo")
public class AddTodo extends HttpServlet {
	
	TodoService todoService = new TodoService();
	 
	protected void doGet( HttpServletRequest request,  HttpServletResponse response)
			  throws  ServletException, IOException{
		request.getRequestDispatcher("/WEB-INF/views/add-todo.jsp").forward(request, response);
	}

	protected void doPost( HttpServletRequest request,  HttpServletResponse response)
			  throws  ServletException, IOException{
		String description = request.getParameter("description");
		String category = request.getParameter("category");
		 todoService.addTodo(new Todo(description, category));

		response.sendRedirect("/list-todos");
	}
}
