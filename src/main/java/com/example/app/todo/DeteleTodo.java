package com.example.app.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/app/delete-todo")
public class DeteleTodo extends HttpServlet{

	TodoService todoService = new TodoService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 
		String description = request.getParameter("description");
		String category =request.getParameter("category");
		todoService.deleteTodo(new Todo(description,category));
		response.sendRedirect("/app/list-todos");
	}
}
