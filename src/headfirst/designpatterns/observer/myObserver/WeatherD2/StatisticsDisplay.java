package headfirst.designpatterns.observer.myObserver.WeatherD2;

public class StatisticsDisplay implements Observer, DisplayElement{
    private float temperature; 
    private float humidity;
    private float pressure; 
    private WeatherData weatherData; 


    public StatisticsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(){
    }
    
    public void display(){}

}
