package headfirst.designpatterns.observer.myObserver.WeatherD2;

public class WeatherTest {
    public static void main(String[] args) {
        // create a weather data
        WeatherData weatherData = new WeatherData();
        
        // create different displays
		CurrentConditionDisplay currentDisplay = 
			new CurrentConditionDisplay(weatherData);
		// StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        // new weather measurement is provided from weather station
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
		
        // new weather but removed forecast display
		weatherData.removeObserver(forecastDisplay);
		weatherData.setMeasurements(62, 90, 28.1f);
    }
}
