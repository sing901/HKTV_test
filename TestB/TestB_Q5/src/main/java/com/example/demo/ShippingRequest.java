package TestB.TestB_Q5.src.main.java.com.example.demo;

public class ShippingRequest {
    private double length;
    private double width;
    private double height;
    private double weight;
    private String temperatureCondition;
    private int quantity;

    // Constructor
    public ShippingRequest(double length, double width, double height, double weight, String temperatureCondition, int quantity) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.temperatureCondition = temperatureCondition;
        this.quantity = quantity;
    }

    // Getters and setters
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
}
