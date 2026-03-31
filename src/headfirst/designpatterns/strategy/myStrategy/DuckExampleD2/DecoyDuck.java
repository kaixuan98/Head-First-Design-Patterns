package headfirst.designpatterns.strategy.myStrategy.DuckExampleD2;

public class DecoyDuck extends Duck{
    public DecoyDuck(){
        flyingBehaviour = new FlyNoWay();
        quackBehaviour = new Slience();
    }

    public void display(){
        System.out.println("I am a decoy duck");
    }
    
}
