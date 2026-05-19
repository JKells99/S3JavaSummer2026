package javareviewpackage;


// Class
public class Vehicle {
    // Instance variables or fields
    private String vehicleMake;
    private int vehiclePrice;

    // Constructor
    public Vehicle(String vehicleMake, int vehiclePrice) {
        this.vehicleMake = vehicleMake;
        this.vehiclePrice = vehiclePrice;
    }
    // Getters and Setters
    public String getVehicleMake() {
        return vehicleMake;
    }
    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }
    public int getVehiclePrice() {
        return vehiclePrice;
    }
    public void setVehiclePrice(int vehiclePrice) {
        this.vehiclePrice = vehiclePrice;
    }
    // Methods
    public void calculatePriceWithTax() {
        // Local variable
        double tax = 0.15;
        double totalPrice = vehiclePrice + (vehiclePrice * tax);
        System.out.println("Total price with tax: $" + totalPrice);
    }

    // ToString()
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vehicle{");
        sb.append("vehicleMake='").append(vehicleMake).append('\'');
        sb.append(", vehiclePrice=").append(vehiclePrice);
        sb.append('}');
        return sb.toString();
    }
}
