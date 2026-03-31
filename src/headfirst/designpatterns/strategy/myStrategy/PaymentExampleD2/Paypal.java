package headfirst.designpatterns.strategy.myStrategy.PaymentExampleD2;

public class Paypal implements PaymentMethod {
    String email;

    public Paypal(String email){
        this.email = email;
    }

    public void pay(double ammount){
        System.out.printf("Paid with paypal(%s) - %f\n", email, ammount);
    }
}
