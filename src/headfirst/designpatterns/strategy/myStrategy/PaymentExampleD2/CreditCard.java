package headfirst.designpatterns.strategy.myStrategy.PaymentExampleD2;

public class CreditCard implements PaymentMethod {
    public String cardNumber;

    public CreditCard(String cardNumber){
        this.cardNumber = cardNumber;
    }

    public void pay(double ammount){
        System.out.printf("Paid with credit card(%s) - %f\n", cardNumber, ammount);
    }
}
