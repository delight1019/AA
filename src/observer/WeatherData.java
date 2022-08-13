package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
	private List<Observer> observers;
	private float humidity;
	private float temperature;
	private float pressure;

	public WeatherData() {
		observers = new ArrayList();
	}
	
    public void registerObserver(Observer o){
    	observers.add(o);
    }

    public void removeObserver(Observer o){
    	observers.remove(o);
    }

    public void notifyObservers(){
    	for (Observer observer : observers) {
    		observer.update();
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
    
    public void setMeasurements(float temperature, float humidity, float pressure) {
    	this.temperature = temperature;
    	this.humidity = humidity;
    	this.pressure = pressure;
    	
    	measurementChanged();
    }

    private void measurementChanged(){
    	notifyObservers();
    }
}
