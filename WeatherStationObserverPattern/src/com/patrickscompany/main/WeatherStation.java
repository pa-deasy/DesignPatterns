package com.patrickscompany.main;

import com.patrickscompany.display.CurrentConditionsDisplay;
import com.patrickscompany.display.ForecastDisplay;
import com.patrickscompany.display.HeatIndexDisplay;
import com.patrickscompany.display.StatisticsDisplay;
import com.patrickscompany.subject.WeatherData;

public class WeatherStation {
	
	public void go(){
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
	
	public static void main(String [] args){
		WeatherStation weatherStation = new WeatherStation();
		weatherStation.go();
	}
}
 