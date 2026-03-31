package headfirst.designpatterns.strategy.myStrategy.PaymentExampleD2;

public class PaymentTest {
    public static void main(String[] args) {
        // create a new shopping cart 
        ShoppingCart shoppingCart = new ShoppingCart(); 

        // select credit card payment - with card number
        shoppingCart.setPaymentMethod(new CreditCard("123412341234"));
        shoppingCart.checkout(100.0);


        // select paypal payment - with email 
        shoppingCart.setPaymentMethod(new Paypal("example123@gmail.com"));
        shoppingCart.checkout(120.0);
    }
    
}
