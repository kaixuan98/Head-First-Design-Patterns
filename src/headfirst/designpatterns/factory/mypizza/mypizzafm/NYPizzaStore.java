package headfirst.designpatterns.factory.mypizza.mypizzafm;

public class NYPizzaStore extends PizzaStore {
    
    public Pizza createPizza(String item){

        if(item.equals("cheese")){
            return new NYCheesePizza();
        }else if(item.equals("veggie")){
            return new NYVeggiePizza();
        }else if(item.equals("clam")){
            return new NYClamPizza();
        }else if(item.equals("pepperoni")){
            return new NYPepperoniPizza();
        }else return null;
        
    }
}
