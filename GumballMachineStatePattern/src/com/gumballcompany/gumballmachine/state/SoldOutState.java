package com.gumballcompany.gumballmachine.state;

import com.gumballcompany.gumballmachine.GumballMachine;

public class SoldOutState implements State {
	GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballMachine){
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		System.out.println("Sorry but the machine is out of gumballs");
	}

	public void ejectQuarter() {
		System.out.println("Sorry but the machine is out of gumballs");
	}

	public void turnCrank() {
		System.out.println("Sorry but the machine is out of gumballs");
	}

	public void dispenseGumball() {
		System.out.println("No gumball dispensed");
	}

}
