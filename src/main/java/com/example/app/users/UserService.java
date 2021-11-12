package com.example.app.users;

import java.util.ArrayList;
import java.util.List;
 
 

public class UserService {
	
	private static List<User> users = new ArrayList<User>(); //persist data
	
	public void addUser(User user) {
 
		users.add(user);
 
	}
 
	public boolean isUserValid(User user) {
		if(users.contains(user)) {
			return true;
		}
		return false;
	}
 

}
