package com.example.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
	
	private static List<Todo> todos = new ArrayList<Todo>();
	
	static {
		todos.add(new Todo("Web app dev", "Dev"));
		todos.add(new Todo("Spring MVC", "Web"));
		todos.add(new Todo("Spring rest", "Test"));
	}
	
	//add Todo 
	
	public void addTodo(Todo todo) {
		todos.add(todo);
	}
	
	//retrieve Todo
	
	public List<Todo> retrieveTodo(){
		return todos;
	}
	
	
	//delete Todos
	public void deleteTodo(Todo todo) {
		todos.remove(todo);
	}

}
