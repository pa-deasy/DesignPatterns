package com.patrickcompany.duck;

import com.patrickcompany.flybehavior.*;

public class RubberDuck extends Duck{
	public RubberDuck(){
		flyBehavior = new FlyNoWay();
	}
	
	public void display(){
		System.out.println("Rubber Duck");
	}
}
