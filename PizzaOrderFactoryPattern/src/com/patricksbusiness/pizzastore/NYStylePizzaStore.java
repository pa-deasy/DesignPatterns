package com.patricksbusiness.pizzastore;

import com.patricksbusiness.pizzastore.pizza.*;

public class NYStylePizzaStore extends PizzaStore{

	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		
		if (type.equals("cheese")) {
			pizza = new NYStyleCheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
		} 
		else if (type.equals("pepperoni")) {
			pizza = new NYStylePepperoniPizza(ingredientFactory);
			pizza.setName("New York Style Pepperoni Pizza");
		} 
		else if (type.equals("clam")) {
			pizza = new NYStyleClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
		} 
		else if (type.equals("veggie")) {
			pizza = new NYStyleVeggiePizza(ingredientFactory);
			pizza.setName("New York Style Veggie Pizza");
		}
		return pizza;
	}

}
