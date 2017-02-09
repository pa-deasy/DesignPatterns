package com.patricksbusiness.pizzastore;

import com.patricksbusiness.pizzastore.pizza.*;

public class PizzaFactory {
	
	public Pizza createPizza(String type){
		Pizza pizza = null;
		
		if (type.equals("cheese")) {
			pizza = new CheesePizza(null);
		} 
		else if (type.equals("greek")) {
			pizza = new GreekPizza();
		} 
		else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza(null);
		} 
		else if (type.equals("clam")) {
			pizza = new ClamPizza(null);
		} 
		else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}
		
		return pizza;
	}

}
