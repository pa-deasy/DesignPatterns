

public class Mocha extends CondimentDecorator{
	private Beverage beverage;
	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}
	
	public String getDescription() {		
		return beverage.getDescription() + ", Mocha";
	}
	
	public double cost(){
		this.size = beverage.getSize();
		Double cost = 0.0;
		if(size == "small"){
			cost = .2;
		}
		else if(size == "medium"){
			cost = .3;
		}
		else if(size == "large"){
			cost = .4;
		}		
		System.out.println("cost mocha " + beverage.cost());
		return beverage.cost() + cost;
	}
}
