public class TestCircleWithPrivateDataFields {

    public static void main(String[] args) {
        // create circle with radius 5
        Circle myCircle = new Circle(5.0);
        System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());

        // increase myCircle's radius by 10%
        myCircle.setRadius(myCircle.getRadius() * 1.1);
        System.out.println();
        System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());

        System.out.println("\nThe number of objects created is " + Circle.getNumberOfObjects());
    }
}