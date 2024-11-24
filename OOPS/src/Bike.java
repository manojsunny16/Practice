class Bike extends Vehicle {
    private int engineCapacity; // New feature: Engine capacity in cc

    public Bike(String brand, int speed, int engineCapacity) {
        super(brand, speed); // Call the superclass constructor
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity; // Getter for engineCapacity
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity; // Setter for engineCapacity
    }

    @Override
    public void displayInfo() {
        System.out.println("Bike Brand: " + getBrand());
        System.out.println("Speed: " + getSpeed() + " km/h");
        System.out.println("Engine Capacity: " + engineCapacity + " cc");
    }
}

