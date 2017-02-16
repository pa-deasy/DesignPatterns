package com.gumballcompany.gumballmachine.state;

public interface State {
	public void insertQuarter();
	public void ejectQuarter();
	public void turnCrank();
	public void dispenseGumball();
}
