package com.gumballcompany.gumballmachine;

public class GumballMonitor {
	GumballMachineRemote gumballMachine;
	
	public GumballMonitor(GumballMachineRemote gumballMachine){
		this.gumballMachine = gumballMachine;
	}
	
	public void report(){
		try {
			System.out.println("Gumball Machine: " + gumballMachine.getLocation());
			System.out.println("Current inventory: " + gumballMachine.getGumballCount() + " gumballs");
			System.out.println("Current state: " + gumballMachine.getState());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
