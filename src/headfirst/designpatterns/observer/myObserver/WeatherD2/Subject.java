package headfirst.designpatterns.observer.myObserver.WeatherD2;

public interface Subject {
    // register an observer
    public void registerObserver(Observer o); 

    // remove an observer
    public void removeObserver(Observer o);

    // notify the observer
    public void notifyObserver();
}
