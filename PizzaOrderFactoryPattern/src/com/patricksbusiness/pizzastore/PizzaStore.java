package com.patricksbusiness.pizzastore;

import com.patricksbusiness.pizzastore.pizza.*;

public abstract class PizzaStore {
	PizzaFactory pizzaFactory;
	
	public Pizza orderPizza(String type){
		Pizza pizza;
		
		pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	abstract Pizza createPizza(String type);
}
