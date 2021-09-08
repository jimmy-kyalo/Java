import java.util.*;

public class TestTreeSet {

    public static void main(String[] args) {
        // create a hash set
        Set<String> set = new HashSet<>();

        // populate set
        set.add("London");
        set.add("Paris");
        set.add("Barcelona");
        set.add("Rome");
        set.add("Ibiza");
        set.add("Khartoum");

        // create tree set
        TreeSet<String> treeSet = new TreeSet<>(set);
        System.out.println("Sorted tree set: " + treeSet);

        // use methods in the SortedSet interface
        System.out.println("first(): " + treeSet.first());
        System.out.println("last(): " + treeSet.last());
        System.out.println("headSet(\"Khartoum\"): " + treeSet.headSet("Khartoum"));
        System.out.println("tailSet(\"Khartoum\"): " + treeSet.tailSet("Khartoum"));

        // Use the methods in NavigableSet interface
        System.out.println("lower(\"P\"): " + treeSet.lower("P"));
        System.out.println("higher(\"P\"): " + treeSet.higher("P"));
        System.out.println("floor(\"P\"): " + treeSet.floor("P"));
        System.out.println("ceiling(\"P\"): " + treeSet.ceiling("P"));
        System.out.println("pollFirst(): " + treeSet.pollFirst());
        System.out.println("pollLast(): " + treeSet.pollLast());
        System.out.println("New tree set: " + treeSet);
    }
}