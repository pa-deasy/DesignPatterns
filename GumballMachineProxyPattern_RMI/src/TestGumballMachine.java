import java.rmi.Naming;
import java.rmi.RemoteException;

import com.gumballcompany.gumballmachine.GumballMachine;
import com.gumballcompany.gumballmachine.GumballMonitor;

public class TestGumballMachine {

	public static void main(String[] args) {
		/*GumballMachine gumballMachine = new GumballMachine("Springfield", 10);
		GumballMonitor monitor = new GumballMonitor(gumballMachine);
		
		System.out.println(gumballMachine);
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
		
		monitor.report();*/
		
		try {
			GumballMachine gumballMachine = new GumballMachine("Springfield", 10);
			Naming.bind("Springfield", gumballMachine);
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}