package member;

public class Member {
	private Integer id;
	private String username;
	private String password;
	public Member(){
	}
	
	public Member(String username,String password){
		this.username = username;
		this.password = password;
	}
	
	public Integer getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public void setUsername(String username){
		this.username = username;
	}
	
	public String getUsername(){
		return username;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public String getPassword(){
		return password;
	}
}
