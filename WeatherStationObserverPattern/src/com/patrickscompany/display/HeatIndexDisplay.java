package com.patrickscompany.display;

import java.awt.event.TextEvent;

import com.patrickscompany.observer.Observer;
import com.patrickscompany.subject.Subject;
import com.patrickscompany.subject.WeatherData;

public class HeatIndexDisplay implements DisplayElement, Observer{
	private float temperature; 
	private float humidity;
	private float pressure;
	private float heatIndex;
	private Subject weatherData;
	
	public HeatIndexDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void display() {
		heatIndex = (float)(16.923 + 1.85212 * (Math.pow(10, -1)) * temperature + 5.37941 * humidity - 1.00254 * (Math.pow(10, -1)) * temperature * humidity + 9.41695 * (Math.pow(10, -3)) * (Math.pow(temperature, 2)) + 7.28898 * (Math.pow(10, -3)) * (Math.pow(humidity, 2)) + 3.45372 * (Math.pow(10, -4)) * (Math.pow(temperature, 2)) * humidity - 8.14971 * (Math.pow(10, -4)) * temperature * (Math.pow(humidity, 2)) + 1.02102 * (Math.pow(10, -5)) * (Math.pow(temperature, 2)) * (Math.pow(humidity, 2)) - 03.8646 * (Math.pow(10, -5)) * (Math.pow(temperature, 3)) + 2.91583 * (Math.pow(10, -5)) * (Math.pow(humidity, 3)) + 1.42721 * (Math.pow(10, -6)) * (Math.pow(temperature, 3)) * humidity + 1.97483 * (Math.pow(10, -7)) * temperature * (Math.pow(humidity, 3)) - 2.18429 * (Math.pow(10, -8)) * (Math.pow(temperature, 3)) * (Math.pow(humidity, 2)) + 8.43296 * (Math.pow(10, -10)) * (Math.pow(temperature, 2)) * (Math.pow(humidity, 3)) - 4.81975 * (Math.pow(10, -11)) * (Math.pow(temperature, 3)) * (Math.pow(humidity, 3)));
		System.out.println("Heat Index: " + heatIndex);
	}

	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}
}
