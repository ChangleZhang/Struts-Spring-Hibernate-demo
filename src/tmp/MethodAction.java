package tmp;

import com.opensymphony.xwork2.*;

public class MethodAction extends ActionSupport{
	public String execute(){
		System.out.println("0����ִ��");
		return "success";
	}
	
	public String execute1(){
		System.out.println("1����ִ��");
		return "success";
	}
	
	public String execute2(){
		System.out.println("2����ִ��");
		return "success";
	}
	
	public String execute3(){
		System.out.println("3����ִ��");
		return "success";
	}
}
