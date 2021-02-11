import java.util.*;

public class TestLoan {

    public static void main(String[] args) {
        // Loan[] list = { new Loan(5.5, 10, 2323), new Loan(5, 10, 1000) };
        // Arrays.sort(list, Comparator.comparing(Loan::getLoanAmount).reversed());
        // .thenComparing(Loan::getAnnualInterestRate)

        // List<String> list1 = Arrays.asList("yellow", "red", "green", "blue");
        // List<String> list2 = Arrays.asList("yellow", "red", "green", "blue");
        // List<String> list3 = Arrays.asList("yellow", "red", "green", "blue");
        // List<String> list4 = Arrays.asList("yellow", "red", "green", "blue");
        // Collections.shuffle(list1, new Random(20));
        // Collections.shuffle(list2, new Random(20));
        // System.out.println(list1);
        // System.out.println(list2);
        // Collections.reverse(list3);
        // System.out.println(list3);
        // Collections.shuffle(list4);
        // System.out.println(list4);

        // Collection<String> collection = Arrays.asList("red", "green", "blue");
        // System.out.println(Collections.max(collection));
        // System.out.println(Collections.max(collection,
        // Comparator.comparing(String::length)));

        List<String> list = Arrays.asList("yellow", "red", "green", "blue");
        Collections.reverse(list);
        System.out.println(list);
        List<String> list1 = Arrays.asList("yellow", "red", "green", "blue");
        List<String> list2 = Arrays.asList("white", "black");
        Collections.copy(list1, list2);
        System.out.println(list1);
        Collection<String> c1 = Arrays.asList("red", "cyan");
        Collection<String> c2 = Arrays.asList("red", "blue");
        Collection<String> c3 = Arrays.asList("pink", "tan");
        System.out.println(Collections.disjoint(c1, c2));
        System.out.println(Collections.disjoint(c1, c3));
        Collection<String> collection = Arrays.asList("red", "cyan", "red");
        System.out.println(Collections.frequency(collection, "red"));

    }
}