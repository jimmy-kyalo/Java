import java.util.*;

public class TestLinkedHashSet {

    public static void main(String[] args) {
        // create hash set
        Set<String> set = new LinkedHashSet<>();

        // populate set
        set.add("London");
        set.add("Paris");
        set.add("Barcelona");
        set.add("Rome");
        set.add("Ibiza");
        set.add("Khartoum");

        System.out.println(set);

        for (String s : set) {
            System.out.print(s.toLowerCase() + " ");
        }
    }
}