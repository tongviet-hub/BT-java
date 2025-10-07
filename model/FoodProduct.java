package model;

public class FoodProduct extends Product {
    private String expirationDate;

    public FoodProduct(String productId, String name, double price, String expirationDate) {
        super(productId, name, price, "Food");
        this.expirationDate = expirationDate;
    }

    @Override
    public String getDetails() {
        return "Food Product: " + name + ", Price: " + price + ", Expiration Date: " + expirationDate;
    }
}