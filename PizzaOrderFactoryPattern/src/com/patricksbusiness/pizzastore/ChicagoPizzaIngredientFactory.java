package com.patricksbusiness.pizzastore;

import com.patricksbusiness.pizzastore.ingredients.cheese.*;
import com.patricksbusiness.pizzastore.ingredients.clams.*;
import com.patricksbusiness.pizzastore.ingredients.dough.*;
import com.patricksbusiness.pizzastore.ingredients.pepperoni.*;
import com.patricksbusiness.pizzastore.ingredients.sauce.*;
import com.patricksbusiness.pizzastore.ingredients.veggies.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Veggies[] createVeggies() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pepperoni createPepperoni() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Clams createClam() {
		// TODO Auto-generated method stub
		return null;
	}

}
