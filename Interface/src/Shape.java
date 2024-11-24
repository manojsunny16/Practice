
interface Shape {
    double calculateArea();

    double calculatePerimeter();

    default void displayDetails() {
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }

    // Static method for comparing areas
    static Shape compareAreas(Shape s1, Shape s2) {
        return s1.calculateArea() > s2.calculateArea() ? s1 : s2;
    }
}