package com.patricksbusiness.pizzastore.pizza;

import com.patricksbusiness.pizzastore.PizzaIngredientFactory;

public class NYStylePepperoniPizza extends Pizza {
PizzaIngredientFactory ingredientFactory;
	
	public NYStylePepperoniPizza(PizzaIngredientFactory ingredientFactory){
		this.ingredientFactory = ingredientFactory;
	}

	public void prepare(){
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}
}
