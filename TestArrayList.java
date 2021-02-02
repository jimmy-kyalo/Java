import java.util.ArrayList;

public class TestArrayList {

    public static void main(String[] args) {
        // create a list to store cities
        ArrayList<String> cityList = new ArrayList<>();

        // add some cities in the list
        cityList.add("London");
        cityList.add("Denver");
        cityList.add("Paris");
        cityList.add("Miami");
        cityList.add("Seoul");
        cityList.add("Tokyo");

        System.out.println("List size? " + cityList.size());
        System.out.println("Is Miami in the list? " + cityList.contains("Miami"));
        System.out.println("The location of Denver in the list? " + cityList.indexOf("Denver"));
        System.out.println("Is the list empty? " + cityList.isEmpty());

        cityList.add(2, "Xian");
        cityList.remove("Miami");
        cityList.remove(1);

        // display the contents in the list
        System.out.println(cityList.toString());

        // display contents on the list in reverse order
        for (int i = cityList.size() - 1; i >= 0; i--)
            System.out.print(cityList.get(i) + " ");
        System.out.println();

        // create a list to store two circles
        ArrayList<Circle> list = new ArrayList<>();

        // add two circles
        list.add(new Circle(2));
        list.add(new Circle(3));

        // display area of the first circle in the list
        System.out.println("The area of the circle? " + list.get(0).getArea());
    }
}