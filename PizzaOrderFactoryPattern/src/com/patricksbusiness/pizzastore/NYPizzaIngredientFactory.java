package com.patricksbusiness.pizzastore;

import com.patricksbusiness.pizzastore.ingredients.cheese.*;
import com.patricksbusiness.pizzastore.ingredients.clams.*;
import com.patricksbusiness.pizzastore.ingredients.dough.*;
import com.patricksbusiness.pizzastore.ingredients.pepperoni.*;
import com.patricksbusiness.pizzastore.ingredients.sauce.*;
import com.patricksbusiness.pizzastore.ingredients.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		return new ThinCrustDough();
	}
	
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
	
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
	
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}
	
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FreshClams();
	}
}
