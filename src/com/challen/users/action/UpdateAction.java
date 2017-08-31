package com.challen.users.action;

import com.opensymphony.xwork2.ActionSupport;
import com.challen.users.dao.UsersDAO;
import com.challen.users.action.*;

public class UpdateAction extends ActionSupport {
	private int id;
	private String username;
	private String password;
	private String name;
	private String nic;
	private String sex;
	private int age;
	private String email;
	private String phone;
	private String selfshow;
	private String tip;
	public String update() throws Exception{
		Users users = new Users();
		users.setId(id);
		users.setUsername(username);
		users.setPassword(password);
		users.setName(name);
		users.setNic(nic);
		users.setSex(sex);
		users.setAge(age);
		users.setEmail(email);
		users.setPhone(phone);
		users.setSelfShow(selfshow);
		UsersDAO dao = new UsersDAO();
		int i=dao.update(users);
		if(i>0){
			return SUCCESS;
		}else{
			this.setTip(this.getText("update.failed"));
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
