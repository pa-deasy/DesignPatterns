package com.patrickscompany.display;

import com.patrickscompany.observer.Observer;
import com.patrickscompany.subject.Subject;

public class CurrentConditionsDisplay implements DisplayElement, Observer {
	private float temperature;
	private float humidity;
	private float pressure;	
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData)
	{
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
	}

	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();	
	}
}
