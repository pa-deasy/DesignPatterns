import java.util.Iterator;

public class MenuItem extends MenuComponent{
	String name;
	String description;
	boolean vegetarian;
	double price;
	public MenuItem(String name, String description, boolean vegetarian, double price)
	{
		name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}
	
	public double getPrice() {
		return price;
	}
	public boolean isVegetarian() {
		return vegetarian;
	}
	
	public void print(){
		System.out.print(" " + getName());
		if (isVegetarian()) {
			System.out.print("(v)");
		}
		System.out.println(", " + getPrice());
		System.out.println(" -- " + getDescription());
	}
	
	public Iterator createIterator(){
		return new NullIterator();
	}
}
