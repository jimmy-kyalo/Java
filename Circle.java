public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getDiameter() {
        return radius * 2;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public void printCircle() {
        System.out.println("The circle is created " + super.getDateCreated() + " and the radius is " + radius);
    }

    // override the toString method defined in the superclass
    @Override
    public String toString() {
        return super.toString() + "\nradius is " + radius;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Circle)
            return radius == ((Circle) o).radius;
        else
            return false;
    }
}