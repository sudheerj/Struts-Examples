package com.sudheer.user.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/User")
@ResultPath(value="/")
public class WelcomeUserAction extends ActionSupport{

	private String username;
	 
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Action(value="Welcome", results={
			@Result(name="success",location="pages/welcome_user.jsp")
	})
	public String execute() {

		return SUCCESS;

	}
}