package payment;

public class MomoPayment implements PaymentMethod {
    @Override
    public boolean pay(double amount) {
        System.out.println("Payment successful with Momo: " + amount);
        return true;
    }
}