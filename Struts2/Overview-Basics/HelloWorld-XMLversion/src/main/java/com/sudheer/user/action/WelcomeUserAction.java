package com.sudheer.user.action;

public class WelcomeUserAction{

	private String username;
	 
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	// all struts logic goes here
	public String execute() {

		return "SUCCESS";

	}
}