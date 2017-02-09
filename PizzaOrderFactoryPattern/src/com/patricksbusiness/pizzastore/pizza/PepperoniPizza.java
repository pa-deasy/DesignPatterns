package com.patricksbusiness.pizzastore.pizza;

import com.patricksbusiness.pizzastore.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
	
	public PepperoniPizza(PizzaIngredientFactory ingredientFactory){
		this.ingredientFactory = ingredientFactory;
	}

	public void prepare(){
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		pepperoni = ingredientFactory.createPepperoni();
	}
}
