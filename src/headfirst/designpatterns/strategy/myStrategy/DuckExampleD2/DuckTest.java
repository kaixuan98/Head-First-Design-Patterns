package headfirst.designpatterns.strategy.myStrategy.DuckExampleD2;

public class DuckTest {
    public static void main(String[] args) {

        // ------- initial method ------------
        // Duck mallardDuck = new MallardDuck();
        // Duck rubberDuck = new RubberDuck(); 

        // mallardDuck.quack();
        // mallardDuck.fly();

        // rubberDuck.quack(); 
        // rubberDuck.fly();  but rubber duck cannot fly!!! This method is a little confusing for rubberduck

        // -------- strategy method ---------
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly(); 
        mallardDuck.performQuack();
        

        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        // rubber duck can now fly with rocket - object can set their own algo
        FlyingBehaviour flyWithRocket = new FlyWithRocket();
        rubberDuck.setFlyBehavior(flyWithRocket);
        rubberDuck.performFly(); 

        // New duck type!
        Duck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.performFly();
        decoyDuck.performQuack();


        
    }
}
