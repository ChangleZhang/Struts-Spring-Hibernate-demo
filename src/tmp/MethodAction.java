package tmp;

import com.opensymphony.xwork2.*;

public class MethodAction extends ActionSupport{
	public String execute(){
		System.out.println("0方法执行");
		return "success";
	}
	
	public String execute1(){
		System.out.println("1方法执行");
		return "success";
	}
	
	public String execute2(){
		System.out.println("2方法执行");
		return "success";
	}
	
	public String execute3(){
		System.out.println("3方法执行");
		return "success";
	}
}
