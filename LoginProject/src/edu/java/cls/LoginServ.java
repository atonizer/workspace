package edu.java.cls;

import java.util.HashMap;

import edu.java.usr.User;

public class LoginServ {
	
	static HashMap<String, String> users = new HashMap();
	
	public LoginServ(){
		users.put("jhn", "John");
		users.put("doe", "Doe");
	}
	
	public boolean authenticate(String userID, String password){
		if(password == null || password.trim()== ""){
			return false;
		}
		return true;
	}
	
	public static User getUserId(String userID){
		User user = new User();
		user.setUserName(users.get(userID));
		user.setUserID(userID);
		
		return user;
	}
}
