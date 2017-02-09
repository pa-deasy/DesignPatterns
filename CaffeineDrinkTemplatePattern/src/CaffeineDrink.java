
public abstract class CaffeineDrink {
	final void prepareDrink(){
		boilWater();
		brew();
		pourInCup();
		addCondiments();
		if (CustomerWantsCondiments()) {
			addCondiments();
		}		
	}
	
	abstract void brew();
	
	abstract void addCondiments();
	
	public void boilWater(){
		System.out.println("Pouring water into cup");
	}
	
	public void pourInCup(){
		System.out.println("Pouring hot beverage in cup");
	}
	
	boolean CustomerWantsCondiments(){
		return true;
	}
}
