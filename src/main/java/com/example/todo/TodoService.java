package com.example.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
	
	private static List<Todo> todos = new ArrayList<Todo>();
	
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
