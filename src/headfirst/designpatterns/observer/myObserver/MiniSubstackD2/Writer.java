package headfirst.designpatterns.observer.myObserver.MiniSubstackD2;

import java.util.ArrayList;
import java.util.List;

public class Writer implements Subject{
    private List<Observer> observers; 
    private String name;
    private String latestTitle;

    public Writer(String name){
        this.name = name;
        observers = new ArrayList<Observer>(); 
    }


    public void publishArticle(String title){
        this.latestTitle = title;
        notifyObserver();
    }

    public String getLatestTitle(){
        return latestTitle;
    }


    public void registerObserver(Observer o){
        observers.add(o);
    }

    public void removeObserver(Observer o){
        observers.remove(o);
    }

    public void notifyObserver(){
        for (Observer observer: observers){
            observer.update();
        }
    }
    
}
