package com.example.todo;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/list-todos")
public class ListTodoServlet extends HttpServlet {
	
	TodoService todoService = new TodoService();
	protected void doGet( HttpServletRequest request,  HttpServletResponse response)
			  throws  ServletException, IOException{
		List<Todo> todos = todoService.retrieveTodo();
		request.setAttribute("todos", todos);
		System.out.println(request.getAttribute("description"));
		request.getRequestDispatcher("/WEB-INF/views/list-todos.jsp").forward(request, response);
	}

	protected void doPost( HttpServletRequest request,  HttpServletResponse response)
			  throws  ServletException, IOException{
		response.sendRedirect("/add-todo");
	}
}
