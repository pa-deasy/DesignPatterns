package com.gumballcompany.gumballmachine.state;

import com.gumballcompany.gumballmachine.GumballMachine;

public class NoQuarterState implements State {
	
	GumballMachine gumballMachine;
	
	public NoQuarterState(GumballMachine gumballMachine){
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		System.out.println("Quarter inserted");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	public void ejectQuarter() {
		System.out.println("No quarter to eject");
	}

	public void turnCrank() {
		System.out.println("Please insert a quarter");
	}

	public void dispenseGumball() {
		System.out.println("Please insert a quarter");
	}

}
