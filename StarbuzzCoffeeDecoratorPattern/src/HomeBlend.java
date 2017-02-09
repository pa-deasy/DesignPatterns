

public class HomeBlend extends Beverage {
	public HomeBlend(String s){
		description = "Home blend";
		size = s;
	}

	public double cost() {
		double cost = 3;
		switch(size){
		case "small":
			cost = 3;
		case "medium":
			cost = 4;
		case "large":
			cost = 5;				
		}
		System.out.println("cost home blend " + cost);
		return cost;
	}
}
