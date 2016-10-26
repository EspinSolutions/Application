package com.espinsolutions.application;

public class GameAPI {
	
	boolean hasUsername;
	
	static String username;
	
	public String getUsername() {
		
		if (username != null) {
			
			hasUsername = true;
			
		} else {
			
			hasUsername = false;
			username = "Error";
			
		}
		
		return username;
		
	}
	
}