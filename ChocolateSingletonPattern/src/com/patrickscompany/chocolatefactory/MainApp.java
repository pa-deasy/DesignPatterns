package com.patrickscompany.chocolatefactory;

public class MainApp {
	public void go(){
		ChocolateBoiler boiler = null;
		boiler = boiler.getChocolateBoiler();
		System.out.println("boiled: " + boiler.isBoiled());
		System.out.println("Empty: " + boiler.isEmpty());
		boiler.fill();
		boiler.boil();
		boiler.drain();
	}
	
	public static void main(String [] args){
		new MainApp().go();
	}

}
