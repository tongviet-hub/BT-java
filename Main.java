
import model.ElectronicProduct;
import model.FoodProduct;
import model.Order;
import model.Product;

import payment.CashPayment;
import payment.CreditCardPayment;
import payment.MomoPayment;


public class Main {
    public static void main(String[] args) {

        Product phone = new ElectronicProduct("P001", "Smartphone", 200000, "IMEI123", 12);
        Product milk = new FoodProduct("P002", "Milk", 30000, "2025-12-31");


        Order order1 = new Order("O001", "Nguyễn Văn Anh");
        order1.addProduct(phone);
        order1.addProduct(milk);
        order1.setPaymentMethod(new CashPayment());
        order1.checkout();

        Order order2 = new Order("O002", "Nguyễn Văn Bình");
        order2.addProduct(phone);
        order2.addProduct(phone);
        order2.setPaymentMethod(new CreditCardPayment());
        order2.checkout();

        Order order3 = new Order("O003", "Nguyễn Văn C");
        order3.addProduct(milk);
        order3.setPaymentMethod(new MomoPayment());
        order3.checkout();

        System.out.println(phone.getDetails());
        System.out.println(milk.getDetails());
    }
}