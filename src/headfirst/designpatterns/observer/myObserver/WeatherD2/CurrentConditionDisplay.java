package headfirst.designpatterns.observer.myObserver.WeatherD2;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature; 
    private float humidity;
    private WeatherData weatherData; 


    public CurrentConditionDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(){
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity(); 
        display();
    }

    public void display(){
        System.out.println("Current conditions:" + temperature + "F degrees and " + humidity + "% humidity.");
    }
}
