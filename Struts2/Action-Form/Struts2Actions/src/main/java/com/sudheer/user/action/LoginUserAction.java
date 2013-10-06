package com.sudheer.user.action;
 
import com.opensymphony.xwork2.ActionSupport;
 
public class LoginUserAction extends ActionSupport{
 
	/**
	 * 
	 */
	private static final long serialVersionUID = -2312160368642167337L;
	private String username;
	private String password;
 
	public String getPassword() {
		return password;
	}
 
	public void setPassword(String password) {
		this.password = password;
	}
 
	public String getUsername() {
		return username;
	}
 
	public void setUsername(String username) {
		this.username = username;
	}
 
	//business logic
	public String execute() {
 
		return "SUCCESS";
 
	}
 
        //simple validation
	public void validate(){
		if("".equals(getUsername())){
			addFieldError("username", getText("username.required"));
		}
		if("".equals(getPassword())){
			addFieldError("password", getText("password.required"));
		}
	}
}