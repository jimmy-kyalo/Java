public class PolymorphismDemo {

    public static void main(String[] args) {
        // display circle and rect properties
        displayObject(new Circle(1, "red", false));
        displayObject(new Rectangle(1, 1, "black", false));
    }

    // display geometric shape properties
    public static void displayObject(GeometricObject object) {
        System.out.println("Created on " + object.getDateCreated() + ". Color is " + object.getColor());
    }
}