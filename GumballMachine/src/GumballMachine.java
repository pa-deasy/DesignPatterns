
public class GumballMachine {
	
	private static final int SOLD_OUT = 0;
	private static final int NO_QUARTER = 1;
	private static final int HAS_QUARTER = 2;
	private static final int SOLD = 3;
	private int state;
	private int gumballCount;
	
	public GumballMachine(int gumballCount) {
		this.gumballCount = gumballCount;
		if(gumballCount > 0){
			state = NO_QUARTER;
		}
		
		else {
			state = SOLD_OUT;
		}	
	}
	
	public void insertQuarter(){
		if(state == HAS_QUARTER){
			System.out.println("There is already a quater inserted");
		}
		
		else if(state == SOLD){
			System.out.println("Please wait, machine is dispensing a gumball");
		}
		
		else if(state == SOLD_OUT){
			System.out.println("Sorry but the machine is out of gumballs");
		}
		
		else if(state == NO_QUARTER){
			System.out.println("Quater inserted");
			state = HAS_QUARTER;
		}	
	}
	
	public void ejectQuarter(){
		if(state == NO_QUARTER){
			System.out.println("No quater to eject");
		}
		
		else if(state == SOLD){
			System.out.println("Please wait, machine is dispensing a gumball");
		}
		
		else if(state == SOLD_OUT){
			System.out.println("Sorry but the machine is out of gumballs");
		}
		
		else if(state == HAS_QUARTER){
			System.out.println("Quater is ejected");
			state = NO_QUARTER;
		}
	}
	
	public void turnCrank(){
		if(state == NO_QUARTER){
			System.out.println("Please insert a quater");
		}
		
		else if(state == SOLD){
			System.out.println("Please wait, machine is dispensing a gumball");
		}
		
		else if(state == SOLD_OUT){
			System.out.println("Sorry but the machine is out of gumballs");
		}
		
		else if(state == HAS_QUARTER){
			System.out.println("Retrieving gumball");
			state = SOLD;
		}
	}
	
	public void dispenseGumball(){
		if(state == NO_QUARTER){
			System.out.println("Please insert a quater");
		}
		
		else if(state == HAS_QUARTER){
			System.out.println("No gumball dispensed");
		}
		
		else if(state == SOLD_OUT){
			System.out.println("No gumball dispensed");
		}
		
		else if(state == SOLD){
			System.out.println("A gumball comes rolling out the slot");
			gumballCount --;
			if(gumballCount <= 0) {
				state = SOLD_OUT;
			}	
			else {
				state = NO_QUARTER;
			}
		}
	}
	
	public String toString(){
		String string = "\nMighty Gumball, Inc. \nJava-enabled Standing Gumball Model #2004 \n";
		string += "Inventory: " + gumballCount + " gumballs \n";
		string += "Machine state is: " + Integer.toString(state);
		return string;
	}

}
