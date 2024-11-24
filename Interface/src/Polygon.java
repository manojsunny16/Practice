interface Polygon extends Shape {
    int getSides();

    @Override
    default void displayDetails() {
        System.out.println("Polygon with " + getSides() + " sides:");
        Shape.super.displayDetails();
    }
}
