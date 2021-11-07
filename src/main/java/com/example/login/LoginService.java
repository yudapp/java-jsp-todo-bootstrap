package com.example.login;

public class LoginService {
	
	 public boolean isUserValid(String username, String password) {
		 if(username.equals("username") && password.equals("password")) {
			 return true;
		 }
		 return false;
	 }
	

}
