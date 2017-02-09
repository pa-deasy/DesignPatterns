package com.patricksbusiness.pizzastore;

import com.patricksbusiness.pizzastore.ingredients.cheese.*;
import com.patricksbusiness.pizzastore.ingredients.clams.*;
import com.patricksbusiness.pizzastore.ingredients.dough.*;
import com.patricksbusiness.pizzastore.ingredients.pepperoni.*;
import com.patricksbusiness.pizzastore.ingredients.sauce.*;
import com.patricksbusiness.pizzastore.ingredients.veggies.*;

public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
}
