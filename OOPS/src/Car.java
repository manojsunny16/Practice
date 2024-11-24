class Car extends Vehicle {
    private int doors;

    public Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car Brand: " + getBrand());
        System.out.println("Speed: " + getSpeed() + " km/h");
        System.out.println("Number of Doors: " + doors);
    }
}
