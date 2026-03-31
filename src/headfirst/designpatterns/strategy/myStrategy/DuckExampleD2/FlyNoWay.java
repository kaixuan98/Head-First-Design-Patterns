package headfirst.designpatterns.strategy.myStrategy.DuckExampleD2;

public class FlyNoWay  implements FlyingBehaviour{
    public void fly(){
        System.out.println("I cannot fly");
    }
}
