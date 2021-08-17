import java.util.*;

public class TestHashSet {

    public static void main(String[] args) {
        // create a hashset
        Set<String> set = new HashSet<>();

        // add strings to the set
        set.add("London");
        set.add("Paris");
        set.add("New-York");
        set.add("Beijing");
        set.add("Tokyo");
        set.add("Nairobi");
        set.add("Cairo");
        set.add("New-York");

        System.out.println(set);

        // display elements in the hash set
        for (String s : set){
            System.out.print(s.toUpperCase()  + " ");
        }

        // using forEach method
        System.out.println();
        set.forEach(e -> System.out.print(e.toLowerCase() + " "));
    }
}