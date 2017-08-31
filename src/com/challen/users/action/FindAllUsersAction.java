package com.challen.users.action;

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import com.challen.users.dao.*;
import com.opensymphony.xwork2.*;

public class FindAllUsersAction extends ActionSupport {
	private String type;
	public String findAllUsers() throws Exception{
		UsersDAO dao = new UsersDAO();
		List list = dao.findAllUsers();
		ActionContext.getContext().put("list", list);
		if("admin".equals(type)){
			return this.INPUT;
		}else{
			return this.SUCCESS;
		}
	}
	public void setType(String type){
		this.type = type;
	}
	public String getType(){
		return type;
	}
}
