package act;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private String username;
	private String password;
	
	public String getUsername(){
		return username;
	}
	
	public void setUsername(String username){
		this.username = username;
	}
	
	public String getPassword(){
		return password;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public String checkLogin(){
		if(this.username.equals("admin") && this.password.equals("acc"))
			return SUCCESS;
		else
			return "login";
	}
	
	public String checkLoginUser(){
		ActionContext ac = ActionContext.getContext();
		ac.getSession().put("login", this.username);//吧登录名放在session中
		ac.getApplication().put("login", this.username);//把登录名放在application中
		
		return SUCCESS;
	}
}
