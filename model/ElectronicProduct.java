
package model;
public class ElectronicProduct extends Product {
    private String imei;
    private int warrantyPeriod;

    public ElectronicProduct(String productId, String name, double price, String imei, int warrantyPeriod) {
        super(productId, name, price, "Electronic");
        this.imei = imei;
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public String getDetails() {
        return "Electronic Product: " +name +", Price: " + price +", IMEI: "+imei+", Warranty: " +warrantyPeriod+" months";
    }
}