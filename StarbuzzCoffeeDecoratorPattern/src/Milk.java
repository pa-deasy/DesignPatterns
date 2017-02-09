

public class Milk extends CondimentDecorator {
	private Beverage beverage;
	public Milk(Beverage beverage){
		this.beverage = beverage;
	}
	
	public String getDescription(){
		return beverage.getDescription() + ", Milk";
	}
	
	public double cost(){
		this.size = beverage.getSize();
		Double cost = 0.0;
		if(size == "small"){
			cost = .1;
		}
		else if(size == "medium"){
			cost = .2;
		}
		else if(size == "large"){
			cost = .4;
		}	
		System.out.println("cost milk " + beverage.cost());
		return beverage.cost() + cost;
	}
}
