package com.challen.admin.dao;

public class Admin {
	private String username;
	private String password;
	private String name;
	private int qx;
	
	public void setUserName(String username){
		this.username = username;
	}
	
	public String getUserName(){
		return username;
	}
	
	public void setPassWord(String password){
		this.password = password;
	}
	
	public String getPassWord(){
		return password;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setQx(int qx){
		this.qx = qx;
	}
	
	public int getQx(){
		return qx;
	}
}
