public class TotalArea {

    public static void main(String[] args) {
        Circle[] circleArray = createCircleArray();
        printCircleArray(circleArray);
    }

    public static Circle[] createCircleArray() {
        // create an array of circle objects
        Circle[] circleArray = new Circle[5];

        for (int i = 0; i < circleArray.length; i++) {
            circleArray[i] = new Circle(Math.random() * 100);
        }

        return circleArray;
    }

    // print an array of circles and their total area
    public static void printCircleArray(Circle[] circleArray) {
        System.out.printf("%-30s%-15s\n", "Radius", "Area");
        for (int i = 0; i < circleArray.length; i++) {
            System.out.printf("%-30s%-15s\n", circleArray[i].getRadius(), circleArray[i].getArea());
        }

        System.out.println("_________________________________________________");

        // compute and display the result
        System.out.printf("%-30s%-15s\n", "The total area of circles is", sum(circleArray));
    }

    // add circle areas
    public static double sum(Circle[] circleArray) {
        // initialise sum
        double sum = 0;

        // add areas to sum
        for (int i = 0; i < circleArray.length; i++) {
            sum += circleArray[i].getArea();
        }

        return sum;
    }
}