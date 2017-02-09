package com.patrickscompany.display;

import com.patrickscompany.observer.Observer;
import com.patrickscompany.subject.Subject;

public class StatisticsDisplay implements DisplayElement, Observer {
	private float temperature;
	private float humidity;
	private float pressure;	
	private Subject weatherData;
	
	public StatisticsDisplay(Subject weatherData)
	{
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void display() {
		System.out.println("Statistics: " + temperature + "F degrees and " + humidity + "% humidity");
	}

	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;	
		display();
	}
}
