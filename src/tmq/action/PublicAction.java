package tmq.action;

import com.opensymphony.xwork2.ActionSupport;

public class PublicAction extends ActionSupport {
	private String title;
	private String content;
	public void setTitle(String title){
		this.title = title;
	}
	
	public String getTitle(){
		return title;
	}
	
	public void setContent(String content){
		this.content = content;
	}
	
	public String getContent(){
		return content;
	}
	
	public String execute(){
		return "success";
	}
}
