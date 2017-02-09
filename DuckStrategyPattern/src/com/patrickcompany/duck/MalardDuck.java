package com.patrickcompany.duck;

import com.patrickcompany.flybehavior.*;

public class MalardDuck extends Duck{
	public MalardDuck(){
		flyBehavior = new FlyWithWings();
	}
	
	public void display(){
		System.out.println("Malard Duck");
	}
	

}
