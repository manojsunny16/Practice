public class OOPPractice {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", 180, 4); // Polymorphism: Vehicle reference holding a Car object
        Vehicle bike = new Bike("Yamaha", 120, 125);

        VehicleUtility utility = new VehicleUtility();
        System.out.println("Single Vehicle Info:");
        utility.showVehicleInfo(car);

        System.out.println("\nMultiple Vehicles Info:");
        Vehicle[] vehicles = {car, bike};
        utility.showVehicleInfo(vehicles);
    }
}