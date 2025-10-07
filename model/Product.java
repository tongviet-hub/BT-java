
package model;

public abstract class Product {
    protected String productId;
    protected String name;
    protected double price;
    protected String type;

    public Product(String productId, String name, double price, String type) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public abstract String getDetails();

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}