import java.util.*;

public class SortStringIgnoreCase {

    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Atlanta", "Savannah", "New York", "Dallas");
        // cities.sort((s1, s2) −> s1.compareToIgnoreCase(s2));
        cities.sort(String::compareToIgnoreCase);

        for (String s : cities) {
            System.out.print(s + " ");
        }
    }
}