package headfirst.designpatterns.strategy.myStrategy.DuckExampleD2;

public class MallardDuck extends Duck {

    public MallardDuck(){
        flyingBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    public void display(){
        System.out.println("I am a Mallard Duck");
    }


    
}
