public class TestCircleWithCustomException {

    public static void main(String[] args) {
        try {
            new CircleWithCustomException(5);
            new CircleWithCustomException(-5);
            new CircleWithCustomException(0);
        } catch (InvalidRadiusException e) {
            System.out.println(e);
        }
        System.out.println("Number of objects created: " + CircleWithCustomException.getNumOfObjects());
    }
}

class CircleWithCustomException {
    private double radius;
    private static int numOfObjects = 0;

    public CircleWithCustomException() throws InvalidRadiusException {
        this(1.0);
    }

    public CircleWithCustomException(double newRadius) throws InvalidRadiusException {
        setRadius(newRadius);
        numOfObjects++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) throws InvalidRadiusException {
        if (newRadius >= 0)
            radius = newRadius;
        else
            throw new InvalidRadiusException(newRadius);
    }

    public static int getNumOfObjects() {
        return numOfObjects;
    }

    public double findArea() {
        return radius * radius * 3.15149;
    }
}