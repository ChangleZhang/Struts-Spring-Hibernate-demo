package tmq.action;

import com.opensymphony.xwork2.ActionSupport;
import java.util.regex.Pattern;

public class ValidateAction extends ActionSupport{
	private String name;
	private String pass;
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setPass(String pass){
		this.pass= pass;
	}
	
	public String getPass(){
		return pass;
	}
	
	public String execute(){
		return "success";
	}
	
	public void validate(){ //数据检验的validate()方法
		if(name==null || name.length() <6||name.length()>15)
			addFieldError("name","用户名长度不符合要求");
		if(pass==null || pass.length()<8 || pass.length()>20)
			addFieldError("pass","密码长度不符合要求");
	}
	
	public String login(){
		return SUCCESS;
	}
	
	public void validateLogin(){
		if(name!=null && !Pattern.matches("\\w{6,15}",name.trim() )){
			addFieldError("name","validateXXX()方法执行不合法");
		}
	}
}
