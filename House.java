import java.util.Date;

public class House implements Cloneable, Comparable<House> {
    private int id;
    private double area;
    private Date whenBuilt;

    public House(int id, double area) {
        this.id = id;
        this.area = area;
        whenBuilt = new Date();
    }

    public int getId() {
        return id;
    }

    public double getArea() {
        return area;
    }

    public Date getWhenBuilt() {
        return whenBuilt;
    }

    // override the protected clone method defined in the Object class and
    // strengthen its accessibility
    @Override
    public Object clone() {
        try {
            return super.clone();
        }
        // this exception is thrown if House does not implement Cloneable
        catch (CloneNotSupportedException e) {
            return null;
        }
    }

    // implement the compateTo method defined in Comparable
    @Override
    public int compareTo(House o) {
        if (area > o.area)
            return 1;
        else if (area < o.area)
            return -1;
        else
            return 0;
    }

    public String toString() {
        return getWhenBuilt() + "\nHouse " + getId() + " Area " + getArea();
    }
}