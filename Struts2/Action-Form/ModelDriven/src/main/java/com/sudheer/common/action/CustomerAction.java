package com.sudheer.common.action;

import com.sudheer.common.Customer;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
 
public class CustomerAction extends ActionSupport 
	implements ModelDriven{

	Customer customer = new Customer();
	
	public String execute() throws Exception {
	
		return SUCCESS;
		
	}

	public Object getModel() {
		
		return customer;
		
	}
}