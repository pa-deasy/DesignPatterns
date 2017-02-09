package com.patricksbusiness.pizzastore;

import com.patricksbusiness.pizzastore.pizza.*;

public class CaliStylePizzaStore extends PizzaStore{

	Pizza createPizza(String type) {
		if(type.equals("cheese")){
			return new caliStyleCheesePizza();
		}
		else if(type.equals("pepperoni")){
			return new caliStypePeppeoniPizza();
		}
		else if(type.equals("clam")){
			return new caliStyleClamPizza();
		}
		else if(type.equals("veggie")){
			return new caliStyleVegiPizza();
		}
		else{
			return null;
		}
	}

}
