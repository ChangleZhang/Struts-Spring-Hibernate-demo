package com.challen.users.action;

import com.opensymphony.xwork2.ActionSupport;
import com.challen.users.dao.*;
import com.challen.users.action.*;
import com.opensymphony.xwork2.*;

public class LoginAction extends ActionSupport {
	private String username;
	private String password;
	private String tip;
	public String login() throws Exception{
		Users users = new Users();
		users.setUsername(username);
		users.setPassword(password);
		UsersDAO dao = new UsersDAO();
		boolean flag = dao.login(users);
		if(flag){
			ActionContext.getContext().getSession().put("username", username);
			return SUCCESS;
		}else{
			this.setTip(this.getText("login.failed"));
			return INPUT;
		}
	}
	
	public void setTip(String tip){
		this.tip = tip;
	}
	public String getTip(){
		return tip;
	}
}
