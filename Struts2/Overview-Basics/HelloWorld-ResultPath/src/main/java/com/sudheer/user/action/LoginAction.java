package com.sudheer.user.action;

import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/User")
@ResultPath(value="/") // Defaults to WEB-INF/content/
@Result(name="success",location="pages/login.jsp")
public class LoginAction extends ActionSupport{

}