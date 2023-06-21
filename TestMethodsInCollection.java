import java.util.*;

public class TestMethodsInCollection {

    public static void main(String[] args) {
        // create set1
        Set<String> set1 = new HashSet<>();

        // populate set1
        set1.add("London");
        set1.add("Paris");
        set1.add("New York");
        set1.add("San Francisco");
        set1.add("Beijing");

        System.out.println("set1 is " + set1);
        System.out.println(set1.size() + " elements in set1");

        // delete string from set1
        set1.remove("London");
        System.out.println("\nset1 is " + set1);
        System.out.println(set1.size() + " elements in set1");

        // create set2
        Set<String> set2 = new HashSet<>();

        // populate set2
        set2.add("London");
        set2.add("Shanghai");
        set2.add("Paris");

        System.out.println("\nset2 is " + set2);
        System.out.println(set2.size() + " elements in set2");

        // contains element?
        System.out.println("\nIs Taipei in set2? " + set2.contains("Taipei"));

        // addAll
        set1.addAll(set2);
        System.out.println("\nAfter adding set2 to set1, set1 is " + set1);

        // removeAll
        set1.removeAll(set2);
        System.out.println("\nAfter removing set2 from set1, set1 is " + set1);

        // retainAll
        set1.retainAll(set2);
        System.out.println("\nAfter retaining common elements in set2 and set1, set1 is " + set1);
    }
}