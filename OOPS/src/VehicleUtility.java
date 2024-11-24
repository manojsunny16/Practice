class VehicleUtility {
    public void showVehicleInfo(Vehicle vehicle) {
        vehicle.displayInfo();
    }

    public void showVehicleInfo(Vehicle[] vehicles) {
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            System.out.println();
        }
    }
}