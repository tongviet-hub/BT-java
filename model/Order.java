package model;

import java.util.ArrayList;
import java.util.List;
import payment.PaymentMethod;
public class Order {
    private String orderId;
    private String customerName;
    private List<Product> products;
    private PaymentMethod paymentMethod;

    public Order(String orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotal() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void checkout() {
        double total = calculateTotal();
        System.out.println("Customer: " + customerName + ". Total: " + total);
        if (paymentMethod != null && paymentMethod.pay(total)) {
            System.out.println("Checkout completed successfully.");
        } else {
            System.out.println("Checkout failed.");
        }
    }
}