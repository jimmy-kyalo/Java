public class TestCircleWithStaticMembers {

    public static void main(String[] args) {
        System.out.println("Before creating objects");
        System.out.println("The number of circle objects is " + Circle.numberOfObjects);

        // create c1
        Circle c1 = new Circle();

        // display c1 before c2 is created
        System.out.println("\nAfter creating c1");
        System.out.println(
                "c1: radius (" + c1.radius + ") and number of circle objects (" + Circle.numberOfObjects + ")");

        // create c2
        Circle c2 = new Circle(5);

        // modify c1
        c1.radius = 9;

        // display c1 and c2 after c2 was created
        System.out.println("\nAfter creating c2 and modifying c1");
        System.out.println(
                "c1: radius (" + c1.radius + ") and number of circle objects (" + Circle.numberOfObjects + ")");
        System.out.println(
                "c2: radius (" + c2.radius + ") and number of circle objects (" + Circle.numberOfObjects + ")");

    }
}