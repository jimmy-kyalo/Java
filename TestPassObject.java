public class TestPassObject {

    public static void main(String[] args) {
        Circle myCircle = new Circle(1);

        // print areas for radius 1 - 5
        int n = 5;
        printAreas(myCircle, n);

        // see myCircle, radius and times
        System.out.println("\n" + "Radius is " + myCircle.getRadius());
        System.out.println("n is " + n);
    }

    // print a table of areas for radius
    public static void printAreas(Circle c, int times) {
        System.out.println("Radius \t\tArea");
        while (times >= 1) {
            System.out.println(c.getRadius() + "\t\t" + c.getArea());
            c.setRadius(c.getRadius() + 1);
            times--;
        }
    }
}