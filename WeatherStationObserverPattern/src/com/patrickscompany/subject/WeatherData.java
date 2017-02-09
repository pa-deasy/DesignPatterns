package com.patrickscompany.subject;

import java.util.ArrayList;
import com.patrickscompany.observer.Observer;

public class WeatherData implements Subject{
	private float temperature;
	private float humidity;
	private float pressure;	
	
	ArrayList<Observer> observerList = new ArrayList<Observer>();

	public void registerObserver(Observer observer) {
		observerList.add(observer);
	}

	public void removeObserver(Observer observer) {
		int observerLocation = observerList.indexOf(observer);
		if (observerLocation >= 0) {
			observerList.remove(observer);		
		}
	}

	public void notifyObservers() {
		for(Observer observer : observerList){
			observer.update(temperature, humidity, pressure);
		}		
	}
	
	public float getTemperature(){
		return temperature;
	}
	
	public float getHumidity(){
		return humidity;
	}
	
	public float getPressure(){
		return pressure;
	}
	
	public void measurementsChanged(){
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	

}
