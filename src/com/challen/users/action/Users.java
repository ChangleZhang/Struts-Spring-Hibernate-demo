package com.challen.users.action;

public class Users {
	private int id;
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
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return id;
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
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return username;
	}
	
	public void setNic(String nic){
		this.nic = nic;
	}
	public String getNic(){
		return nic;
	}
	
	public void setSex(String sex){
		this.sex = sex;
	}
	public String getSex(){
		return sex;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	public String getEmail(){
		return email;
	}
	
	public void setPhone(String phone){
		this.phone = phone;
	}
	public String getPhone(){
		return phone;
	}
	
	public void setSelfShow(String selfshow){
		this.selfshow = selfshow;
	}
	public String getSelfShow(){
		return selfshow;
	}
	
	public void setTip(String tip){
		this.tip = tip;
	}
	public String getTip(){
		return tip;
	}
}
