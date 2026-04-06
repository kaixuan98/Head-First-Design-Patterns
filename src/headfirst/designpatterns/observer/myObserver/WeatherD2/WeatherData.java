package headfirst.designpatterns.observer.myObserver.WeatherD2;
import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private float temperature;
	private float humidity;
	private float pressure;

	private List<Observer> observers; 

    	
	public WeatherData() {
		observers = new ArrayList<Observer>(); 
	}

    public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}

    public void measurementsChanged() {
        // initial implementation - violates open close principle

        // float temp = getTemperature();
        // float humidity = getHumidity();
        // float pressure = getPressure();

        // currentConditionDisplay.update(temp, humidity, pressure);
        // statisticsDisplay.update(temp, humidity, pressure);
        // forecastDisplay.update(temp,humidity,pressure); 


		notifyObserver();
	}

	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}


	public void registerObserver(Observer o){
		observers.add(o);
	}

	public void removeObserver(Observer o){
		observers.remove(o);
	}

	public void notifyObserver(){
		for(Observer observer: observers){
			observer.update();
		}
	}
}
