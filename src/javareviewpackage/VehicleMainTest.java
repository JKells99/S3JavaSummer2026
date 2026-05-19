package javareviewpackage;

public class VehicleMainTest {

    static void main() {

        Vehicle vehicle = new Vehicle("Toyota", 20_000);

        System.out.println(vehicle);


        // Calculate price with tax
        vehicle.calculatePriceWithTax();


        vehicle.setVehiclePrice(25_000);
        System.out.println("Updated Vehicle: " + vehicle);

        vehicle.calculatePriceWithTax();



    }
}
