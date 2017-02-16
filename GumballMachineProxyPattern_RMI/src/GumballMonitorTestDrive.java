import java.rmi.Naming;

import com.gumballcompany.gumballmachine.GumballMachineRemote;
import com.gumballcompany.gumballmachine.GumballMonitor;

public class GumballMonitorTestDrive {
	public static void main(String[] args) {
		String[] location = {"rmi://127.0.0.1/Springfield"};
		GumballMonitor[] monitor = new GumballMonitor[location.length];
		
		for (int i=0;i < location.length; i++) {
			try {
				GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location[i]);
				monitor[i] = new GumballMonitor(machine);
				System.out.println(monitor[i]);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		for(int i=0; i < monitor.length; i++) {
			monitor[i].report();
		}
	}
}
