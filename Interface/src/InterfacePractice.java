public class InterfacePractice {
    public static void main(String[] args) {
        // Create individual shapes
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 7);
        Shape triangle = new Triangle(3, 4, 5);

        Shape[] shapes = {circle, rectangle, triangle};


        System.out.println("Shapes Summary:");
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Shape " + (i + 1) + " Details:");
            shapes[i].displayDetails();
        }

        // Compare two shapes and display the larger one
        System.out.println("Comparing Circle and Rectangle:");
        Shape largerShape = Shape.compareAreas(circle, rectangle);
        System.out.println("Larger Shape:");
        largerShape.displayDetails();

        // Display details of a specific shape (e.g., triangle)
        System.out.println("Details of a Specific Shape (Triangle):");
        triangle.displayDetails();
    }
}