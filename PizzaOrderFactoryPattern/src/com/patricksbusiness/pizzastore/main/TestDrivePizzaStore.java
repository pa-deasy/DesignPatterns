package com.patricksbusiness.pizzastore.main;

import com.patricksbusiness.pizzastore.*;
import com.patricksbusiness.pizzastore.pizza.Pizza;

public class TestDrivePizzaStore {

	public void test(){
		PizzaStore nyStylePizzaStore = new NYStylePizzaStore();
		Pizza pizza = nyStylePizzaStore.orderPizza("cheese");
		System.out.println("Ethan ordered: " + pizza.getName() + "\n");
		
		/*PizzaStore chicagoStylePizzaStore = new ChicagoStylePizzaStore();
		pizza = chicagoStylePizzaStore.orderPizza("cheese");
		System.out.println("Joel ordered: " + pizza.getName() + "\n");*/
	}
	
	public static void main(String [] args){
		new TestDrivePizzaStore().test();
	}
}
