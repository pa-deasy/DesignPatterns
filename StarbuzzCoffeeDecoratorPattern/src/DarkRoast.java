

public class DarkRoast extends Beverage{
	public DarkRoast(String s){
		description = "Dark roast";
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
		return cost;
	}
}
