package payment;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public boolean pay(double amount) {
        System.out.println("Payment successful with Credit Card: " + amount);
        return true;
    }
}