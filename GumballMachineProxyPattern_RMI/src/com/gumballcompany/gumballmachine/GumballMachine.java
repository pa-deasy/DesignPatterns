package com.gumballcompany.gumballmachine;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.gumballcompany.gumballmachine.state.*;


public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote{
	
	private State soldOutState;
	private State noQuarterState;
	private State hasQuarterState;
	private State soldState; 
	private State winnerState;
	private State state;
	private int gumballCount;
	private String location;
	
	public GumballMachine(String location, int gumballCount) throws RemoteException{
		this.gumballCount = gumballCount;
		this.location = location;
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);
		
		if(gumballCount > 0){
			state = noQuarterState;
		}
		
		else {
			state = soldOutState;
		}	
	}
	
	public void insertQuarter(){
		state.insertQuarter();	
	}
	
	public void ejectQuarter(){
		state.ejectQuarter();
	}
	
	public void turnCrank(){
		state.turnCrank();
		state.dispenseGumball();
	}
	
	public void releaseGumball(int amount){
		System.out.println(amount + " gumballs roll out");
		if (gumballCount >= amount && amount !=0) {
			gumballCount = gumballCount - amount;
		}
		
		else if (gumballCount > 0 && amount != 0){
			gumballCount --;
		}
	}
	
	public int getGumballCount(){
		return gumballCount;
	}
	
	public String getLocation(){
		return location;
	}
	
	public void setGumballCount(int gumballCount){
		this.gumballCount = gumballCount;
	}
	
	void refill(int gumballCount) {
		this.gumballCount = gumballCount;
		state = noQuarterState;
	}

    public State getState() {
        return state;
    }
    
    public void setState(State state){
    	this.state = state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }
    
    public State getWinnerState() {
    	return winnerState;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + gumballCount + " gumball");
		if (gumballCount != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}

}
