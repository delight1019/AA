package observer;

public class ForecastDisplay implements Observer, DisplayElement {
	private float currentPressure = 29.92f;
	private float lastPressure;
	private WeatherData weatherData;
	
	public ForecastDisplay(WeatherData weatherData) {
		// TODO Auto-generated constructor stub
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		// Display ÄÚµå
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		lastPressure = currentPressure;
		currentPressure = weatherData.getPressure();
	}
	

}
