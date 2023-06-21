import java.util.*;

public class SortStringByLength {

    public static void main(String[] args) {
        String[] cities = { "Atlanta", "Savannah", "New York", "Dallas" };
        // Arrays.sort(cities, new MyComparator());
        Arrays.sort(cities, Comparator.comparing(String::length));
        // Arrays.sort(cities,(s1, s2) −> s1.length() − s2.length());

        for (String s : cities) {
            System.out.print(s + " ");
        }
    }

    // public static class MyComparator implements Comparator<String> {
    // @Override
    // public int compare(String s1, String s2) {
    // return s1.length() - s2.length();
    // }
    // }
}
