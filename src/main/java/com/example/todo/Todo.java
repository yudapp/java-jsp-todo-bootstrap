package com.example.todo;

public class Todo {
	
	String todoName;
	String description;
	
	public String getTodoName() {
		return todoName;
	}

	public void setTodoName(String todoName) {
		this.todoName = todoName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Todo(String todoName, String description) {
		this.todoName = todoName;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Todo [todoName=" + todoName + ", description=" + description + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((todoName == null) ? 0 : todoName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (todoName == null) {
			if (other.todoName != null)
				return false;
		} else if (!todoName.equals(other.todoName))
			return false;
		return true;
	}

}
