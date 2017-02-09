package com.patricksbusiness.pizzastore.pizza;

import com.patricksbusiness.pizzastore.PizzaIngredientFactory;

public class NYStyleClamPizza extends Pizza {
PizzaIngredientFactory ingredientFactory;
	
	public NYStyleClamPizza(PizzaIngredientFactory ingredientFactory){
		this.ingredientFactory = ingredientFactory;
	}

	public void prepare(){
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}
}
