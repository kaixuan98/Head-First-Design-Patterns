package headfirst.designpatterns.strategy.myStrategy.DuckExampleD2;

public class RubberDuck extends Duck {

    public RubberDuck(){
        flyingBehaviour = new FlyNoWay(); 
        quackBehaviour = new Squeak();
    }

    public void display(){
        System.out.println("I am a rubber duck"); 
    }
}
