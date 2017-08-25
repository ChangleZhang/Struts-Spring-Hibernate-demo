package com;

public class Book {
	private String name;
	private String price;
	
	public Book(){}
	
	public Book(String name,String price){
		this.name = name;
		this.price = price;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setPrice(String price){
		this.price = price;
	}
	
	public String getPrice(){
		return price;
	}
}
