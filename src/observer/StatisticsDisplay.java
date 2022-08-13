package observer;

import java.util.List;

public class StatisticsDisplay implements Observer, DisplayElement {
	private float count;
	private float temperature;
	private float avgTemperature;
	private float minTemperature;
	private float maxTemperature;
	private WeatherData weatherData;
	
	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
		
		this.minTemperature = Float.MAX_VALUE;
		this.maxTemperature = Float.MIN_VALUE;
	}
	
    public void update(){    	
    	temperature = weatherData.getTemperature();
    	avgTemperature = ((avgTemperature * count) + temperature) / (count + 1);
    	minTemperature = Math.min(temperature, minTemperature);
    	maxTemperature = Math.max(temperature, maxTemperature);
    	count++;
    	
    	display();
    }

    public void display(){
    	System.out.println("평군/최고/최저 온도 = " + avgTemperature + "/" + maxTemperature + "/" + minTemperature);
    }

}
