package tmq.action;

import com.opensymphony.xwork2.ActionSupport;

public class TimerInterceptorAction extends ActionSupport {
	public String execute(){
		try{
			Thread.sleep(1000);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "success";
	}
}
