package com.gumballcompany.gumballmachine.state;

import java.util.Random;

import com.gumballcompany.gumballmachine.GumballMachine;

public class HasQuarterState implements State {
	transient GumballMachine gumballMachine;
	Random randomWinner = new Random(System.currentTimeMillis());
	
	public HasQuarterState(GumballMachine gumballMachine){
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		System.out.println("There is already a quater inserted");
	}

	public void ejectQuarter() {
		System.out.println("Quarter is ejected");
		gumballMachine.getNoQuarterState();
	}

	public void turnCrank() {
		System.out.println("Retrieving gumball");
		
		int winner = randomWinner.nextInt(10);
		if ((winner == 0) && (gumballMachine.getGumballCount() > 1)) {
			gumballMachine.setState(gumballMachine.getWinnerState());
		} else {
			gumballMachine.setState(gumballMachine.getSoldState());
		}
	}

	public void dispenseGumball() {
		System.out.println("No gumball dispensed");
	}

}
