package headfirst.designpatterns.observer.myObserver.MiniSubstackD2;

/**
 * Notes:
 * 
 * Subjects would need to provide 3 methods - register, remove and notify the observers.
 */
public interface Subject {
    public void registerObserver(Observer o); 

    public void removeObserver(Observer o);

    public void notifyObserver();
}
