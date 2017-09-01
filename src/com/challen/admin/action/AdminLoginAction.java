package com.challen.admin.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.challen.admin.dao.Admin;
import com.challen.admin.dao.AdminDAO;

public class AdminLoginAction extends ActionSupport {
	private String username;
	private String password;
	private String tip;
	public String adminLogin() throws Exception{
		Admin admin = new Admin();
		admin.setName(username);
		admin.setPassWord(password);
		AdminDAO dao = new AdminDAO();
		boolean flag=dao.login(admin);
		if(flag){
			ActionContext.getContext().getSession().put("qx", admin.getQx());
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
