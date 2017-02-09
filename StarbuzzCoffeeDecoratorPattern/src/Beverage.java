

import java.util.ArrayList;

public abstract class Beverage {
	public String size;
	public String description = "Unknown beverage";
	
	public String getDescription(){		
		return description;
	}
	
	public String getSize(){
		return size;
	}
	
	abstract double cost();
}
