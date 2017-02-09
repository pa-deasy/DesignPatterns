
public class Order {
	public void makeOrder(){
		//DarkRoast darkRoast = new DarkRoast("large");
		//System.out.println(darkRoast.getDescription() + ": " + darkRoast.cost());
		
		Beverage beverage =  new Milk(new Milk(new Mocha(new HomeBlend("large"))));
		//System.out.println(beverage.getDescription() + ": " + beverage.cost());
		System.out.println(beverage.getDescription() + ": " + beverage.cost());	
	}
	
	public static void main(String [] args){
		new Order().makeOrder();
	}

}
