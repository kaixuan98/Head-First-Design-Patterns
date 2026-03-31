package headfirst.designpatterns.strategy.myStrategy.DuckExampleD2;

public abstract class Duck {
    FlyingBehaviour flyingBehaviour;
    QuackBehaviour quackBehaviour;


    public Duck(){
        // constructor
    }

    public void setFlyBehavior(FlyingBehaviour fb){
        this.flyingBehaviour = fb;
    }

    abstract void display();

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void performFly(){
        flyingBehaviour.fly();
    }

    
}
