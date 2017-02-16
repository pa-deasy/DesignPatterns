package com.gumballcompany.gumballmachine;

import java.rmi.Remote;
import java.rmi.RemoteException;

import com.gumballcompany.gumballmachine.state.State;

public interface GumballMachineRemote extends Remote{
	public String getLocation() throws RemoteException;
	public State getState() throws RemoteException;
	public int getGumballCount() throws RemoteException;

}
