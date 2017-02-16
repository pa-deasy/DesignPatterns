package com.gumballcompany.gumballmachine.state;

import com.gumballcompany.gumballmachine.GumballMachine;

public class WinnerState implements State {
	transient GumballMachine gumballMachine;
	
	public WinnerState(GumballMachine gumballMachine){
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		System.out.println("Please wait, machine is dispensing a gumball");
	}

	public void ejectQuarter() {
		System.out.println("Please wait, machine is dispensing a gumball");
	}

	public void turnCrank() {
		System.out.println("Please wait, machine is dispensing a gumball");
	}

	public void dispenseGumball() {
		System.out.println("You're a winner!");
		gumballMachine.releaseGumball(2);
		gumballMachine.setState(gumballMachine.getNoQuarterState());
		if(gumballMachine.getGumballCount() == 0){
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}
}
