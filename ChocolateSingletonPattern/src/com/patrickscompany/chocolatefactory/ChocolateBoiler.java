package com.patrickscompany.chocolatefactory;


public class ChocolateBoiler {
	private static ChocolateBoiler boiler;
	private boolean empty = true;
	private boolean boiled = false;
	
	private ChocolateBoiler(){
	}
	
	public static synchronized ChocolateBoiler getChocolateBoiler(){
		if(boiler == null){
			boiler = new ChocolateBoiler();
		}
		return boiler;
	}
	
	public void fill(){
		if(isEmpty()){
			empty = false;
			boiled = false;
			System.out.println("Filling the tank");
		}
		else {
			System.out.println("Boiler is not empty");
		}
			
	}
	
	public void boil(){
		if(!isEmpty() && !isBoiled()){
			boiled = true;
			System.out.println("Boiling the tank");
		}
	}
	
	public void drain(){
		if(!isEmpty() && isBoiled()){
			empty = true;
			System.out.println("Draining the tank");
		}
	}
	
	public boolean isEmpty(){
		return empty;
	}
	
	public boolean isBoiled(){
		return boiled;
	}
	
	

}
