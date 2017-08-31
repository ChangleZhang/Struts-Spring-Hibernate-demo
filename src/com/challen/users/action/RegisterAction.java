package com.challen.users.action;

import com.opensymphony.xwork2.ActionSupport;
import com.challen.users.dao.UsersDAO;

public class RegisterAction extends ActionSupport {
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
	public void setTip(String tip){
		this.tip = tip;
	}
	public String register() throws Exception{
		UsersDAO dao = new UsersDAO();
		boolean flag = dao.findUsers(username);
		if(flag){
			this.setTip(this.getText("username.exist"));
			return INPUT;
		}
		Users users = new Users();
		users.setUsername(username);
		users.setPassword(password);
		users.setName(name);
		users.setSex(sex);
		users.setAge(age);
		users.setEmail(email);
		users.setPhone(phone);
		users.setSelfShow(selfshow);
		int i=dao.save(users);
		if(i>0){
			return SUCCESS;
		}else{
			this.setTip(this.getText("register.failed"));
			return INPUT;
		}
	}
}
