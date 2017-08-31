package com.challen.users.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.challen.users.dao.*;
import com.challen.users.action.*;

public class SelectInfoAction extends ActionSupport {
	private String username;
	private String type;
	public String selectInfo() throws Exception{
		UsersDAO dao = new UsersDAO();
		Users users = dao.selectInfo(username);
		ActionContext.getContext().getSession().put("users", users);
		if("allusers".equals(type))
			return INPUT;
		else if("users".equals(type))
			return SUCCESS;
		else
			return "find";
	}
	
	public void setUsername(String username){
		this.username = username;
	}
	public String getUsername(){
		return username;
	}
	
	public void setType(String type){
		this.type = type;
	}
	
	public String getType(){
		return type;
	}
}
