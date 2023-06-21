public class CastingDemo {

    public static void main(String[] args) {
        // create and initialise two objects
        Object object1 = new Circle(1);
        Object object2 = new Rectangle(1, 1);

        // display circle and rectangle
        displayObject(object1);
        displayObject(object2);
    }

    // method for displaying an object
    public static void displayObject(Object object) {
        if (object instanceof Circle) {
            System.out.println("The circle area is " + ((Circle) object).getArea());
            System.out.println("The circle diameter is " + ((Circle) object).getDiameter());
        } else if (object instanceof Rectangle) {
            System.out.println("The rectangle area is " + ((Rectangle) object).getArea());
        }
    }
}