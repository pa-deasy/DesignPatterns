import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent{
	List<MenuComponent> components;
	String name;
	String description;
	Iterator iterator = null;
	
	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
		components = new ArrayList<MenuComponent>();
	}
	
	public void add(MenuComponent menuComponent) {
		components.add(menuComponent);
	}
	
	public void remove(MenuComponent menuComponent) {
		components.remove(menuComponent);
	}
	
	public MenuComponent getChild(int i) {
		return components.get(i);
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}
	
	public void print() {
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("---------------------");
		
		Iterator iterator = components.iterator();
		while (iterator.hasNext()) {
			MenuComponent menuComponent = (MenuComponent)iterator.next();
			menuComponent.print();
		}
	}
	
	public Iterator createIterator(){
		if (iterator == null){
			iterator = new CompositeIterator(components.iterator());
		}
		
		return iterator;		
	}
}
