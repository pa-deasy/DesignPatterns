package com.patricksbusiness.pizzastore.pizza;

import java.util.ArrayList;

import com.patricksbusiness.pizzastore.ingredients.cheese.Cheese;
import com.patricksbusiness.pizzastore.ingredients.clams.Clams;
import com.patricksbusiness.pizzastore.ingredients.dough.*;
import com.patricksbusiness.pizzastore.ingredients.pepperoni.Pepperoni;
import com.patricksbusiness.pizzastore.ingredients.sauce.Sauce;
import com.patricksbusiness.pizzastore.ingredients.veggies.Veggies;

public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;

	public abstract void prepare();
	
	public void bake(){
		System.out.println("Bake for 25 minutes at 350");
	}
	
	public void cut(){
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	public void box(){
		System.out.println("Place pizza in official PizzaStore box");
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
}
