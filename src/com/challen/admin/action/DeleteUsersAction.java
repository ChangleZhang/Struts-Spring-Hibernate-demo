package com.challen.admin.action;

import com.opensymphony.xwork2.ActionSupport;
import com.challen.admin.dao.*;

public class DeleteUsersAction extends ActionSupport {
	private int id;
	private String tip;
	public String deleteAdmin() throws Exception{
		AdminDAO dao = new AdminDAO();
		boolean flag = dao.deleteUsers(id);
		if(flag){
			this.setTip(this.getText("delete.success"));
			return SUCCESS;
		}else{
			this.setTip(this.getText("delete.failed"));
			return ERROR;
		}
	}
	public void setTip(String tip){
		this.tip = tip;
	}
	public String getTip(){
		return tip;
	}
}
