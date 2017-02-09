package com.patrickcompany.duck;

import com.patrickcompany.flybehavior.*;

public class Duck {
	FlyBehavior flyBehavior;
	private int id;
	private String name;
	private String type;
	private int size;
	private int age;
	private String sex;
	
	public void display(){
		System.out.println("Duck");
	}
	
	public void performFly(){
		flyBehavior.fly();
	}
	
	public void setBehavior(FlyBehavior flyBehavior){
		this.flyBehavior = flyBehavior;
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getType(){
		return type;
	}
	
	public void setType(String type){
		this.type = type;
	}
	
	public int getSize(){
		return size;
	}
	
	public void setSize(int size){
		this.size = size;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public String getSex(){
		return sex;
	}
	
	public void setSex(String sex){
		this.sex = sex;
	}
}
