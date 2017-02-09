package com.patricksbusiness.pizzastore;

import com.patricksbusiness.pizzastore.ingredients.*;
import com.patricksbusiness.pizzastore.ingredients.cheese.Cheese;
import com.patricksbusiness.pizzastore.ingredients.clams.Clams;
import com.patricksbusiness.pizzastore.ingredients.dough.Dough;
import com.patricksbusiness.pizzastore.ingredients.pepperoni.Pepperoni;
import com.patricksbusiness.pizzastore.ingredients.sauce.Sauce;
import com.patricksbusiness.pizzastore.ingredients.veggies.Veggies;

public class CaliPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return null;
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
