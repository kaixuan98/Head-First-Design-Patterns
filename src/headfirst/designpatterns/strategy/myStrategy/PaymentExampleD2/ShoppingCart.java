package headfirst.designpatterns.strategy.myStrategy.PaymentExampleD2;

public class ShoppingCart {
    PaymentMethod paymentMethod; 

    public ShoppingCart(){

    }

    public void setPaymentMethod(PaymentMethod pm){
        this.paymentMethod = pm;
    }

    public void checkout(double ammount){
        paymentMethod.pay(ammount);
    }
}
